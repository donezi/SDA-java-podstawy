package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-11.
 */
public class Zajecia6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

//        int valueRandom = random.nextInt(50);
//        int valueScanner = scanner.nextInt();

//        printPowersOf2(20);
//        printPowersOf2(valueRandom);
//        printPowersOf2(valueScanner);
//        int[] array = {3, 5, 8, 2, 4, 9, 7};
//        sumUntil(array, 20);
//        avgUntil(array, 5);
//        int result = game(random.nextInt(100));
//        System.out.print("Correct! Your result: " + result + " attempts");
        System.out.println(numberOfDigits(357));
        System.out.println(3457);
//        sumOfDigits(357);
//        sumOfDigits(scanner.nextInt());

    }

//    public static int sumOfRandom(int value) {
//        zadanie domowe
//    losujemy liczby i dodajemy, aż przekroczy value
//        -10, 20
//    }

    public static int numberOfDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number /= 10;
            counter++;
        }
        System.out.println(counter);
        return counter;
    }

    public static int sumOfDigits(int number) {
        int numberDigits = 0;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
            numberDigits++;
        }
        System.out.println(sum);
        return sum;
    }

    public static int gameBot(int number) {
        int value = 0;
        int numberBot = -1;
        int counter = 0;
        while (number != numberBot) {
            counter++;
            System.out.println("Insert number:<0-99>");
            if (numberBot < number && value < number) {
                System.out.println("Insert bigger number!");
            } else if (numberBot > number) {
                System.out.println("Insert less number!");
            } else {
                System.out.print("Correct!" + counter + "attempt");
                System.out.println();
            }
        }
        return counter;
    }

    public static int game(int number) {
        Scanner scanner = new Scanner(System.in);
        int numberUser = -1;
        int counter = 0;
        while (number != numberUser) {
            System.out.println("Insert number: 0-99");
            numberUser = scanner.nextInt();
            counter++;
            if (numberUser < number) {
                System.out.println("Insert higher number!");
            } else if (numberUser > number) {
                System.out.println("Insert less number!");
            } else {
                System.out.println();
            }
        }
        return counter;
    }

    public static boolean avgUntil(int[] array, int avg) {
        int arraySum = array[0];
        int i = 1;
        while (arraySum / i < avg && i < array.length) {
            arraySum += array[i];
            i++;
            System.out.println(arraySum / i);
        }

        return arraySum / i > avg;
    }

    public static boolean sumUntil(int[] array, int sum) {
        int arraySum = 0;
        int i = 0;
        while (arraySum < sum && i < array.length) {
            arraySum += array[i];
            i++;
            System.out.println(arraySum);
        }

        return arraySum > sum;
    }

    public static void printPowersOf2(int number) {
        int value = 1;
        while (value < number) {
            System.out.println(value);
            value *= 2;
        }
    }

    public static void whileTest() {
        int number = 10;
        int counter = 0;
        Random random = new Random();
        while (number > 0) {
            System.out.println("Hello World");
            counter++;
            number -= random.nextInt(7);
        }
        System.out.println(counter);
    }
}
