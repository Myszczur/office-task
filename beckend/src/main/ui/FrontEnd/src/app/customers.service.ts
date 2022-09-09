import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Customers} from "./customers";

@Injectable({
  providedIn: 'root'
})
export class CustomersService {
  private baseURL = '';

  constructor(private http: HttpClient) {
  }

  public getCustomers(): Observable<Customers[]> {
    return this.http.get<Customers[]>(`${this.baseURL}`);
  }

  public addCustomer(customers: Customers): Observable<Customers> {
    return this.http.post<Customers>(`${this.baseURL}`, customers);
  }

  public updateCustomer(customers: Customers): Observable<Customers> {
    return this.http.put<Customers>(`${this.baseURL}`, customers);
  }

  public deleteCustomer(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseURL}/${id}`);
  }

  public getCustomerById(id: number): Observable<Customers> {
    return this.http.get<Customers>(`${this.baseURL}/${id}`);
  }
}
