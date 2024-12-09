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
        String GREEN = "\u001B[32m";
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";

        int option =0;
        //programs
        do{
            System.out.println("\n----- Welcome to Condo -------");
            System.out.println("[1].  Buy condo");
            System.out.println("[2].  Display condo information");
            System.out.println("[3].  Exit the program");
            System.out.print("Please enter option : ");
            option = sc.nextInt();

            switch (option)
            {

                case 1 ->{
                    boolean back = true;
                    while (back) {
                        System.out.print("Please enter floors number: ");
                        floorsNumber = sc.nextInt();
                        System.out.print("Please enter rooms number: ");
                        roomsNumber = sc.nextInt();

                        // Validate floor and room numbers
                        if (floorsNumber > 0 && floorsNumber <= condo.length && roomsNumber > 0 && roomsNumber <= condo[floorsNumber - 1].length) back = false; // Valid input, exit loop
                         else System.out.println(RED+"Invalid floor or room number. Please try again."+RESET);
                        // Clear the buffer after nextInt()
                        sc.nextLine();

                        // If valid, prompt for user name
                        if (back == false) {
                            System.out.print(GREEN+"Enter your name: "+RESET);
                            userName = sc.nextLine();
                            condo[floorsNumber - 1][roomsNumber - 1] = userName; // Assign user name to the condo array
                        }
                    }
                }
                case 2 ->{
                    int j=0;
                    System.out.println("---------- ***** Display all the condo information ***** ----------");
                    for( var floors : condo) {
                        int i=0;
                        j+=1;
                        System.out.println();
                        for( var rooms : floors) System.out.print((rooms == null)?
                                "floor:[ "+(j)+"], room:"+(i+=1)+ GREEN +"[ not yet have owner ]  "+  RESET+",":
                                "floor:[ "+(j)+"], room:"+(i+=1) + RED +"[ ** " + rooms +" 's room ] "+ RESET+",");
                    }

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
