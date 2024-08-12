package Rufiya.week_8;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {
        int [] arr = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveZeros(arr)));
    }
    public static int[] moveZeros(int[] nums){

        int[] moved = new int[nums.length];
        int index = 0;

        for(int each : nums){

            if(each != 0){
                moved[index++] = each;

            }
        }
        return moved;
    }
}
 /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/