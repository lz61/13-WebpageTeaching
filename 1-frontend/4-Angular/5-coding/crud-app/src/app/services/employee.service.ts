import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient:HttpClient) { }

  addEmployee(data:any){
    return this.httpClient.post('http://localhost:3000/employees',data);
  }
}
