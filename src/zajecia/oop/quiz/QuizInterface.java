package zajecia.oop.quiz;

import zajecia.oop.quiz.question.Question;
import zajecia.oop.quiz.result.Result;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-25.
 */
public class QuizInterface {

    private Scanner scanner;

    public QuizInterface() {
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Start");
        System.out.println("2. Wyniki");
        System.out.println("3. Koniec");
        int result = scanner.nextInt();
        this.scanner.nextLine();
        return result;
    }

    public String insertName() {
        System.out.println("Insert your name: ");
        return this.scanner.nextLine();
    }

    public void beforeStart() {
        System.out.println("Insert enter to start");
        this.scanner.nextLine();
    }

    public boolean showQuestion(Question question) {
        System.out.println(question.getQuestion());
        String[] possibleAnswers = question.getAnswers();
        for (int i = 0; i < possibleAnswers.length; i++) {
            System.out.println((i + 1) + ". " + possibleAnswers[i]);
        }
        int answerFromUser = scanner.nextInt();
        return question.cheackAnswer(answerFromUser - 1);
    }

    public void correctAnswer() {
        System.out.println("Correct answer");
    }

    public void incorrectAnswer() {
        System.out.println("Incorrect answer!");
    }

    public void showResult(String name, int result) {
        System.out.println("Congratulation " + name + "! You finished game with score: " + result);
    }

    public void showResult(Result[] results) {
        System.out.println("Hall of fame:");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + ". " + results[i].getPlayerName() + "\t" + results[i].getResult());
        }
        scanner.nextLine();
    }

    public void showTopResult (Result[] topResults) {
        System.out.println("Hall of fame");
        for (int i = 0; i < topResults.length; i++) {
            System.out.print((i + 1) + ". ");
            if (topResults[i] != null) {
                System.out.print(topResults[i].getPlayerName() + "\t" + topResults[i].getResult());
            }
            System.out.println();
        }
    }

    public void afterGameEnded() {
        System.out.println("Game ended.");
    }

}
