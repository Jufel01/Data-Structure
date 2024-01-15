import java.util.Scanner;

public class UserEnterNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double firstNum = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double secondNum = scanner.nextDouble();
        
        if (firstNum < secondNum) {
            System.out.println(firstNum + " is less than " + secondNum);
        } else if (firstNum > secondNum) {
            System.out.println(firstNum + " is greater than " + secondNum);
        } else {
            System.out.println(firstNum + " is equal to " + secondNum);
        }

        scanner.close();
    }
}