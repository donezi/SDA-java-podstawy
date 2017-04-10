package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        int value = 10;
//        Zajecia4.displayArray(getArray(10));
//        Zajecia4.displayArray(getArray(11));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert value:");
        int someValue = scanner.nextInt();
        Zajecia4.displayArray(getArray(someValue));
        Zajecia4.displayArray(getArrayOdd(someValue));
    }

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
        int size = value / 2 ;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (2 * i) + value % 2;
        }
        return array;
    }
}
