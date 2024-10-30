import java.util.Scanner;

public class module6_5 {


    public static void main(String[] args) {

         // code signature
        System.out.println(" ");
        System.out.println("2024/10/27_EspinosaJonathan_Exercise6.5");
        System.out.println(" ");
        
        // create a Scanner object to read input
        Scanner number = new Scanner(System.in);

        // prompt the user to enter three numbers
        System.out.print("Enter any three numbers: ");
        double Num1 = number.nextDouble();
        double Num2 = number.nextDouble();
        double Num3 = number.nextDouble();

        // use method to display sorted numbers
        sortedNum(Num1, Num2, Num3);
        
        // close the scanner
        number.close();

        
    }

    public static void sortedNum(double Num1, double Num2, double Num3) {
        double tempNum;

        // sorts the numbers
        if (Num1 > Num2) {
            tempNum = Num1;
            Num1 = Num2;
            Num2 = tempNum;
        }
        if (Num1 > Num3) {
            tempNum = Num1;
            Num1 = Num3;
            Num3 = tempNum;
        }
        if (Num2 > Num3) {
            tempNum = Num2;
            Num2 = Num3;
            Num3 = tempNum;
        }
        
        // print the sorted results
        System.out.println("The numbers in increasing numerical order are: " + Num1 + ", " + Num2 + ", " + Num3);

    }
}
