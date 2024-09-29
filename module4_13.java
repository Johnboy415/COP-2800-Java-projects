
import java.util.Scanner;

public class module4_13 {
       
        public static void main (String[] arg) {
    
            // code signature
            System.out.println("2024/09/27_EspinosaJonathan_Exercise4.4");

            //prompt user to input a letter
            Scanner input = new Scanner (System.in);
            System.out.print("Enter a single letter ");
            String inputLetter = input.nextLine();
            input.close();

            //checks that user to entered only one character
            if (inputLetter.length() == 1 && Character.isLetter(inputLetter.charAt(0))) {
                char ch = inputLetter.charAt(0);

                //Determine if the input is a vowel, consonant, or non-letter input
                switch (Character.toLowerCase(ch))
                {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' : System.out.println(inputLetter + " is a vowel"); break;
                default : System.out.println(inputLetter + " is a consonant");
                }    
            } else {
            System.out.println(inputLetter + " is an invalid input");
            }
        }    
}
