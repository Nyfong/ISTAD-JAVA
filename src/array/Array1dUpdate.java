package array;

public class Array1dUpdate {
    public static void main(String[] args) {
        System.out.println("updating an array with existing elements");
        int arr [] = {1,2,3,4,5};
        for(int el =0 ; el<arr.length; el+=1){
            arr[el] = arr[el]+2;
            System.out.print(arr[el] +", ");
        }
    }
}

