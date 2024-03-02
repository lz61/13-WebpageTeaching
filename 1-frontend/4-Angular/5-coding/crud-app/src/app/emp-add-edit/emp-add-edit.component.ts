import { Component } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-emp-add-edit',
  templateUrl: './emp-add-edit.component.html',
  styleUrls: ['./emp-add-edit.component.scss']
})
export class EmpAddEditComponent {
  empForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private employeeService: EmployeeService) { 
    this.empForm = this.formBuilder.group({
      firstname:'',
      lastname: '',
      email:'',
      phone:'',
    })
  }

  formSubmit(){
    console.log(this.empForm.value);
    this.employeeService.addEmployee(this.empForm.value).subscribe( (response)=> {
      console.log(response);
    } );
  }

}


