import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {QuestionMockService} from '../question-mock.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.sass']
})
export class AuthComponent implements OnInit {
  login = '';
  pass = '';
  f = this.loginFunc;
  constructor(private router: Router, private service: QuestionMockService) { }

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

  loginFunc(username: string, password: string) {
    const httpOptions = {
      headers: ({
        'Authorization': 'Basic ' + btoa(`${username}:${password}`)
      })
      };
    this.service.getUser(httpOptions).subscribe(data => this.router.navigateByUrl('/umain'));
  }

}
