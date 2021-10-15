import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginmoduleComponent } from './loginmodule/loginmodule.component';
import { AddproductComponent } from './product/addproduct/addproduct.component';

const routes: Routes = [
  {path:'login',component:LoginmoduleComponent},
  {path:'addproduct',component:AddproductComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }