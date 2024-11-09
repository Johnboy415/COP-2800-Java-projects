import java.util.Scanner;

public class module7_15 {

    public static void main(String[] args) {

        // code signature
        System.out.println(" ");
        System.out.println("2024/11/07_EspinosaJonathan_Exercise7.15");
        System.out.println(" ");

        //create scanner
        Scanner input = new Scanner(System.in);
       
        // create an array to store user input
        int[] list = new int[10];
        
        // prompt user for ten numbers
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        
        // close input
        input.close();
   
    }
    // remove duplicates from the list and returns the list
    public static int[] nonDuplicates(int[] list) {
		int[] distinctNumbers = new int[list.length];
		int i = 0;	
		for (int n: list) {
			if (linearSearch(distinctNumbers, n) == -1) {
				distinctNumbers[i] = n; i++;
			}
		}
		return distinctNumbers;
	}

	// linear search
	public static int linearSearch(int[] count, int key) {
		for (int i = 0; i < count.length; i++) {
			if (key == count[i])
				return i;
		}
		return -1;

        // new array with duplicates removed
        int[] distinctNumbers = nonDuplicates(list);

        // display the new array
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            if (num > 0)
                System.out.print(num + " ");
        }
	}
}