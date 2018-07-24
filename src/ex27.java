import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;

public class ex27 {

    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        numberArray.add(5);
        numberArray.add(10);
        numberArray.add(2);
        numberArray.add(8);
        numberArray.add(7);
        printIntArray(numberArray);
    }
    public static void printIntArray(ArrayList<Integer> intArray){
       System.out.println(intArray);
    }
}
