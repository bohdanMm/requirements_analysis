import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.sass']
})
export class UserProfileComponent implements OnInit {
  totalQ = 2;
  constructor(private router : Router) { }

  ngOnInit(): void {
    const total = JSON.parse(localStorage.getItem('totalList'));
    if (total) {
      this.totalQ = total[0];
    }
  }


  goToAuthorization() {
    this.router.navigateByUrl('/auth');
  }
}
