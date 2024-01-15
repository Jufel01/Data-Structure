import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovieTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter movie " + i + " of 3: ");
            String movie = input.nextLine();
            movies.offer(movie);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter snack " + i + " of 3: ");
            String snack = input.nextLine();
            snacks.offer(snack);
        }

        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        System.out.println("\nPress 'E' each time you finish a snack.");

        while (!snacks.isEmpty()) {
            String key = input.nextLine();
            if (key.equalsIgnoreCase("E")) {
                snacks.remove();
                System.out.println(snacks);
            } else {
                System.out.println("Invalid Input!");
            }
        }

        if (snacks.isEmpty()) {
            System.out.println("No more snacks");
        }
    }
}