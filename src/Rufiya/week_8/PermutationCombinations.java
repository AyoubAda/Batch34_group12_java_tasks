package Rufiya.week_8;

public class PermutationCombinations {

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        int n = arr.length;
        permute(arr, 0, n - 1);
    }

    public static void permute(char[] arr, int startIndex, int lastIndex) {
        if (startIndex == lastIndex) {

            System.out.println(String.valueOf(arr));

        } else {
            for (int i = startIndex; i <= lastIndex; i++) {

                // Swap the current element with the startIndex element
                swap(arr, startIndex, i);

                // Recur for the next index
                permute(arr, startIndex + 1, lastIndex);

                // Backtrack to the original configuration
                swap(arr, startIndex, i);
            }
        }
    }
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
//Given an array of 3 characters print all permutation combinations from the given characters