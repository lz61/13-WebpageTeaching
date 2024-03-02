import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpClient: HttpClient) { }

  addEmployee(data: any) {
    // 三部分
    // poest方法
    // 路径: http://localhost:8080/mployees
    // data: json字符块, firstname,lastname,email,phone
    return this.httpClient.post('http://localhost:8080/employees', data);
  }
}
