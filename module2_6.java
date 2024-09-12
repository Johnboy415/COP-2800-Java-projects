import java.util.Scanner;

public class module2_6 {

    public static void main (String[] args){

        // code signature
        System.out.println("2024/09/12_EspinosaJonathan_Exercise2.6");

        // create scanner object for user input
        Scanner input = new Scanner(System.in);

        // prompt user for input of subtotal and gratuity rate
        System.out.print("Enter the subtotal: ");
        double subtotal= input.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        double gratuityRate= input.nextDouble();

        //calculate gratuity and total cost
        double gratuity= subtotal * (gratuityRate/100);

        double total= subtotal + gratuity;

        //print the final total
        System.out.println("The gratuity is " + gratuity + " and the total is " + total);

        input.close();
    }    
}
