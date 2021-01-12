import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { QuestionModel } from './question.model';

@Injectable({
  providedIn: 'root'
})
export class QuestionMockService {
  questions: QuestionModel[] = [
    {
      questionId: 445,
      questionName: 'Пароль',
      questionTask: 'Для входу в систему користувач вводить свій логін і пароль. Написати вимоги до паролю, якщо відомо,' +
        ' що 1234567 закороткий, qwertyu1 має достатню довжину, проте немає великих літер, а myPasSw0rd чудово підходить',
      vars: ['нижнього регістру, а також', '8 символів', 'Пароль повинен складатися', 'на 0 і додавати', 'з цифр і літер верхнього і',
      'містити не менше ніж', 'після коми', 'щоб авторизуватися', 'не більше 2 Гб', 'Передбачити ділення'],
      results: ['Пароль повинен складатися', 'з цифр і літер верхнього і',
        'нижнього регістру, а також', 'містити не менше ніж', '8 символів'],
      isDone: false
    },
    {
      questionId: 248,
      questionName: 'ОС',
      questionTask: 'Користувачі Windows можуть завантажити програму, а користувачі Linux ні',
      vars: ['Програма повинна', 'тільки для Linux', 'працювати для', 'тільки для', 'користувачів Windows'],
      results: ['Програма повинна', 'працювати для', 'користувачів Windows'],
      isDone: false
    }
  ];

  constructor() { }

  getQuestions(): Observable<QuestionModel[]> {
    return of(this.questions);
  }

  getUser(opt): Observable<QuestionModel[]> {
    return of(this.questions);
  }
}
