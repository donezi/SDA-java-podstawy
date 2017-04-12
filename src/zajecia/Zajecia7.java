package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-12.
 */
public class Zajecia7 {
    public static void main(String[] args) {

//        int[][] matrix = saveToMatrixExample();
//        printMartix(matrix);

//        printMartix(fillWithRandomNumbers(3, 5));
//        printMartix(fillWithRandomNumbers(4,6));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert numbers of rows: ");
//        int rows = scanner.nextInt();
//        System.out.println("Insert number of columns: ");
//        int columns = scanner.nextInt();
//        printMartix(fillWithNumbersFromUser(rows, columns));

//        int[][] matrix1 = fillWithRandomNumbers(3, 3);
//        int[][] matrix2 = fillWithRandomNumbers(3, 3);
//        printMartix(addTwoMatrix(matrix1,matrix2));
//        printMartix(multiplyBy(fillWithRandomNumbers(3, 3), 3));
//        System.out.println(sumOfElements(fillWithRandomNumbers(3, 3)));

//        System.out.println(indexOfHighestSum(fillWithNumbersFromUser(3,3)));
//        printMartix(flip(fillWithNumbersFromUser(2,2)));

    }

    //porównujemy dwie macieze i bierzemy wieksza do nowej matrycy
    public static int[][] biggerValues(int[][] matrix1, int[][] matrix2) {
        return null;
    }

    //odwracamy wiersze i kolumny. zwracamy nowa maciez
    public static int[][] flip(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                resultMatrix[i][j] = matrix[j][i];
            }
        }
        return resultMatrix;
    }

    //zwracamy index wiersza, ktory ma najwieksza sume elementow w wierszu
    public static int indexOfHighestSum(int[][] matrix) {
        int indexOfHighestRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (Zajecia4.sum(matrix[indexOfHighestRow]) < Zajecia4.sum(matrix[i])) {
                indexOfHighestRow = i;
            }
        }
        return indexOfHighestRow;
    }

    //suma wszystkiczh elementow macierzy
    public static int sumOfElements(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    //mnozymy maciez przez wartosc, zwracamy nowa maciez!
    public static int[][] multiplyBy(int[][] matrix, int value) {
        int[][] resultMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                resultMatrix[i][j] = matrix[i][j] * value;
            }
        }

        return matrix;
    }

    //dodawanie macierzy
    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        return resultMatrix;
    }

    //scaner dla wypełnienia matrix
    public static int[][] fillWithNumbersFromUser(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Number[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    //random (-15 : 15)matrix
    public static int[][] fillWithRandomNumbers(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] saveToMatrixExample() {
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        //save
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;
            }
        }
//        printMatrix
//        for (int i = 0; i < rows; i++) {
//            System.out.print("|");
//            for (int j = 0; j < columns; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println("|");
//        }
        return matrix;
    }

    public static void printMartix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]);
                if (j != columns - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("|");
        }
    }

}
