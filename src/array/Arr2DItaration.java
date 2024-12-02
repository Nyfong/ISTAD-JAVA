package array;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class Arr2DItaration {

    public static void main(String[] args) {

        int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        List<Integer> list = new ArrayList<>(); // Flatten the 2D array into a list
        for (int[] row : array) {
            for (int element : row) {
                list.add(element);
            }
        }
        System.out.println(list);
        // Use an iterator to traverse the list
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }

    }
}
