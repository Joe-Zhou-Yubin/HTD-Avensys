import { Component } from '@angular/core';

@Component({
  selector: 'app-comp1',
  templateUrl: './comp1.component.html',
  styleUrls: ['./comp1.component.css']
})
export class Comp1Component {

superpower= "superman";

r = "red"
g = "green"
sentence = "class test sentence"
class = "c2 c4"
h = "head"
val = "2"
hello(){
  console.log("hello world")
}

alert(){
  alert("hi")
}

a(x:boolean,y:string,z:number){
  console.log(x,y,z)
}

lowerCase = "THIS USED TO BE IN UPPERCASE"

upperCase = "this used to be in lowercase"

date_exm = Date.now()

obj ={
  "valone":"ships",
  "valtwo":"trains",
  "valthree":"plans"
}


}


