package zajecia;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by RENT on 2017-04-13.
 */
public class Zajecia8 {
    public static void main(String[] args) {


//        System.out.println(countCharacter("Ala ma kota", 'a'));
//        System.out.println(countCharacter("Ala ma kota i psa", 'a'));
//        System.out.println(countCharacter("ala ma kota i psa", 'a'));

//        System.out.println(countCapitalLetters("Ala Ma Kota i Psa"));
//        System.out.println(countCapitalLetters("Ala Ma Kota I Psa"));

//        System.out.println(countWords("Ala Ma Kota I Psa"));
//        System.out.println(countWords("Ala Ma Kota, Psa i Papuge"));

//        System.out.println(switchCase("Ala Ma Kota"));

//        System.out.println(ananimOf("kontroler"));

        isPalindrom("kajak");

    }

//    public static String toUpperCase(String message) {
//
//    }
//
//    public static String toLowerCase(String message) {
//
//    }
//
//    public static boolean startsWith(String message, String someValue) {
//
//        return;
//    }
    //Ala ma 2 koty i 3 psy. -> 5
//    public static int sumOfNumbers(String message) {
//
//    }


    public static boolean isPalindrom(String message) {
        char[] charArray = message.toCharArray();
        boolean palindrom = true;
        int i = 0;
        while (palindrom && i < charArray.length / 2) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                palindrom = false;
            }
        }

        //BED
//        for (int i = 0; i < charArray.length / 2; i++) {
//            if (charArray[i] != charArray[charArray.length - i - 1]) {
//                palindrom = false;
//                break;
//            }
//        }
        return palindrom;
//        return message.equals(ananimOf(message));
    }

    //message wspak
    public static String ananimOf(String message) {
        char[] charArray = message.toCharArray();
//        char[] resultArray = new char[charArray.length];
//        for (int i = 0; i < resultArray.length; i++) {
//            resultArray[i] = charArray[charArray.length - i - 1];
//        }
        for (int i = 0; i < charArray.length / 2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tmp;
        }
        return String.valueOf(charArray);
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }

        return new String(charArray);
//        return charArray.toString();
//        return String.valueOf(charArray);
    }

    public static int countWords(String message) {
        int counter = 1;
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 32) {
                counter++;
            }
        }
//        return message.split(" ").length;
        return counter;
    }

    public static int countSmallLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                counter++;
            }
        }
        return counter;
    }


    public static int countCapitalLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                counter++;
            }
        }
        return counter;
    }

    public static int countCharacter(String message, char character) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == character) {
                counter++;
            }
//        OR
//        int counter = 0;
//        for (int i = 0; i < message.length(); i++) {
//            if (message.charAt(i) == character) {
//                counter++;
//            }
//        }
        }
        return counter;
    }

    public static void charAndStringTest() {
        String message = "Ala ma kota";
        char znak = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(znak + ", ");
            znak++;
        }
        char[] charArray = message.toCharArray();
        System.out.println(message.length());
        countCharacter(message, 'a');
        System.out.println();
    }


}
