import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AuthComponent } from './auth/auth.component';
import { MainPageComponent } from './adminModule/main-page/main-page.component';
import { AdminProfileComponent } from './adminModule/admin-profile/admin-profile.component';
import { AdminQuestionListComponent } from './adminModule/admin-question-list/admin-question-list.component';
import { AdminWorkPageComponent } from './adminModule/admin-work-page/admin-work-page.component';
import { UserMainPageComponent } from './userModule/user-main-page/user-main-page.component';
import { UserProfileComponent } from './userModule/user-profile/user-profile.component';
import { UserQuestionListComponent } from './userModule/user-question-list/user-question-list.component';
import { UserWorkPageComponent } from './userModule/user-work-page/user-work-page.component';
import { HeaderComponent } from './header/header.component';
import {RouterModule} from '@angular/router';
import { AdminHeaderComponent } from './admin-header/admin-header.component';
import {DragDropModule} from '@angular/cdk/drag-drop';
import {CountdownModule} from 'ngx-countdown';
import {ModalModule} from 'ngx-bootstrap/modal';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AuthComponent,
    MainPageComponent,
    AdminProfileComponent,
    AdminQuestionListComponent,
    AdminWorkPageComponent,
    UserMainPageComponent,
    UserProfileComponent,
    UserQuestionListComponent,
    UserWorkPageComponent,
    HeaderComponent,
    AdminHeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    DragDropModule,
    CountdownModule,
    ModalModule.forRoot(),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
