package Rufiya.week_1;

public class Finra {
    public static void main(String[] args) {
        finra(30);
    }
    public static void finra(int n){


        for(int i = 1; i <= n; i++){

            if(i % 3 == 0){
                System.out.println("FIN");
            } else if(i % 5 == 0){
                System.out.println("RA");
            } else if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FINRA");
            } else {
                System.out.println(i);
            }
        }
    }
}
/*
 Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and
 for numbers which are a multiple of 5, print "RA" instead of the number.
 for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

 */