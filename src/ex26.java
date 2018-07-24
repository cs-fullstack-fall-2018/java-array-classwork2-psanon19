import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;

public class ex26 {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<String>();
        studentList.addAll(Arrays.asList("Bob", "John", "Kenn", "Kevin"));
        StudentList(studentList);
    }
    public static void StudentList(ArrayList<String> studentList){
        System.out.println(studentList.get(2));
    }
}
