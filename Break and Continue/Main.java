
public class Main {
public static  void main(String[] args){

    for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break; // Stops the loop entirely when i reaches 3
    }
    System.out.print(i + " ");
}
// Output: 1 2

    for (int j = 1; j <= 5; j++) {
    if (j == 3) {
        continue; // Skips printing 3 and goes straight to j = 4
    }
    System.out.println(j + " ");
}
// Output: 1 2 4 5

outerLoop:
for (int k = 1; k <= 3; k++) {
    for (int l = 1; l <= 3; l++) {
        if (k == 2 && l == 2) {
            break outerLoop; // Breaks out of the entire outer loop
        }
        System.out.println("k=" + k + ", l=" + l);
    }
}
}
}