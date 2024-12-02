package array;
import java.util.Arrays;
public class CompareArr {
    public static void main(String[] args) {

        String arr1 [] =  {"name", "age", "1000", "battambang"};
        //secoun style init
        String [] arr2  =  {"name", "age", "1000", "battambang"};
        //return as an integer
        int compare = Arrays.compare(arr1, arr2);
        boolean equal = Arrays.equals(arr1,arr2);
        System.out.println(compare);
        //return true
        System.out.println(equal);
    }
}
