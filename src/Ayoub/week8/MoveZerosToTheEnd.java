package Ayoub.week8;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    //public static void moveZerosToEnd(int[] arr)
    
     public static void moveZerosToTheEndOfTheArray(int[]arr){
         // initializing our Index variable to 0. the variable Index will hold the non-zero element
        int index = 0;


        // go through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // add the remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToTheEndOfTheArray(arr);
        System.out.println(Arrays.toString(arr));

        // Output: [1, 2, 3, 4, 0, 0, 0, 0]
    
    }
}
/*Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/



