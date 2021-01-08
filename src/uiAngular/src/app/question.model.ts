export interface QuestionModel {
  questionId: number;
  questionName: string;
  questionTask: string;
  vars: string[];
  results: string[];
  isDone: boolean;
}
