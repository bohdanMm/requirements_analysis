import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-admin-question-list',
  templateUrl: './admin-question-list.component.html',
  styleUrls: ['./admin-question-list.component.sass']
})
export class AdminQuestionListComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit(): void {
  }

  goToAdminWorkPage() {
    this.router.navigateByUrl('/awork');
  }
}
