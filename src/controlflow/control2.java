package controlflow;

import java.util.Scanner;

public class control2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int option;

        do{
            System.out.println("1. Coca");
            System.out.println("1. Pepsi");
            System.out.println("1. Water");
            System.out.println("Choose an option");

            option = input.nextInt();

            switch (option)
            {
                //using  {} here to isolate the variables declared in the block code
                case 1 ->{
                    System.out.println(" Coca [ 1.1$ ]");
                    //enhance switch case
                    System.out.println("choose an option");
                    int  innerOption = input.nextInt();


                }
                case 2 ->{
                    System.out.println(" Pepsi [ 1.4$ ]");
                }
                case 3 ->{
                    System.out.println(" Water [ 0.5$ ]");
                }
            }
        }while (option  >= 1 && option <=3);

    }
}
