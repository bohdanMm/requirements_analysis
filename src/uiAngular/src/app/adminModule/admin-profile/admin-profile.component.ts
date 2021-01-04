import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-admin-profile',
  templateUrl: './admin-profile.component.html',
  styleUrls: ['./admin-profile.component.sass']
})
export class AdminProfileComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit(): void {
  }

  goToAuthorization() {
    this.router.navigateByUrl('/auth');
  }
}
