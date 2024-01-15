import java.util.Scanner;

public class DisplayMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number: ");
        int maxNumber = scanner.nextInt();
        scanner.close();

        display_num(maxNumber);
    }

    public static void display_num(int n) {
        if (n <= 0) {
            return;
        }
        display_num(n - 1);
        System.out.print(n + ", ");
    }
}