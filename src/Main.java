import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greetUser("John", "Menly");
    }

    // new method
    public static void greetUser(String firstName, String lastName) {
        System.out.println("Hi, " + firstName + " " + lastName + "!");
    }
}