import java.util.Scanner;

public class module3_11 {    

    public static void main(String[] args) {

        // code signature
        System.out.println("2024/09/19_EspinosaJonathan_Exercise3.11");

        // prompt user to input month and year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month between (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter a year (yyyy): ");
        int year = input.nextInt();

        //create restrictions on inputs and print outputs for past and future years
        if (month < 1 || month > 12) {
            System.out.println("month doesn't exist");
        } else if (year > 2024) {
            System.out.println(monthName(month) + " " + year + " will have " + numberOfDays(month, year) + " days");
        }    else {
            System.out.println(monthName(month) + " " + year + " had " + numberOfDays(month, year) + " days");
        }
        input.close();
    }
        // determines name of the month based on the month that the user inputs
        public static String monthName(int month) {
            if (month == 1) {
                return "January";
            } else if (month == 2) {
                return "February";
            } else if (month == 3) {
                return "March";
            } else if (month == 4) {
                return "April";
            } else if (month == 5) {
                return "May";
            } else if (month == 6) {
                return "June";
            } else if (month == 7) {
                return "July";
            } else if (month == 8) {
                return "August";
            } else if (month == 9) {
                return "September";
            } else if (month == 10) {
                return "October";
            } else if (month == 11) {
                return "November";
            } else if (month == 12) {
                return "December";
            } else {
                return "month doesn't exist";
            }
        }
 
        // calculates the number of days in the inputted month based on the year inputted
        public static int numberOfDays(int month, int year) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            } else if (month == 2) {
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
                    return 29;
                else
                    return 28;
            } else {
                return 30;
            }
        }  
}
