import { Injectable } from '@angular/core';
import { HttpClient , HttpRequest, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL = 'http://localhost:8082/api/commande/';

@Injectable({
  providedIn: 'root'
})
export class CommandeService {

  constructor(private http: HttpClient) { }

  //lister toutes les commandes
  getAllCommandes(): Observable<any> {
    return this.http.get(API_URL+'list');
  }

  //ajouter une commande
  ajouterCommande(data): Observable<any> {
    return this.http.post(API_URL+'ajouter', data);
  
  }

//modifier commande
  updateComm(num, data): Observable<any> {
    return this.http.put(`${API_URL}edit/${num}`, data);
  }

  //retirer
  deleteComm(id): Observable<any> {
    return this.http.delete(`${API_URL}delete/${id}`);
  }


}
