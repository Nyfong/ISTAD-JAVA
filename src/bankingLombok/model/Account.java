package bankingLombok.model;

import java.util.NoSuchElementException;
import java.util.Scanner;

import bankingLombok.service.BankingService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Account implements BankingService {
    private double cash = 0.0;
    private String accountName;
    private final double interestRateRiel = 4000.00;
    private final double interestRateUSD = 1.00;
    public int option = 0, supspend = 0;
    public String greenText = "\033[32m", redText = "\033[31m", resetText = "\033[0m", lennyFace = " ( ͡° ͜ʖ ͡°) ";;

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public Account() {
    }

    @Override
    public void withdraw(double cash) {
        if (cash > this.cash) {
            System.out.println(redText + "[!] Cannot withdraw, because your balance is not enough" + resetText);
            return;
        }
        this.cash -= cash;// this.cash = this.cash-cash;
        System.out.println(greenText + "[+] Your transaction in " + accountName + " account" + " withdrawn successfully" + resetText);
    }

    @Override
    public void deposit(double cash) {
        if (cash <= 0.0) {
            System.out.println(redText + "[!] Cannot deposit :(" + resetText);
            return;
        }
        this.cash += cash;
        System.out.println(greenText + "[+] Your transaction in " + this.accountName + " account" + " deposited successfully" + resetText);
    }

    @Override
    public void showBalance() {
        System.out.println("======================");
        System.out.println("[+] Your balance: " + this.cash + " $");
    }

    @Override
    public void getKHCurrency() {

        System.out.println("======================");
        System.out.println("[+] Your balance: " + this.cash * interestRateRiel + " RIEL");

    }

    @Override
    public void getDollarCurrency() {
        System.out.println("======================");
        System.out.println("[+] Your balance: " + this.cash * this.interestRateUSD + " USD");

    }

    // method for the processing
    public void processTransaction() {
        boolean condition = true;

        while (condition && supspend < 3){
            System.out.println(this.greenText + "===================== ATM ========================" + this.resetText);
            System.out.println("[1]. Deposit cash (+$) ");
            System.out.println("[2]. Withdraw cash (-$) ");
            System.out.println("[4]. Show all balance ($) ");
            System.out.println("[4]. See Exchange Khmer (KHR) ");
            System.out.println("[5]. See Exchange US Dollar (USD) ");
            System.out.println("[6]. ( <- ) Back to origin ");
            Scanner scan = new Scanner(System.in);
            //scan the option
            System.out.print("Please Enter the Option \n[->] : ");
            option = scan.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Enter the amount to deposit");
                    double amount = scan.nextDouble();
                    deposit(amount);
                }
                case 2 -> {
                    System.out.println("Enter the amount to withdraw");
                    double amount = scan.nextDouble();
                    withdraw(amount);
                }
                case 3 -> {
                    showBalance();
                }
                case 4 -> {
                    getKHCurrency();
                }
                case 5 -> {
                    getDollarCurrency();
                }
                case 6 -> {
                    condition = false;
                }
                case 7-> {
                    System.out.println("Thank you for using Banking Lombok");
                    condition = !condition;
                }
                default -> {
                    supspend += 1;
                    if (supspend == 3) {
                        System.out.println(this.redText + "You have banned for 10 years" + this.resetText + "\t" + this.lennyFace) ;
                        System.exit(0);
                    }
                  else  System.out.println("Invalid Option, please try again");
                }
            }
        }
    }
}