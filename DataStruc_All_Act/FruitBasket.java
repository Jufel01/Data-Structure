import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Stack<String> basket = new Stack<String>();
    System.out.print("Enter how many fruits to eat: ");

    int numFruits = scanner.nextInt();
        for (int i = 1; i <= numFruits; i++) {
            System.out.print("Choose a fruit to catch. Press A, O, M, or G. ");

                String fruit = scanner.next().toUpperCase();

                    if (fruit.equals("A")) {
                        basket.push("apple");
                    } 
                    
                    else if (fruit.equals("O")) {
                            basket.push("orange");
                    } 
                    else if (fruit.equals("M")) {
                            basket.push("mango");
                    } 
                    else if (fruit.equals("G")) {
                            basket.push("guava");
                    } 
                    else {
                        System.out.println("Invalid fruit choice. Try again. ");

                        i--;
                    }
                }

                System.out.println("Your basket now has: " + basket.toString());
            
                    while (!basket.isEmpty()) {
                        System.out.print("Press E to eat a fruit. ");

                            String eat = scanner.next().toUpperCase();
                                
                            if (eat.equals("E")) {
                                basket.pop();

                            if (!basket.isEmpty()) {
                                System.out.println("Fruit(s) in the basket: " + basket.toString());
                            } 
                            
                            else {
                                System.out.println("No more fruits. ");
                        }
                    } 
                    
                    else {
                        System.out.println("Invalid choice. Try again. ");
                    }
                }

        System.out.println("Basket is empty. ");
    }

}