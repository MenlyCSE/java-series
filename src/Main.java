import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // debugging
        System.out.println("Start");
        printNumbers(4);
        System.out.println("end");
    }

    public static void printNumbers(int limit) {
        for (int i = 0; i <= limit; i++)
            System.out.println(i);
    }
}