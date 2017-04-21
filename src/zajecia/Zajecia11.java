package zajecia;

import java.io.*;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-21.
 */
public class Zajecia11 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\RENT\\IdeaProjects\\SDA-java-podstawy\\file");
//        readFromFileTest(file);
//        writeToFileTest(file, "Hello World");
        Zajecia4.displayArray(readIntegersFromFile(file));

    }

    public static int[] readIntegersFromFile (File file) throws FileNotFoundException {
        int[] array = new int[getLenght(file)];
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int getLenght (File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while (scanner.hasNext()){
            counter++;
            scanner.nextLine();
        }
        return counter;
    }

    public static void readFromFileTest(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void writeToFileTest(File file, String message) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);
        }
    }
}
