package Rufiya.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        System.out.println(removeAhmed(listOfNames));

    }

    public static List<String> removeAhmed(List<String> names){

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
        return names;
    }

}

/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/

