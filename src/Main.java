import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ternary operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

        // output
        System.out.println(className);
    }
}