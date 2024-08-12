package Rufiya.week_9;

import java.util.Arrays;

public class Concat2Arrays {

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5,};
        int [] arr2 = {6, 7, 8 , 9 , 10};

        System.out.println(Arrays.toString(concat_arrays(arr1, arr2)));

    }
    public static int[] concat_arrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];


        for(int i = 0, y = 0; i < merged.length; i++){

            if(i < arr1.length){
                merged[i] = arr1[i];
            } else {
                merged[i] = arr2[y++];
            }

        }

        return merged;
    }
}
//Write a return method that can concate two arrays
