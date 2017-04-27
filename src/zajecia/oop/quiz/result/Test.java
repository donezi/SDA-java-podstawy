package zajecia.oop.quiz.result;

import zajecia.oop.quiz.question.FileQuestionRepository;
import zajecia.oop.quiz.question.Question;
import zajecia.oop.quiz.question.QuestionsRepository;

/**
 * Created by RENT on 2017-04-26.
 */
public class Test {
    public static void main(String[] args) {
//        FileResultsRepository repository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\SDA-java-podstawy\\results.txt");
//        Result[] allResults = repository.getAllResults();
//        repository.add(new Result("Majka", 2));
//        Result[] allResults1 = repository.getAllResults();
//        Result[] topResults = repository.getTopResults(10);

        QuestionsRepository questionsRepository = new FileQuestionRepository("C:\\Users\\RENT\\IdeaProjects\\SDA-java-podstawy\\quiz");
//        Question[] allQuestions = repository.getAllQuestion;
    }
}
