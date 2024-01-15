import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentList {

    public static void main(String[] args) {

        Map<String, String> students = new HashMap<>();
        Scanner student = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student number " + i + ": ");
            String numList = student.nextLine();
            System.out.print("Enter first name " + i + ": ");
            String name = student.nextLine();
            students.put(numList, name);
        }

        System.out.println("Student List:");

        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.print("Enter your student number: ");
        String numList = student.nextLine();
        System.out.print("Enter your first name: ");
        String name = student.nextLine();

        if (!students.containsKey(numList)) {
            String thirdKey = (String) students.keySet().toArray()[2];
            students.remove(thirdKey);
        }

        students.put(numList, name);

        System.out.println("Updated Student List:");

        for (Map.Entry<String, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}