package array;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        //just import the class BinarySearch
       /* int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 8;
        System.out.println("Searching Binary Search "+target +" is at index:"+ Arrays.binarySearch(arr, target)); */
        // Declare a 2D array with 3 rows and 4 columns
        int[][] matrix = new int[3][4];
// Print the default values of the 2D array
        System.out.println("2D Array (Uninitialized):");
        for (int i = 0; i < matrix.length; i++) {         // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {  // Loop through columns
                System.out.print(matrix[i][j] + " ");    // Print default value
            }
            System.out.println(); // Move to the next row
        }

    }
}
