package array;

public class ArrAccount {

    public static void main(String[] args) {

        String [][] accountDetails  = {
                {"name", "age", "1000", "battambang"},
                {"name", "age", "1000", "battambang"}
        };
        int[] tall=new int[4];

        for(String el[] : accountDetails)
        {
            int lenght = el.length;

             for(int j = 0; j < lenght; j++)
            {
                System.out.print(el[j]+ ", ");
            }


            System.out.println("");
        }

    }

}
