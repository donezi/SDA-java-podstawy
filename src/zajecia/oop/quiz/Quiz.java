package zajecia.oop.quiz;

import zajecia.oop.quiz.question.FileQuestionRepository;
import zajecia.oop.quiz.question.MockQuestionsRepository;
import zajecia.oop.quiz.question.Question;
import zajecia.oop.quiz.question.QuestionsRepository;
import zajecia.oop.quiz.result.FileResultsRepository;
import zajecia.oop.quiz.result.MockResultRepository;
import zajecia.oop.quiz.result.Result;
import zajecia.oop.quiz.result.ResultsRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        QuestionsRepository questionsRepository = new FileQuestionRepository("C:\\Users\\RENT\\IdeaProjects\\SDA-java-podstawy\\quiz");
        ResultsRepository resultRepository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\SDA-java-podstawy\\results.txt");
        QuizInterface quizInterface = new QuizInterface();

        boolean gameFlag = true;
        while (gameFlag) {
            //while (decision !=0 )
            int decision = quizInterface.menu();
            switch (decision) {
                case 1:
                    String playerName = quizInterface.insertName();
                    quizInterface.beforeStart();

                    Question[] questions = questionsRepository.getQuestions();
                    int correctAnswersCounter = 0;
                    for (int i = 0; i < questions.length; i++) {
                        boolean result = quizInterface.showQuestion(questions[i]);
                        if (result) {
                            quizInterface.correctAnswer();
                            correctAnswersCounter++;
                        } else {
                            quizInterface.incorrectAnswer();
                        }
                    }
                    Result result = new Result(playerName, correctAnswersCounter);
                    quizInterface.showResult(result);
                    resultRepository.add(result);
                    break;
                case 2:
                    quizInterface.showTopResult(resultRepository.getTopResults(10));
                    break;
                case 3:
                    gameFlag = false;
                    break;
                default:
                    System.out.println("Wrong decision");
            }
        }
        quizInterface.afterGameEnded();
    }
}

//        Question[] questions = questionsRepository.getQuestions();
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);