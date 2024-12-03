package array;
import java.util.Scanner;
import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        //Declaring array literal

        int[] arr = {1,2,3,10,4,5,12}; //five elements
        //finding Max
        int temp =0;
        for(int i =0 ; i< arr.length; i+=1)
        {
            for(int j =0 ; j< arr.length; j+=1)
            {
                if(arr[j] > arr[i])
                {
                     temp = arr[j];
                }
            }
        }
        System.out.println(temp +" : Max value");






    }


}
