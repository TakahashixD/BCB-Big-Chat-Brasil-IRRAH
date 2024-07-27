import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { AdminComponent } from './pages/admin/admin.component';
import { authGuard } from './auth/auth.guard';

export const routes: Routes = [
  {
      path: '', redirectTo: '/login', pathMatch: 'full'
  },
  {
      path: 'login', component: LoginComponent
  },
  {
      path: 'admin', component: AdminComponent, canActivate: [authGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
