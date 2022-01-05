package Demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter: ");
            int choi = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Sai dữ liệu");
        }
    }
}
