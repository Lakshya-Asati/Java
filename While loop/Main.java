import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Reading User Input Until a Specific Signal (Sentinel Loop)
        // Commonly used when you don't know how many inputs the user will provide.
        System.out.println("1. Input Validation / Sentinel Value");
        Scanner scanner = new Scanner("yes\nyes\nexit"); // Simulated user input
        String input = "";

        while (!input.equalsIgnoreCase("exit")) {
            System.out.print("Enter command ('exit' to stop): ");
            input = scanner.nextLine();
            System.out.println("Received: " + input);
        }

        // 2. Processing Data Streams / Iterators
        // Used extensively with Data Structures, Files, and Database ResultSets.
        System.out.println("\n2. Iterating with HasNext Patter");
        java.util.List<String> list = java.util.List.of("Node A", "Node B", "Node C");
        java.util.Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Processing: " + item);
        }

        // 3. Mathematical Manipulation (Digit Extraction / Number Reversal)
        // Useful when processing numbers where size dynamically shrinks.
        System.out.println("\n3. Extrcting Digit");
        int num = 4321;
        System.out.print("Digits of " + num + " backwrds: ");
        while (num > 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit + " ");
            num = num / 10; // Reduce number
        }
        System.out.println();
    }
}