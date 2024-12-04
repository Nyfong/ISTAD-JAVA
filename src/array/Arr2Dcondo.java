package array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2Dcondo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floorsNumber, roomsNumber;
        String userName="";
        System.out.println("----- Construction the Condo -------");
        System.out.print("Please enter floors number : ");
         floorsNumber = sc.nextInt();
        System.out.print("Please enter rooms number : ");
         roomsNumber = sc.nextInt();
        String condo[][] = new String[floorsNumber][roomsNumber];
        System.out.println("The condo have"+ Arrays.deepToString(condo));

        int option =0;
        //programs
        do{
            System.out.println("----- Welcome to Condo -------");
            System.out.println("[1].  Buy condo");
            System.out.println("[2].  Display condo information");
            System.out.println("[3].  Exit the program");
            System.out.print("Please enter option : ");
            option = sc.nextInt();

            switch (option)
            {
                case 1 ->{

                    System.out.print("Please enter floors number : ");
                    floorsNumber = sc.nextInt();
                    System.out.print("Please enter rooms number : ");
                    roomsNumber = sc.nextInt();
                    // Clear the buffer after nextInt()
                    sc.nextLine();
                    System.out.print("Enter your name:");
                    userName = sc.nextLine();
                    condo[floorsNumber -1][roomsNumber -1 ] = userName;
                }
                case 2 ->{
                    System.out.println("Display all the condo information");
                    for( var floors : condo)
                        for( var rooms : floors) System.out.println((rooms == null)? "not yet have owner": rooms +" 's room ");
                }
                case 3 -> {
                    System.out.println("Exit the program");
                    System.out.println("BYE BYE! ");
                    option =-1;
                }
                default -> System.out.println("Invalid option");
            }

        }while(option >0  && option < 4);

    }
}
