package array;
import java.util.Scanner;
import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        //Declaring array literal

        int[] arr = {1,2,3,10,4,5,12}; //five elements
        System.out.println(Arrays.toString(arr));
        //finding Max
        int temp =0;
        for(int i =0 ; i< arr.length; i+=1)
            for(int j =0 ; j< arr.length; j+=1)
                if(arr[j] > arr[i])   temp = arr[j];


        System.out.println(temp +" : Max value");
        int sum =0;
        //finding sum
        for(var el : arr)
        {
            sum += el;
        }
        System.out.println("Sum:" + sum);
        //finding Avg
        int avg ;
        avg = sum/arr.length;
        System.out.println("Average: "+avg);


    }


}
