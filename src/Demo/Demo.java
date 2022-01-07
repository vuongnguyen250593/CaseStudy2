package Demo;

import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            boolean check = false;
            while (!check) {
                System.out.print("Enter: ");
                int number = scanner.nextInt();
                check = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
