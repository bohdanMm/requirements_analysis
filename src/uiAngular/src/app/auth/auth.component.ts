import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.sass']
})
export class AuthComponent implements OnInit {
  login = '';
  pass = '';
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  loginToSystem(){
    if(this.login === 'admin' ){
      this.router.navigateByUrl('/amain');
    } else if (this.login === 'user') {
      this.router.navigateByUrl('/umain');
    } else {
      alert('Дані не вірні');
    }
  }

}
