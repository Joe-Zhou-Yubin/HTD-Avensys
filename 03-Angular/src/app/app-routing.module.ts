import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Pg404Component } from './pg404/pg404.component';
import { Comp1Component } from 'src/comp1/comp1.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';

const routes: Routes = [
{
  path:"form1",
  component:Form1Component
},
{
  path:"form2",
  component:Form2Component
},
// {
//   path:"cop1",
//   component:Comp1Component
// },
{
  path:"**",
  component:Pg404Component
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
