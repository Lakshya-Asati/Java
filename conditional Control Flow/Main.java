public class Main {
    public static void main(String[] args) {
        
        int score = 85;
        boolean hasID = true;

        // 1. Simple If
        // Executes code if the condition is true.
        System.out.println("--- 1. Simple If ---");
        if (score >= 50) {
            System.out.println("Passed the test.");
        }

        // 2. If-Else
        // Chooses between two mutually exclusive paths.
        System.out.println("\n--- 2. If-Else ---");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: Not an A");
        }

        // 3. If-Else-If Ladder
        // Evaluates multiple conditions sequentially until one is true.
        System.out.println("\n--- 3. If-Else-If Ladder ---");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // 4. Nested If-Else
        // Places an if block inside another to check secondary conditions.
        System.out.println("\n--- 4. Nested If-Else ---");
        if (score >= 50) {
            if (hasID) {
                System.out.println("Passed and identity verified.");
            } else {
                System.out.println("Passed, but ID is required.");
            }
        }

        // 5. Ternary Operator (Shorthand If-Else)
        // Inline expression returning a value: (condition) ? trueValue : falseValue
        System.out.println("\n--- 5. Ternary Operator ---");
        String result = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}