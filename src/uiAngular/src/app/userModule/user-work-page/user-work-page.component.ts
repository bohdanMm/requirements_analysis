import { Component, OnInit } from '@angular/core';
import {CdkDragDrop, moveItemInArray, transferArrayItem} from '@angular/cdk/drag-drop';


@Component({
  selector: 'app-user-work-page',
  templateUrl: './user-work-page.component.html',
  styleUrls: ['./user-work-page.component.sass']
})
export class UserWorkPageComponent implements OnInit {
  timer = '5.00'
  variables = ['1Ділити на 0', '2не можна', '3а на 5', '4ділити можна', '5ура', '6прекрасно', '7сім сім сім', '8ласт'];
  results = [];
  constructor() { }

  ngOnInit(): void {
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
      console.log('send results here');
    }
  }

  clearRes(){
    this.results.forEach(el =>
      this.variables.push(el)
    );
    this.results.length = 0;
    console.log('cleared');
  }

  sendRes(timerInfo){
    const spend = 300000 - timerInfo;
    const res = {
      spendTime: spend,
      answer: this.results
    };
    console.log(res);
  }
}


