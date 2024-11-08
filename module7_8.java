import java.util.Scanner;

public class module7_8 {

    public static void main(String[] args) {

        // code signature
        System.out.println(" ");
        System.out.println("2024/11/02_EspinosaJonathan_Exercise7.8");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter ten double values
        double[] doubleArray = new double[10];
        System.out.print("Please enter ten double value numbers: ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = scanner.nextDouble();
        }
        scanner.close();

        // Output the average of the double array
        System.out.println("The average of the double array is: " + average(doubleArray));
        
    }

        // Method to calculate average of an int array and return the sum
        public static int average(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
        }
            return sum / array.length; 
    }

        // Overloaded method to calculate average of a double array and return the sum
        public static double average(double[] array) {
            double sum = 0;
            for (double num : array) {
                sum += num;
        }
            return sum / array.length;
    }


}
