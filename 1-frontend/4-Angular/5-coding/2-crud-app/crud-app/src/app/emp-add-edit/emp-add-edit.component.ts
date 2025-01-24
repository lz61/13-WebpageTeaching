import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-emp-add-edit',
  templateUrl: './emp-add-edit.component.html',
  styleUrls: ['./emp-add-edit.component.scss']
})
export class EmpAddEditComponent {
  empForm: FormGroup;
  
  constructor(private fb:FormBuilder){
    this.empForm = this.fb.group({
      name: [''],
      email: [''],
      phone: [''],
      address: ['']
    })
  }
}
