import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Exercise 25
    //Create the array
//    Remove “Kenn” from the array.
//    Print the array.
//    Print the size of the array.
//    Check to see if the array contains “Kevin”. If so, get the index of “Kevin” to print.

        ArrayList<String> squadList = new ArrayList<String>();
        squadList.add("Bob");
        squadList.add("John");
        squadList.add("Kenn");
        squadList.add("Kevin");

        squadList.remove(2);
        System.out.println(squadList);
        System.out.println(squadList.size());

        if (squadList.contains("Kevin")){
            System.out.println("Kevin");
        }


    }
}
