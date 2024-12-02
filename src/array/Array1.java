package array;
import java.util.Scanner;
import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        //Declaring array literal

        int[] arr = {1,2,3,4,5}; //five elements

        System.out.println(arr.length); // length is the build in length property
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        System.out.println(Arrays.toString(arr));





    }


}
