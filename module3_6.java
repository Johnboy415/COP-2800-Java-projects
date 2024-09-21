import java.util.Scanner;

public class module3_6 {

    //
    public static void main(String args[]){

        // code signature
        System.out.println("2024/09/19_EspinosaJonathan_Exercise3.6");

        //declare variables
        double pounds, inches, feet, bmi;

        //create inputs for weight and height then prompts user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();
        System.out.print("Enter feet: ");
        feet = input.nextDouble();
        System.out.print("Enter inches: ");
        inches = input.nextDouble();

        //uses input to calculate and output BMI
        inches = feet*12 + inches;
        bmi = (pounds * 703 / inches)/ inches;
        System.out.println("BMI is "+bmi);

        //determines BMI category based on inputs and outputs result
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi >25 && bmi<29.9){
            System.out.println("Overweight");
        }
        else if(bmi > 30){
            System.out.println("Obese");
        }
        input.close();
    }
}
