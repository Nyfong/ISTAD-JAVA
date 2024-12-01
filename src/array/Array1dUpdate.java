package array;
import java.util.Arrays;

public class Array1dUpdate {
    public static void main(String[] args) {
        System.out.println("updating an array with existing elements");
        int arr [] = {1,2,3,4,5};
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        System.out.println("arr forLoop elements");
//        for(int el =0 ; el<arr.length; el+=1){
//            arr[el] = arr[el]+2;
//            System.out.print(arr[el] +", ");
//        }
        //display with the do while loop
       /* System.out.println("arr do while elements");
        int el =0;
        boolean True = true;
        do{
            System.out.print(arr[el] +", ");
            el+=1;
            if(el == arr.length)
            {
                True = !True;
            }
        }while(True);

        */
       /* System.out.println("\n arr while elements");
        int index =0;
        boolean True = true;
        while (True){
            System.out.print(arr[index] +", ");
            index+=1;
            if(index == arr.length)
            {
                True = !True;
            }
        }
        */
        System.out.println("\nTechnique 3: Stream API Transformation");
        array = Arrays.stream(array)
                .map(row -> Arrays.stream(row)
                        .map(num -> num * 2) // Simply multiply each element by 2
                        .toArray())
                .toArray(int[][]::new);
        System.out.println(Arrays.deepToString(array));
    }
}
