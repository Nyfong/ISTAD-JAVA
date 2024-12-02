package array;
import java.util.Arrays;
public class CopyOfArr
{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        //loop for each
        for( int i : arr)
        {
            //printting
            System.out.print(i+", ");
        }
        System.out.println("");
        // first augument is arrayName and second is the How many length
        int [] arr2 = Arrays.copyOf(arr, arr.length);
        arr2[2] = 10;
        for( int i : arr2)
        {
            //printting
            System.out.print(i+", ");
        }
    }
}
