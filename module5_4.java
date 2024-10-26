public class module5_4 {
    public static void main(String[] args) {

        // code signature
        System.out.println("2024/10/16_EspinosaJonathan_Exercise5.4");
        
        // create header for table
		System.out.println("Miles        Kilometers");  

		// define constant value for kilometers in a mile
		final double KM_per_M = 1.609; 

		// Create loop to convert from miles to kilometers
		for (int M = 1; M <= 10; M++) {

        // print the results in a table
			System.out.printf(
				"%-13d%-10.3f\n", M, (M * KM_per_M));         

		} 
	}
}
