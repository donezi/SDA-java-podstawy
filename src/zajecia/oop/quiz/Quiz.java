package zajecia.oop.quiz;

import zajecia.oop.quiz.question.MockQuestionsRepository;
import zajecia.oop.quiz.question.Question;
import zajecia.oop.quiz.result.MockResultRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        MockResultRepository mockResultRepository = new MockResultRepository();
        QuizInterface quizInterface = new QuizInterface();

        boolean gameFlag = true;
        while (gameFlag) {
            //while (decision !=0 )
            int decision = quizInterface.menu();
            if (decision == 1) {
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
                quizInterface.showResult(playerName, correctAnswersCounter);
            } else if (decision == 2) {
                quizInterface.showTopResult(mockResultRepository.getTopResults(10));
            } else {
                gameFlag = false;
            }
        }
        quizInterface.afterGameEnded();
    }
}
//        Question[] questions = questionsRepository.getQuestions();
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);