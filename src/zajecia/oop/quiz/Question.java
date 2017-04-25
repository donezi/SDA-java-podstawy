package zajecia.oop.quiz;

import java.util.Arrays;

/**
 * Created by RENT on 2017-04-25.
 */
public class Question {
    private String question;
    private int corectAnswer;
    private String[] answers;

    public Question(String question, int corectAnswer, String[] answers) {
        this.question = question;
        this.corectAnswer = corectAnswer;
        this.answers = answers;
    }

    public boolean cheackAnswer(int answer) {
        return this.corectAnswer == answer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", corectAnswer=" + corectAnswer +
                ", answers=" + Arrays.toString(answers) +
                '}';
    }
}
