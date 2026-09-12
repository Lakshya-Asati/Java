import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Basic Do-While (Guaranteed single execution)
        // Evaluates the condition AFTER the code block runs.
        System.out.println("1. Basic Execution");
        int count = 10;
        do {
            System.out.println("This executes once even though count (10) is not < 5.");
            count++;
        } while (count < 5);

        // 2. Interactive Menu System (Most common real-world use case)
        // Ideal because a menu must display to the user at least once.
        System.out.println("\n2. Interactive Console Menu");
        Scanner scanner = new Scanner("1\n3\n"); // Simulated inputs: Option 1, then Option 3 (Exit)
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Print Hello");
            System.out.println("2. Print World");
            System.out.println("3. Exit");
            
            choice = scanner.nextInt();
            System.out.println("User selected: " + choice);

            if (choice == 1) {
                System.out.println("Output: Hello!");
            } else if (choice == 2) {
                System.out.println("Output: World!");
            }

        } while (choice != 3); // Keep prompting until user chooses to Exit (3)

        // 3. Retry Logic for Operations
        // Runs an action first, then repeats if a condition/error threshold is met.
        System.out.println("\n3. Retry Logic");
        int attempts = 0;
        boolean success = false;

        do {
            attempts++;
            System.out.println("Attempting connection... (Attempt " + attempts + ")");
            
            // Simulate success on the 3rd attempt
            if (attempts == 3) {
                success = true;
                System.out.println("Connection established!");
            }
        } while (!success && attempts < 5);
    }
}