//Aaron

import java.util.Arrays; 

public class Main {
    public static void main(String[] args) {

//Problem 1
        int[] array1 = {1, 2, 3, 2, 2, 5};
        System.out.println("Count of 2: " + PracticeProblems.countOccurrences(array1, 2));

//Problem 2
        int[] reversed = PracticeProblems.reverseArray(array1);
        System.out.println("Reversed: " + Arrays.toString(reversed));
//Problem 3
        double[][] grid = {
            {1.5, 2.5, 3.5},
            {4.0, 5.0, 6.0}
        };
        System.out.println("Grid Sum: " + PracticeProblems.sumGrid(grid));
//Problem 4
        System.out.println("Fib(6): " + PracticeProblems.fib(6)); 
    }
}
