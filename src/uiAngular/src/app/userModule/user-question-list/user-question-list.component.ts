import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {QuestionModel} from '../../question.model';
import {QuestionMockService} from '../../question-mock.service';

@Component({
  selector: 'app-user-question-list',
  templateUrl: './user-question-list.component.html',
  styleUrls: ['./user-question-list.component.sass']
})
export class UserQuestionListComponent implements OnInit {
  questionList: QuestionModel[];
  donedQuestionList: [];

  constructor(
    private router: Router,
    private questionServise: QuestionMockService
    ) { }

  ngOnInit(): void {
    // localStorage.clear();
    this.questionServise.getQuestions().subscribe(data => this.questionList = data);
    this.donedQuestionList = JSON.parse(localStorage.getItem('donedList'));
    console.log(this.donedQuestionList);
    if(this.donedQuestionList) {
      for (let i = 0; i < this.questionList.length; i++){
          if(this.donedQuestionList.find((s) => s == this.questionList[i].questionId)){
            this.questionList[i].isDone = true;
          }
      }
    }
  }

  goToUserWorkPage(qId){
    this.router.navigate(['/uwork'], {queryParams: {questionId: qId}});
    console.log(this.questionList);
  }
}
