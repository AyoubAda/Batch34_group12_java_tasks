package Rufiya.week_7;

public class FindMinimum {
    public static void main(String[] args) {
        int[] arr = {5,7,10,2,3};
        System.out.println(minNum(arr));
    }

    public static int minNum(int[] arr){
        int min = arr[0];
        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

}
// Write a method that can find the minimum  number from an int Array