import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'avensystest';

  msg=true;

  print1 = "hello everyone";

  context =[
    {
      'fn':'abc',
      'ln':'dance center',
      'id':1234
    },
    {
      'fn':'ray',
      'ln':'book center',
      'id':5678
    },
    {
      'fn':'kai',
      'ln':'call center',
      'id':4321
    },
    {
      'fn':'gi',
      'ln':'run center',
      'id':8765
    }
  ]
}

