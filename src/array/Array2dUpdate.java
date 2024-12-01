package array;

import java.util.Arrays;

public class Array2dUpdate {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nTechnique 3: Stream API Transformation");
        array = Arrays.stream(array)
                .map(row -> Arrays.stream(row)
                        .map(num -> num * 2) // Simply multiply each element by 2
                        .toArray())
                .toArray(int[][]::new);
        System.out.println(Arrays.deepToString(array));
    }

}
