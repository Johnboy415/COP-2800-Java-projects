import java.util.Scanner;

public class module4_4 {

    public static void main (String[] arg) {

        // code signature
        System.out.println("2024/09/27_EspinosaJonathan_Exercise4.4");
    
        // prompt user to input the side of a hexagon and outputs its area
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of a hexagon: ");
        double side = input.nextDouble();
        
        input.close();

        //calculate the area of a hexagon based on user input
        double area = (6 * Math.pow(side,2)) / (4 * Math.tan (Math.PI/6));;
        
        //Outputs the area of the hexagon
        System.out.printf("The area of the hexagon is %.2f\n", area);
    }
}
