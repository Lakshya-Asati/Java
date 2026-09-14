public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            // Trying to access an index that doesn't exist
            int result = numbers[5] / 0; 
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } catch (Exception e) {
            // General catch-all for any other exception
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            System.out.println("Cleanup completed. This block always runs.");
        }

        System.out.println("Program continues running smoothly...");
    }
}