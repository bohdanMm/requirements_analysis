import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AuthComponent} from './auth/auth.component';
import {UserMainPageComponent} from './userModule/user-main-page/user-main-page.component';
import {MainPageComponent} from './adminModule/main-page/main-page.component';
import {UserProfileComponent} from './userModule/user-profile/user-profile.component';
import {AdminProfileComponent} from './adminModule/admin-profile/admin-profile.component';
import {UserQuestionListComponent} from './userModule/user-question-list/user-question-list.component';
import {AdminQuestionListComponent} from './adminModule/admin-question-list/admin-question-list.component';
import {UserWorkPageComponent} from './userModule/user-work-page/user-work-page.component';
import {AdminWorkPageComponent} from './adminModule/admin-work-page/admin-work-page.component';


const routes: Routes = [
  {path: '', component: AuthComponent},
  {path: 'auth', component: AuthComponent},
  {path: 'umain', component: UserMainPageComponent},
  {path: 'amain', component: MainPageComponent},
  {path: 'uprofile', component: UserProfileComponent},
  {path: 'aprofile', component: AdminProfileComponent},
  {path: 'uquestions', component: UserQuestionListComponent},
  {path: 'aquestions', component: AdminQuestionListComponent},
  {path: 'uwork', component: UserWorkPageComponent},
  {path: 'awork', component: AdminWorkPageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
