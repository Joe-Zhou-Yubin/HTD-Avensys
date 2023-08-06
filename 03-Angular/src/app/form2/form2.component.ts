import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-form2',
  templateUrl: './form2.component.html',
  styleUrls: ['./form2.component.css']
})
export class Form2Component implements OnInit {

  addForm:FormGroup

  constructor(private builder:FormBuilder){

  }
  
  // ngOnInit(): void {
  //   this.addForm=new FormGroup({
  //     'fn':new FormControl(),
  //     'desc':new FormControl(),
  //     'type':new FormControl()
  //   })
  // }
  // no functions in ngoninit, it only initialize 

  ngOnInit(): void{
    this.addForm = this.builder.group({
      'fn':new FormControl('',[Validators.required,Validators.minLength(5)]),
      'desc':new FormControl('',Validators.minLength(10)),
      'type':new FormControl('',[Validators.required,Validators.minLength(10),Validators.maxLength(20)]),
    // multiple validators use []
      // 'users':new FormArray([
      //   new FormControl('firstone'),
      //   new FormControl('secondone'),
      //   new FormControl('third'),
      //   new FormControl('fourth'),
      // ])
      'users': new FormArray([
        this.builder.group({
          'name':new FormControl(''),
          'Marks':new FormControl(''),
          'branch':new FormControl(''),
        })
      ])
    })
    
    

    

    // //form array
    // let users = new FormArray([
    //   new FormControl('firstone'),
    //   new FormControl('secondone')
    // ])

    // console.log(users)
    // console.log(users.value)

    let obj={
      'fn':'name',
      'desc':'descc',
      'type':'types'
    }

    this.addForm.setValue(obj)
    // setvalue need all field
    // patchvalue can fill some fields, no need all
  }


  addval(){
    console.log(this.addForm.value)
  }
  fnval(){//shows fn value in console
    console.log(this.addForm.get('fn').value)
  }
  changeval(){//shows change in value in console
    this.addForm.valueChanges.subscribe(data=>{console.log(data)})
  }
  resetForm(){//reloads form clears history of any user interaction
    this.addForm.reset()
  }
  formstate(){
    console.log("valid "+this.addForm.valid)
    console.log("invalid "+this.addForm.invalid)
    console.log("pristine "+this.addForm.pristine)
    console.log("touched "+this.addForm.touched)
    console.log("dirty "+this.addForm.dirty)
  }
  clickUser(){
    console.log(this.addForm.get('users').value)
  }
  addUser(){
    console.log("adding form elements");
      let userArr=this.addForm.get('users') as FormArray;
      let newUser = this.builder.group({
        'name':'',
        'Marks':'',
        'branch':''

    });
    userArr.push(newUser);
  }
  removeUser(i){
    console.log("Removing form element");
    let userArr=this.addForm.get('users') as FormArray;
    userArr.removeAt(i);
  }

  get users():FormArray{
    return this.addForm.get('users') as FormArray
  }

  assign(i){
    let arr=this.addForm.get('users') as FormArray
    let value = arr.value

    if(value[i].Marks>60){
      value[i].branch ='CSE'
    }else{
      value[i].branch ='Not Eligible'
    }

    this.users.setValue(value)
  }
}
