package Rufiya.week_8;

import java.util.Arrays;

public class UniqueIntegersThatSumUpTo0 {

    public static void main(String[] args) {
        int N = 4;
        int[] result = sumZero(N);
        System.out.println(Arrays.toString(result));

        int[] result2 = sumZero_2(N);
        System.out.println(Arrays.toString(result2));
    }
    public static int[] sumZero(int N) {
        int[] result = new int[N];
        int index = 0;

        // If N is even, we create pairs of numbers
        for (int i = 1; i <= N / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If N is odd, add a 0 to the array
        if (N % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }


    public static int[] sumZero_2 (int N) {
        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1;
            sum += result[i];
        }

        result[N - 1] = -sum;

        return result;
    }

}
  /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/
