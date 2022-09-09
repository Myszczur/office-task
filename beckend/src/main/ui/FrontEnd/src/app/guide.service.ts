import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Guide} from "./guide";

@Injectable({
  providedIn: 'root'
})
export class GuideService {

  private baseURL = "http://localhost:8080/api/guides";
  constructor(private httpClient: HttpClient) { }

  getGuidesList(): Observable<Guide[]>{
    return this.httpClient.get<Guide[]>(`${this.baseURL}`);
  }
}

