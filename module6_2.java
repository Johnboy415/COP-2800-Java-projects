public class module6_2 {

    // method to calculate and return a sum of digits
    public static int sumDigits(long i) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        // code signature
        System.out.println(" ");
        System.out.println("2024/10/23_EspinosaJonathan_Exercise6.2");
        System.out.println(" ");

        // prints test scenarios
        System.out.println("The sum of the digits in 555-5555 is " + sumDigits(5555555));
        System.out.println("The sum of the digits in 2468  is " + sumDigits(2468));
        System.out.println("The sum of the digits in 13579  is " + sumDigits(13579));
        System.out.println("The sum of the digits in 8675309 is " + sumDigits(8675309));
        System.out.println("The sum of the digits in 0 is " + sumDigits(0));    

    }    
}

