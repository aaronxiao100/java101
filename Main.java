public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 3};
        int n = 3;

        int occurrences = PracticeProblems.countOccurrences(arr, n);
        System.out.println("The number " + n + " appears " + occurrences + " times in the array.");

    }
}
