package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        Zajecia4.displayArray(getArray(10));
//        Zajecia4.displayArray(getArray(11));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert value:");
//        int size = scanner.nextInt();
//        int someValue = scanner.nextInt();
//        Zajecia4.displayArray(getArray(someValue));
//        Zajecia4.displayArray(getArrayOdd(someValue));
//        randomTest();
//        Zajecia4.displayArray(getRandomArray(5, 10, 10));
//        Zajecia4.displayArray(getRandomArray(10, 10));
//        Zajecia4.displayArray(getRandomArray(10));
//        Zajecia4.statistic(getRandomArray(5, 10, -10));


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert size:");
//        int size = scanner.nextInt();
//        System.out.println("Insert bound:");
//        int bound = scanner.nextInt();
//        System.out.println("Insert offset:");
//        int offset = scanner.nextInt();
//        Zajecia4.displayArray(getRandomArray(size, bound, offset));
//        Zajecia4.statistic(getRandomArray(size, bound, offset));

//        printSquare(5);
//        printRectangle(3,10);

//        printTriangle(5);
//        printMatrixOfNumbers(3);
//        printOneMatrix(3);
//        cheesBoard(4);
//        printOneSquareMatrix(5);
//        printChristmassTree(3);
//        printChristmassTree(4);
//        homework();
//        lineOfNumbers(5);

    }

    public static void lineOfNumbers(int value) {
        for (int i = 0; i < value - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(i + 1);
        }
    }

    public static void homework() {
//        losujemy liczbe 15-25
//        wywołac metode getArray()
//        uzyc wygenerowana tablice w metodzie statiscic
//        dla wylosowanej liczby  - wywolali metode tree(number -12)
        Random random = new Random();
        int number = random.nextInt(10) + 15;
        Zajecia4.statistic(getArray(number));
//        Zajecia4.statistic(getRandomArray(10, 10, 15));
        printChristmassTree(number - 12);

    }

    public static void printChristmassTree(int a) {
        for (int i = 0; i < a; i++) {
            //spacja
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            //gwaizdki
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
    }


    public static void printOneSquareMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0 || i == (a - 1)) || (j == 0 || j == (a - 1))) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void cheesBoard(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");

                }

            }
            System.out.println();
        }
    }

    public static void printTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printMatrixOfNumbers(int a) {
        int number = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a; j++) {
//                System.out.print(i * a + j + 1 + " ");
//            }
//            System.out.println();
//        }
//    }

    public static void printOneMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    public static void printSquare(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void printRectangle(int a, int b) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void randomTest() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10) - 5);
        System.out.println(random.nextInt(15) + 5);
    }

    public static int[] getRandomArray(int size) {
        return getRandomArray(size, Integer.MAX_VALUE);
    }

    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);
    }

    public static int[] getRandomArray(int size, int bound, int offset) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }

//    public static int[] getRandomArray(int size, int bound, int offset) {
//
//        return array;
//    }

    public static int[] getArray(int value) {
//        size tablicy
//        utworzyc nowa tablce
//        w petli ustawic wartosci [0, 2, 4, 6, 8...
//        zwrocic
        int size = value / 2 + value % 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i;
        }
        return array;
    }

    public static int[] getArrayOdd(int value) {
//        size tablicy
//        utworzyc nowa tablce
//        w petli ustawic wartosci [0, 2, 4, 6, 8... lub [1, 3, 5, 7, 9...
//        zwrocic
        int size = value / 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (2 * i) + value % 2;
        }
        return array;
    }
}
