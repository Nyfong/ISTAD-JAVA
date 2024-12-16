import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class CenimaBooking {
    public static void main(String[] args) {
        int rowSeat = 4, columnSeat = 4;
        int userOption;
        String userName;
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedTime = time.format(formatter);

        String GREEN = "\u001B[32m", RED = "\u001B[31m", RESET = "\u001B[0m", BLUE = "\u001B[35m";
        System.out.print(GREEN + "Please enter the hall row :" + RESET);
        rowSeat = sc.nextInt();
        System.out.print(GREEN + "Please Enter the hall seat OR column :" + RESET);
        columnSeat = sc.nextInt();

        char[] rowName = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        String[][] cenimaHall = new String[rowSeat][columnSeat];

        do {
            System.out.println(BLUE + "---------------------------------------------------------" + RESET);
            System.out.println(BLUE + "---------           BOOKING            -----------" + RESET);
            System.out.println(BLUE + "---------       SEAT   &  CINEMA       -----------" + RESET);
            System.out.println(BLUE + "---------                              -----------" + RESET);
            System.out.println(BLUE + "---------------------------------------------------------" + RESET);
            System.out.println(GREEN + "[1.] BOOKING SEAT " + RESET);
            System.out.println(GREEN + "[2.] CANCEL BOOK SEAT " + RESET);
            System.out.println(GREEN + "[3.] VIEW HISTORY BOOKING SEAT " + RESET);
            System.out.println(GREEN + "[4.] EXIT THE BOOKING SYSTEM" + RESET);
            System.out.println("---------------------------------------------------------");
            System.out.print(GREEN + "[INSERT MODE] " + RESET + " ->(enter your option here) :");
            userOption = sc.nextInt();

            switch (userOption) {
                case 1 -> {
                    int bookingOption;
                    System.out.println(BLUE + "----------********** WELCOME TO BOOKING SYSTEM **********----------" + RESET);
                    System.out.println(GREEN + "[1.] BOOKING BY CODE " + RESET);
                    System.out.println(GREEN + "[2.] BOOKING BY ROW & COL " + RESET);
                    System.out.print(GREEN + "[INSERT MODE] " + RESET + " ->(enter your option here) :");
                    System.out.println("\n");
                    bookingOption = sc.nextInt();
                    int col, row;
                    //sub case
                    switch (bookingOption) {
                        //input by the code
                        case 1 -> {
                            String userInputCode;
                            System.out.println(BLUE + "[CHOOSING] " + RESET + GREEN + "BOOKING BY CODE " + RESET);
                            System.out.print(GREEN + "[INSERT CODE] " + RESET + ": ");
                            sc.nextLine();  // Consume the newline from previous input
                            userInputCode = sc.nextLine();

                            String[] parts = userInputCode.split("-");

                            if (parts.length == 2) {
                                String letter = parts[0]; // Row letter (e.g., "A")
                                char ch = Character.toUpperCase(letter.charAt(0)); // Convert to uppercase for case insensitivity
                                String number = parts[1]; // Seat number (e.g., "1")

                                boolean isAlpha = false;
                                boolean isNumber = false;
                                int num = 0; // Default to an invalid number

                                // Validate if the letter is in rowName array (case-insensitive)
                                for (var alphabet : rowName) {
                                    if (Character.toUpperCase(ch) == alphabet) {
                                        isAlpha = true;
                                        break;
                                    }
                                }
                                // Validate if the number part is a valid integer
                                if (number.matches("\\d+")) {
                                    num = Integer.parseInt(number); // Convert number to integer
                                }

                                // Check if number is within the valid range for the row
                                if (num > 0) {
                                    for (int x = 0; x < cenimaHall.length; x++) {
                                        if (num <= cenimaHall[x].length) {
                                            isNumber = true;
                                            break;
                                        }
                                    }
                                }

                                if (isAlpha && isNumber) {
                                    // Find the row index for the selected row letter
                                    int rowIndex = -1;
                                    for (int k = 0; k < rowName.length; k++) {
                                        if (Character.toUpperCase(ch) == rowName[k]) {
                                            rowIndex = k;
                                            break;
                                        }
                                    }
                                    // Check if the seat is available (null means unbooked)
                                    if (rowIndex != -1 && cenimaHall[rowIndex][num - 1] == null) {
                                        System.out.print(GREEN + "[INSERT] " + RESET + "Your name to book the table: ");
                                        String Name = sc.nextLine();  // User's name to book the seat
                                        String addToBooking = Name + ", at: " + formattedTime;
                                        cenimaHall[rowIndex][num - 1] = addToBooking;  // Book the seat
                                        System.out.println(GREEN + "Booking successful for " + Name + " at " + letter + "-" + num + "." + RESET);
                                    } else {
                                        System.out.println(RED + "This seat is already taken or invalid. Please try again." + RESET);
                                    }
                                } else {
                                    // If either row or number is invalid
                                    System.out.println(RED + "Invalid input. Please ensure the format is 'A-1' and the seat exists." + RESET);
                                }
                            } else {
                                // If the input format is not valid
                                System.out.println(RED + "Invalid input format. Please use the format 'A-1'." + RESET);
                            }
                        }
                        case 2 -> {

                            System.out.println(BLUE + "[CHOOSING] " + RESET + GREEN + "BOOKING BY ROW & COL " + RESET);
                            System.out.print(GREEN + "[INSERT ROW] " + RESET + ":");
                            row = sc.nextInt();
                            System.out.print(GREEN + "[INSERT COL] " + RESET + ":");
                            col = sc.nextInt();
                            sc.nextLine();
                            boolean searchFound = false;
                            for (int x = 0; x < cenimaHall.length; x++)
                                for (int j = 0; j < cenimaHall[x].length; j++)
                                    if (cenimaHall[row - 1][col - 1] == cenimaHall[x][j]) searchFound = true;

                            if (cenimaHall[row - 1][col - 1] != null) {
                                System.out.println(RED + "Invalid input format. Please use the format 'A-1'." + RESET);
                                break;
                            } else {
                                System.out.println("Search found" + row + ", " + col + " Table name:" + rowName[row - 1] + "-" + col);

                                System.out.print(GREEN + "[INSERT ]  " + RESET + "  your name to book the table : ");

                                userName = sc.nextLine();
                                String addToBooking = userName + ", at : " + formattedTime;
                                cenimaHall[row - 1][col - 1] = addToBooking;
                            }
                        }
                        default -> System.out.println("Invalid option");
                    }

                }
                case 2 -> {
                    int bookingOption;
                    System.out.println(BLUE + "----------********** WELCOME TO CANCEL BOOKING SYSTEM **********----------" + RESET);
                    System.out.println(GREEN + "[1.] CANCEL BOOKING BY CODE " + RESET);
                    System.out.println(GREEN + "[2.] CANCEL BY ROW & COL " + RESET);
                    System.out.print(GREEN + "[INSERT MODE] " + RESET + " ->(enter your option here) :");
                    System.out.println("\n");
                    bookingOption = sc.nextInt();
                    int col, row;
                    //sub case
                    switch (bookingOption) {
                        //CANCEL by the code
                        case 1 -> {
                            boolean again = true;
                            String userInputCode;
                            System.out.println(BLUE + "[CHOOSING] " + RESET + GREEN + "CANCEL BOOKING BY CODE " + RESET);
                            System.out.print(RED + "[INSERT CODE] " + RESET + ":");
                            sc.nextLine();
                            userInputCode = sc.nextLine();

                            String[] parts = userInputCode.split("-");

                            // Check if input has the correct format
                            if (parts.length == 2) {
                                String letter = parts[0]; // Row letter (e.g., "A")
                                char ch = Character.toUpperCase(letter.charAt(0)); // Convert to uppercase for case insensitivity
                                String number = parts[1]; // Seat number (e.g., "1")

                                boolean isAlpha = false;
                                boolean isNumber = false;
                                int num = 0; // Default to an invalid number

                                // Check if the letter is valid (exists in rowName)
                                for (var alphabet : rowName) {
                                    if (Character.toUpperCase(ch) == alphabet) {
                                        isAlpha = true;
                                        break;
                                    }
                                }

                                // Check if the number part is a valid integer and within the valid range for the row
                                if (number.matches("\\d+")) {
                                    num = Integer.parseInt(number); // Convert number to integer
                                    // Check if number is within the valid range for the row
                                    for (int x = 0; x < cenimaHall.length; x++) {
                                        if (num <= cenimaHall[x].length) {
                                            isNumber = true;
                                            break;
                                        }
                                    }
                                }
                                // Proceed if both the row letter and seat number are valid
                                if (isAlpha && isNumber) {
                                    // Find the row index for the selected row letter
                                    int rowIndex = -1;
                                    for (int k = 0; k < rowName.length; k++) {
                                        if (Character.toUpperCase(ch) == rowName[k]) {
                                            rowIndex = k;
                                            break;
                                        }
                                    }
                                    // Check if the booking exists in the selected seat
                                    if (cenimaHall[rowIndex][num - 1] != null) {
                                        cenimaHall[rowIndex][num - 1] = null;
                                        System.out.println(RED + "Cancel Successfully" + RESET);
                                    } else {
                                        System.out.println(RED + "No booking found for the given code." + RESET);
                                    }

                                    again = false;
                                } else {
                                    System.out.println(RED + "Invalid input format. Please use the format 'A-1'." + RESET);
                                }
                            } else {
                                System.out.println(RED + "Invalid input format. Please use the format 'A-1'." + RESET);
                            }
                        }
                        //CANCEL by col row
                        case 2 -> {

                            System.out.println(BLUE + "[CHOOSING] " + RESET + GREEN + " CANCEL BOOKING BY ROW & COL " + RESET);
                            System.out.print(GREEN + "[INSERT ROW] " + RESET + ":");
                            row = sc.nextInt();
                            System.out.print(GREEN + "[INSERT COL] " + RESET + ":");
                            col = sc.nextInt();
                            sc.nextLine();
                            boolean searchFound = false;
                            for (int x = 0; x < cenimaHall.length; x++)
                                for (int j = 0; j < cenimaHall[x].length; j++)
                                    if (cenimaHall[row - 1][col - 1] == cenimaHall[x][j]) searchFound = true;

                            if (searchFound)
                                System.out.println("Search found" + row + ", " + col + " Table name:" + rowName[row - 1] + "-" + col);

                            System.out.print(GREEN + "[INSERT ]  " + RESET + "  Are you sure to CANCEL book the table ? (y/n) : ");
                            userName = sc.nextLine();
                            if (userName.equalsIgnoreCase("y")) {
                                bookingOption = 3;
                            }

                            cenimaHall[row - 1][col - 1] = null;

                        }
                        default -> System.out.println("Invalid option");
                    }
                }
                case 3 -> {
                    System.out.println(BLUE + "----------********** WELCOME TO VIEW HISTORY BOOKING SYSTEM **********----------" + RESET);
                    System.out.println("\t\t\t\t\t" + BLUE + "--------------------------------------------" + RESET);
                    System.out.println("\t\t\t\t\t" + BLUE + "--------------                 -------------" + RESET);
                    System.out.println("\t\t\t\t\t" + BLUE + "--------------     SCREEN      -------------" + RESET);
                    System.out.println("\t\t\t\t\t" + BLUE + "--------------                 -------------" + RESET);
                    System.out.println("\t\t\t\t\t" + BLUE + "--------------------------------------------" + RESET);
                    int rowAlpha = 0, bookSeatTotal = 0;
                    for (var row : cenimaHall) {
                        int aviable = 0;
                        aviable += 1;
                        int numSeat = 0;
                        numSeat += 1;
                        System.out.println(" ");
                        System.out.print("[\t");
                        for (var seat : row) {
                            System.out.print((seat != null) ?
                                    (aviable != 0 ?
                                            (rowName[rowAlpha] + "-" + (numSeat++) + " " + RED + " BO :: " + RESET + BLUE + "(" + (seat) + ". ) " + RESET + ",\t")
                                            :
                                            ("0-" + aviable + " " + RED + " BO ," + RESET + "(" + seat + "),\t"))
                                    : (rowName[rowAlpha] + "-" + (numSeat++) + " " + GREEN + " Av ," + RESET + "(" + " have a seat ) \t"));
                            if (seat != null) bookSeatTotal += 1;
                        }
                        System.out.println(" ]");
                        rowAlpha += 1;
                    }
                    System.out.println("\n************ The total book seat is = " + bookSeatTotal);
                    //new line
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.println("BYE BYE");
                    userOption = -1;
                }
                default -> System.out.println("Invalid option");
            }
        } while (userOption < 4 && userOption > 0);
    }
}