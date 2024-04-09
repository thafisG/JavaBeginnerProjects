import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("You are of appropriate age.");
        } else {
            System.out.print("Sorry, only individuals over 18 are allowed, try again in: " + (18 - age) + " years.");
        }

        scanner.close();
    }
}
