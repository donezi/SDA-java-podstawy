package zajecia;

import java.util.Random;

/**
 * Created by RENT on 2017-04-20.
 */
public class Zajecia10 {
    public static void main(String[] args) {

//        System.out.println(find("Ala ma kota", 'm'));
//        System.out.println(find("Ala ma kota", 'k'));
//        System.out.println(find("Ala ma kota", 'z'));

//        System.out.println(countAll("Ala ma kota", 'a'));

//        System.out.println();
//        Zajecia4.displayArray(stringStatistic("Ala ma kota i dwa psy. Kupila sobie torebke na zakupy i teraz nie moze wyjsc z galeri handlowej"));

//        printStringStatistics(stringStatistic("Ala ma kota i dwa psy"));

//        int[] statistic = stringStatistic("Ala ma kota i dwa psy. Kupila sobie torebke na zakupy i teraz nie moze wyjsc z galeri handlowej");
//        printStringStatistics(statistic);

//        multiplyDigits(12345);

//        int[][] matrix = randomMatrix(3, 10, -5);
//        System.out.println(avg(matrix));

//        System.out.println(find("Ala ma kot", "kota"));
//        System.out.println(find("Ala ma kota", "kota"));
//        System.out.println(find("Ala ma kota", "ma"));

//        System.out.println(countAll("Ala ma kota i ma psa", "ma"));
//        System.out.println(countAll("Ala ma kota i ma psa", "mam"));

        System.out.println(checkRoundBraces("((2+2)*2)"));
        System.out.println(checkRoundBraces(")(2+2)*2)"));
        System.out.println(checkRoundBraces("((2+2)*2"));

    }


    public static boolean checkRoundBraces(String expression) {
        char[] charArray = expression.toCharArray();
        int counter = 0;
        int i = 0;
        while (counter >= 0 && i < charArray.length) {
            if (charArray[i] == '(') {
                counter++;
            } else if (charArray[i] == ')') {
                counter--;
            }
            i++;
        }
        return counter == 0;
    }

    public static int countAll(String message, String sentence) {
        int counter = 0;
        while (find(message, sentence) != -1) {
            counter++;
            message = message.substring(find(message, sentence) + 1);
        }
        return counter;
    }


    public static double[][] avgMatrix(int[][] matrix1, int[][] matrix2) {
        double[][] resultMtrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMtrix[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2.0;
            }
        }
        return resultMtrix;
    }

    public static double avg(int[][] matrix) {
        double size = matrix.length * matrix[0].length;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum / size;
    }

    public static int[][] randomMatrix(int size, int bounds, int offset) {
        Random random = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(bounds) + offset;
            }
        }

        return matrix;
    }

    public static int find(String message, char sentence) {
        int i = 0;
        char[] charArray = message.toCharArray();
        while (i < charArray.length && charArray[i] != sentence) {
            i++;
        }
        return (i == charArray.length) ? -1 : i;
    }

    public static int find(String message, String sentence) {
        char[] messageArray = message.toCharArray();
        char[] sentenceArray = sentence.toCharArray();
        boolean flag = true;
        int i = 0;
        while (flag && i <= messageArray.length - sentenceArray.length) {
            int j = 0;
            while (j < sentenceArray.length && messageArray[i + j] == sentenceArray[j]) {
                j++;
                if (j == sentenceArray.length) {
                    flag = false;
                }
            }
            i++;
        }
        return flag ? -1 : i - 1;
    }

    public static int countAll(String message, char sentence) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (toLowerCase(charArray[i]) == toLowerCase(sentence)) {
                counter++;
            }
        }

        return counter;
    }

    public static char toLowerCase(char a) {
        if (a >= 65 && a <= 90) {
            a += 32;
        }
        return a;
    }

    public static int[] stringStatistic(String message) {
        char[] charArray = message.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            char charInLowerCase = toLowerCase(charArray[i]);
            if (charInLowerCase >= 97 && charInLowerCase <= 122) {
                ints[charInLowerCase - 97]++;
            }
        }
        return ints;
    }


    public static void printStringStatistics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }

    public static int multiplyDigits(int number) {
        int multiplayer = 1;
        while (number != 0) {
            multiplayer *= number % 10;
            number /= 10;
        }
        System.out.println(multiplayer);

        return multiplayer;
    }

}
