import {Component, OnInit, TemplateRef} from '@angular/core';
import {CdkDragDrop, moveItemInArray, transferArrayItem} from '@angular/cdk/drag-drop';
import {QuestionMockService} from '../../question-mock.service';
import {QuestionModel} from '../../question.model';
import {ActivatedRoute, Router} from '@angular/router';
import {BsModalRef, BsModalService} from 'ngx-bootstrap/modal';
import {send} from 'q';


@Component({
  selector: 'app-user-work-page',
  templateUrl: './user-work-page.component.html',
  styleUrls: ['./user-work-page.component.sass']
})
export class UserWorkPageComponent implements OnInit {
  timer = '5.00'
  variables = ['1Ділити на 0', '2не можна', '3а на 5', '4ділити можна', '5ура', '6прекрасно', '7сім сім сім', '8ласт'];
  results = [];
  questionList: QuestionModel[];
  questionId: number;
  question: QuestionModel;
  modalRef: BsModalRef;
  mark: number;
  isDone: boolean;
  spendDoneTime: number;
  donedList: number[];

  tryNumber = 0;


  constructor(
    private questionServise: QuestionMockService,
    private route: ActivatedRoute,
    private router: Router,
    private modalService: BsModalService
  ) { }

  ngOnInit(): void {
    this.tryNumber = 0;
    this.route.queryParams.subscribe( response => this.questionId = response.questionId);
    this.questionServise.getQuestions().subscribe(data => this.questionList = data);
    for (let i = 0; i < this.questionList.length; i++) {
      if (this.questionList[i].questionId == this.questionId) {
        this.question = this.questionList[i];
      }
    }
    this.variables = this.question.vars;
  }

  onDrop(event: CdkDragDrop<string[]>) {
    if (event.previousContainer === event.container) {
      moveItemInArray(event.container.data,
        event.previousIndex,
        event.currentIndex);
    } else {
      transferArrayItem(event.previousContainer.data,
        event.container.data,
        event.previousIndex, event.currentIndex);
    }
  }

  onTimerFinished(e) {
    if (e.action === 'done') {
      this.sendRes(0, 'resModal' );
    }
  }

  clearRes() {
    this.results.forEach(el =>
      this.variables.push(el)
    );
    this.results.length = 0;
    console.log('cleared');
  }

  sendRes(timerInfo, modalName) {
    const spend = 300000 - timerInfo;
    this.spendDoneTime = spend / 1000;
    const res = {
      spendTime: spend,
      answer: this.results
    };
    this.openModal(modalName);
    this.calculateMark(res);
    console.log(res);
  }

   arraysEqual(a, b) {
    if (a === b) return true;
    if (a == null || b == null) return false;
    if (a.length !== b.length) return false;
    for (let i = 0; i < a.length; ++i) {
      if (a[i] !== b[i]) return false;
    }
    return true;
  }

  calculateMark(res) {
    this.tryNumber++;
    console.log(this.tryNumber);
    let tryMark = 0;
    for (let i = 1; i < this.tryNumber; i++ ){
      tryMark += 2;
    }
    if (this.arraysEqual(res.answer, this.question.results)) {
      this.isDone = true;
      if (res.spendTime < 120000) {
        this.mark = 100 - tryMark;
      } else {
        this.mark = 75 - tryMark;
      }
      this.saveDone();
    } else {
      this.mark = 0;
      this.isDone = false;
    }
  }

  openModal(template: TemplateRef<any>) {
    this.modalRef = this.modalService.show(template);
  }

  showQuestionList() {
    this.modalRef.hide()
    this.router.navigateByUrl('/uquestions');
  }

  saveDone(){
    this.donedList = JSON.parse(localStorage.getItem('donedList'));
    let total = JSON.parse(localStorage.getItem('totalList'));
    if (total) {
      total[0]++;
      localStorage.setItem('totalList', JSON.stringify(total));
    } else {
      total = [3];
      localStorage.setItem('totalList', JSON.stringify(total));
    }
    if (this.donedList) {
      this.donedList.push(this.questionId);
      localStorage.setItem('donedList', JSON.stringify(this.donedList));
    } else {
      const questions = [];
      questions[0] = this.questionId;
      localStorage.setItem('donedList', JSON.stringify(questions));
    }
  }
}


