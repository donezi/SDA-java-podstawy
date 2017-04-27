package zajecia.oop.quiz.question;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockQuestionsRepository implements QuestionsRepository{

    public Question[] getQuestions() {
        Question[] questions = new Question[3];
        String[] answers1 = {"43", "22", "55", "23"};
        String[] answers2 = {"7", "4", "6", "15"};
        String[] answers3 = {"Lublin", "Warszawa", "Poznan", "Krakow"};
        questions[0] = new Question("Ile lat ma prezydent", 0, answers1);
        questions[1] = new Question("Ile jest 2x2", 1, answers2);
        questions[2] = new Question("Co jest stolica Wielkopolski", 2, answers3);
        return questions;

    }
}