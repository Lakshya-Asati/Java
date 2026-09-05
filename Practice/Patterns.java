import java.util.Scanner;
class Q3 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.print("Enter number: ");

    int num = myObj.nextInt();
    for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

  }
}