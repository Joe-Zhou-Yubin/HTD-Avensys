import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form1',
  templateUrl: './form1.component.html',
  styleUrls: ['./form1.component.css']
})
export class Form1Component {

  firstname = ''
  checked=false
  dropdown=''
  texts=''
  func1(formValue:NgForm){
    console.log(formValue.value)
  }
  resetForm(value:NgForm){
    value.reset()
  }

  setValue(value:NgForm){
    let details={
      firstname:'name',
      checked:'true',
      dropdown:'1',
      texts:'text'
    }
    value.setValue(details)
  }

}
