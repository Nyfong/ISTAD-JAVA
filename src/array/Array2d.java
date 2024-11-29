package array;

public class Array2d {
    public static void main(String[] args) {

        System.out.println("testing array 2 dementional");
        int [][] twoDemiontionalArray = new int[2][3];

        for   (int i = 0; i < twoDemiontionalArray.length; i++ )
        {
            for (int j = 0; j < twoDemiontionalArray[i].length; j++)
            {
                twoDemiontionalArray[i][j] = i;
            }
        }

        for(int row = 0; row < twoDemiontionalArray.length; row++)
        {
            for(int col = 0; col < twoDemiontionalArray[row].length; col++)
            {
                System.out.print(twoDemiontionalArray[row][col]);
            }
        }


    }
}
