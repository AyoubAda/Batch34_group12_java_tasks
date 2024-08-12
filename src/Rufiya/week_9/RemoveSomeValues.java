package Rufiya.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList( 10, 100, 789, 555, 4, 8, 0, 110,  1000, -10));
        System.out.println(removeMoreThan100(nums));

        System.out.println(removeMoreThan100_2(nums));
    }

    public static List<Integer> removeMoreThan100(List<Integer> nums){

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            if(it.next() > 100){
                it.remove();
            }
        }
        return nums;
    }

    public static List<Integer> removeMoreThan100_2(List<Integer> nums){
        nums.removeIf(p -> p > 100);

        return nums;
    }

}

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.