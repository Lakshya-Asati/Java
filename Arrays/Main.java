import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] marks = new int[4];
        marks[0] = 90;
        marks[1] = 02;
        marks[2] = 65;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);/* in java if a variable is not initilised and the variable is called then there 
                                        will be null pointer stored in it and will return 0*/
        // length of marks array
        System.out.println(marks.length);

        // Sort an array
        // step 1 = import java.util.Arrays
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[2]); // at index 0 this will give 0 because index 3 is not initilised and has null value in it

        int[] marks1 = {97,95,96}; //use when marks are known

        int[][] marks2 = {{97,98,95},{99,52,87}}; // 2d array
        System.out.println(marks2[0][1]);// index 0 gives 1st array and index 1 gives marks of 1 index i.e. 1st array marks
        




        }

}
