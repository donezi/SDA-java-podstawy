package zajecia.oop.quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultRepository {
    private Result[] results;

    private int resultsCounter;

    public MockResultRepository() {
        this.resultsCounter = 0;
        results = new Result[100];
        add(new Result("Jakub", 3));
        add(new Result("Marcin", 2));
        add(new Result("Blazej", 1));
        add(new Result("Wojciech", 0));
    }


    public Result[] getAllResults() {
        Result[] resultsToReturn = new Result[resultsCounter];
        for (int i = 0; i < resultsCounter; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }

    //Napisac metode, podmienic w wyswietlaniu wynikow i poprawic wyswietlanie wynikow
    public Result[] getTopResults(int n) {
        Result[] resultsToReturn = new Result[n];
        int loopSize = n < resultsCounter ? n : resultsCounter;
        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }

    public void add(Result result) {
        this.results[resultsCounter] = result;
        resultsCounter++;
    }
}
