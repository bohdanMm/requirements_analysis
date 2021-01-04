import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.sass']
})
export class UserProfileComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit(): void {
  }

  goToAuthorization() {
    this.router.navigateByUrl('/auth');
  }
}
