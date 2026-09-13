import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object connected to standard input (keyboard)
        Scanner sc = new Scanner(System.in);

        // Read a single word
        System.out.print("Enter your first name: ");
        String name = sc.next();

        // Read an integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Read a double
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        // Print back the input
        System.out.println("Hello " + name + ", Age: " + age + ", GPA: " + gpa);

        // Good practice: close the scanner when done
        sc.close();
    }
}