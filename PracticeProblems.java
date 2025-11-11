//Aaron
public class PracticeProblems {

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }


    public static double sumGrid(double[][] grid) {
        double sum = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                sum += grid[row][col];
            }
        }
        return sum;
    }

    public static int fib(int n) {
        if (n == 0) return 0;   
        if (n == 1) return 1;   

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}

