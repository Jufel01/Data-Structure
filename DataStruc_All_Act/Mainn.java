import java.util.Scanner;
import java.util.PriorityQueue;

public class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<String> nicknames = new PriorityQueue<>();

        System.out.println("Enter four names of your classmates: ");
        for (int i = 0; i < 4; i++) {
            nicknames.add(scanner.nextLine());
        }

        System.out.println("Enter 'H' to say 'Hi' each of them!");
        while (!nicknames.isEmpty()) {
            scanner.nextLine();
            System.out.println("Hi " + nicknames.poll());

        }
        System.out.println("Done Saying Hi");
    }
}