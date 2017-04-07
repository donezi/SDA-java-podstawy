package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 */
public class Zajecia4 {
    public static void main(String[] args) {

        int dayVariable = 2;
        int monthVariable = 5;
        int yearVariable = 2017;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert day:");
//        int dayFromUser = scanner.nextInt();
//        System.out.println("Insert month:");
//        int monthFromUser = scanner.nextInt();
//        System.out.println("Insert year:");
//        int yearFromUser = scanner.nextInt();

//        displayDate(dayFromUser, monthFromUser, yearFromUser);
//        displayDate(dayVariable, monthVariable, yearVariable);
//        displayDate(21, 5, 2015);

        int[] array = {2, 4, 6, 9, 5, 3, -1, 7, -3, -5};

        int minValue = minFromArray(array);
        int maxValue = maxFromArray(array);

        int sum = sum(array);
        double avg = avg(array);
        int span = span(array);

//        System.out.println("Sum: " + sum);
//        System.out.println("Suma: " + sum);
//        System.out.println("Avg: " + avg);
//        System.out.println("Srednia: " + avg);
//        System.out.println("Span: "+span);

        statistic(array);
//        reverse(array);
    }

    public static void statistic(int[] array) {
        System.out.println();
        System.out.println("Min value: " + minFromArray(array));
        System.out.println("Max value: " + maxFromArray(array));
        System.out.println("Suma: " + sum(array));
        System.out.println("AVG: " + avg(array));
        System.out.println("Span: " + span(array));
        System.out.print("Reversed: ");
        reverse(array);
    }

    public static void reverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i!=0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static int sum(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double avg(int[] array) {
        int sum = sum(array);
        return sum / (double) array.length;

    }

    public static int span(int[] array) {
        int min = minFromArray(array);
        int max = maxFromArray(array);
        int result = max - min;
        return abs(result);
//        return abs(maxFromArray(array)-minFromArray(array));
    }

    public static int abs(int number) {
        if (number < 0) {
            number *= -1;
        }
        return number;
    }

    public static int minFromArray(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxFromArray(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void displayDate(int day, int month, int year) {

        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 0) {
            System.out.println("Day: " + day + ", Month: " + month + ", Year: " + year);
        } else {
            System.out.println("Invalid date!");
        }

    }

}
