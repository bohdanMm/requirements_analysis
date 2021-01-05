import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-user-question-list',
  templateUrl: './user-question-list.component.html',
  styleUrls: ['./user-question-list.component.sass']
})
export class UserQuestionListComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit(): void {
  }

  goToUserWorkPage(){
    this.router.navigateByUrl('/uwork');
  }
}
