package zajecia.oop.quiz.result;

/**
 * Created by RENT on 2017-04-26.
 */
public class Test {
    public static void main(String[] args) {
        FileResultsRepository repository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\SDA-java-podstawy\\results.txt");
        Result[] allResults = repository.getAllResults();
        repository.add(new Result("Majka", 2));
        Result[] allResults1 = repository.getAllResults();
        Result[] topResults = repository.getTopResults(10);
    }
}
