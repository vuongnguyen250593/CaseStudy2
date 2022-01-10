package Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            abc(scanner);
        } catch (Exception e) {
            System.err.println("    error");
            main(args);
        }
    }

    public static void abc(Scanner scanner) {
        System.out.println("Enter: ");
        int number = scanner.nextInt();
        scanner.nextLine();
    }
}
