package bankingLombok;
import bankingLombok.model.User;
import bankingLombok.model.Account;
import bankingLombok.model.CreditAccount;
import bankingLombok.model.SavingAccount;
import java.time.Instant;
import java.time.LocalDateTime;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //table for printing
        Table table = new Table(8, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        String columNames[] = {"ID","UUID","User Name","Email","Password","Is Deleted","Is Verified", "Created Date"};
        for(int i=0;i<columNames.length;i++){
            table.addCell(columNames[i], new CellStyle(CellStyle.HorizontalAlign.center));
            table.setColumnWidth(i,20,30);

        }
        User user = new User();
        user.inputUserInfo();
        table.addCell(user.id.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.uuid, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.userName, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.email, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.password, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.isDeleted.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.isVerified.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.createdDate.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        System.out.println(table.render());
        //user operation
        Account operation = new Account("Ny Fong");
        Account creditCardAccount = new CreditAccount("527-998-098-440-8225",
                LocalDateTime.of(2026,1,1,1,1),
                "333");

        Scanner scanner = new Scanner(System.in);
        int  option = 0;
        int supspend = 0;
        boolean condition = true;
        while (condition && option !=3 ) {
            System.out.println("Enter an option");
            System.out.println("[1] Using a Saving account");
            System.out.println("[2] Using a Credit account");
            System.out.println("[3] Exit the program");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> operation.processTransaction();
                case 2 -> creditCardAccount.processTransaction();
                default -> {
                    supspend += 1;
                    if (supspend == 3) {
                        System.out.println(creditCardAccount.redText + "You have banned for 10 years" + creditCardAccount.resetText + "\t" +creditCardAccount.lennyFace) ;
                        condition = !condition;
                    }
                    else if (option == 3) System.out.println("bye bye");

                    else  System.out.println("Invalid Option, please try again");
                    }
                }
            }

    }

}


