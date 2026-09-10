import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // 1. Standard For Loop
        // Best when the exact number of iterations is known ahead of time.
        System.out.println("--- 1. Standard For Loop ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Count: " + i);
        }

        // 2. Enhanced For Loop (For-Each)
        // Best for iterating through arrays or collections sequentially.
        System.out.println("\n--- 2. Enhanced For-Each Loop ---");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 3. While Loop
        // Best when looping until a condition becomes false, without fixed step counts.
        System.out.println("\n--- 3. While Loop ---");
        int count = 1;
        while (count <= 3) {
            System.out.println("While Count: " + count);
            count++;
        }

        // 4. Do-While Loop
        // Guarantees execution of the body AT LEAST ONCE before checking the condition.
        System.out.println("\n--- 4. Do-While Loop ---");
        int number = 10;
        do {
            System.out.println("Runs at least once, number: " + number);
            number++;
        } while (number < 5); // Condition is false, loop terminates after 1 execution

        // 5. Stream.forEach (Functional Loop - Java 8+)
        // Best for functional programming patterns and stream operations on collections.
        System.out.println("\n--- 5. Stream forEach ---");
        List<String> items = Arrays.asList("Item A", "Item B", "Item C");
        items.forEach(item -> System.out.println("Stream Item: " + item));
    }
}