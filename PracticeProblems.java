public class PracticeProblems {
    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int element : arr) {
            if (element == n) {
                count++;
            }
        }
        return count;
    }
}
