import java.util.Scanner;

public class module2_1 {
    
    public static void main(String[] args) {

        // code signature
        System.out.println("2024/09/12_EspinosaJonathan_Exercise2.1");

        // create scanner object for user input
        Scanner input = new Scanner(System.in);

        // statement for user input
        System.out.print("Enter a tempature in Celsius: ");

        // user input celsius tempature here
        double celsius = input.nextDouble();

        // conversion formula for celsius to fahrenheit
        double fahrenheit= (9.0/5)*celsius + 32;

        // prints the result of the temp calculation
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        
        // close input
        input.close();
    }
}
