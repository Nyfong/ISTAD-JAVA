package controlflow;

import java.util.Locale;
import java.util.Scanner;

public class control3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to controlflow");
        int option =0;
        do{


            System.out.println("=========Welcome to Wages control3==========");
            //ENUM
            enum DAY {
                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
                SATURDAY, SUNDAY
            }
            //MENU
            System.out.println("1. calculate wages");
            System.out.println("2. Money Exchange");
            System.out.println("5. Exit");
            option = input.nextInt();


            switch (option) {
                //calculate wages
                case 1:{
                    float hour, salary, result;
                    String day;
                    DAY enumDay;

                    System.out.println("Enter the number of hour : ");
                    hour = input.nextFloat();
                    System.out.println("Enter the number of salary : ");
                    salary = input.nextFloat();
                    System.out.println("Enter Day");
                    day = input.next();

                    result = hour * salary;
                    System.out.println("========= ** Result  ** ==========");
                    System.out.println((hour>1)?"Total hour:"+(int)hour +" hrs":"Total hour:"+ (int)hour  +" hr");
                    System.out.println("Total wages:"+result );

                    enumDay = DAY.valueOf(day.toUpperCase());
                    float finalResult= switch (enumDay){
                        case DAY.SATURDAY, DAY.SUNDAY -> result*2;
                        default -> result;
                    };
                    System.out.println("Result is : "+finalResult);

                }break;
                //momey exchange
                case 2:{

                    System.out.println("1. KHR to USD");
                    System.out.println("2. USD to KHR");
                    float amountOfMoney, exchangeMoney ;
                    System.out.println("Enter the option : ");
                    option = input.nextInt();
                    String  currencySymbol = "";
                    float moneyExchange = switch (option){
                        case 1 ->{
                            currencySymbol = "$"; // USD symbol
                            System.out.println("======= KHR to USD =========");
                            System.out.println("Enter the amount to calculate : ");
                            System.out.println("Enter amount of Money (KHR R)");
                            amountOfMoney = input.nextFloat();
                            exchangeMoney= amountOfMoney / 4100;
                            yield  exchangeMoney;
                        }
                        case 2 ->{
                            currencySymbol = "R"; // KHR symbol
                            System.out.println("======= USD to KHR =========");
                            System.out.println("Enter the amount to calculate : ");
                            System.out.println("Enter amount of Money (USD $)");
                            amountOfMoney = input.nextFloat();
                            exchangeMoney= amountOfMoney * 4100;
                            yield  exchangeMoney;
                        }
                        default -> 0;
                    };
                    if (moneyExchange != 0) {
                        System.out.printf("Here is your exchanged money: %.2f %s%n", moneyExchange, currencySymbol);
                        System.out.println("Thank you for using our Exchange Service.");
                    }
                } break;

                default:{
                    System.out.println("Invalid option");

                }break;
            }
            //can not use <=5 cuz the program take from switch ignore the condition
        }while (option < 6 && option >=1 && option !=5 );

    }
}
