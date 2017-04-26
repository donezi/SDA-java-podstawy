package zajecia.oop.quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultRepository {
    private Result[] results;

    public MockResultRepository() {
        results = new Result[10];
        results[0] = new Result("Jakub", 3);
        results[1] = new Result("Marcin", 2);
        results[2] = new Result("Blazej", 1);
        results[3] = new Result("Wojciech", 0);
        //dodac do results dodatkowo 2 wyniki
    }


    public Result[] getAllResults() {
        return results;
    }

    //Napisac metode, podmienic w wyswietlaniu wynikow i poprawic wyswietlanie wynikow
    public Result[] getTopResults(int n) {
        Result[] resultsToReturn = new Result[n];
        int loopSize = n < results.length ? n : results.length;
        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }
}
