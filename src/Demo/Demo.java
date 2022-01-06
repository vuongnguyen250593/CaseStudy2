package Demo;

import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int choice;
        while (!check) {
            try {
                System.out.print("Enter: ");
                choice = scanner.nextInt();
                check = true;
            } catch (Exception e) {
                System.err.println("error");
            }
        }
    }
}
