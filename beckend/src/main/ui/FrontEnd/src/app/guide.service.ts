import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Guide} from "./guide";

@Injectable({
  providedIn: 'root'
})
export class GuideService {

  private baseURL = "http://localhost:8080/api/guide";
  constructor(private httpClient: HttpClient) { }

  getGuidesList(): Observable<Guide[]>{
    return this.httpClient.get<Guide[]>(`${this.baseURL}`);
  }

  createGuide(guide: Guide): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, guide);
  }

  getGuideById(id: number | undefined): Observable<Guide>{
     return this.httpClient.get<Guide>(`${this.baseURL}/${id}`);
  }

  updateGuide(id: number | undefined, guide: Guide | undefined): Observable<Object>{
  return this.httpClient.put(`${this.baseURL}/${id}`, guide);
  }
}



