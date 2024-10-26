public class module5_7 {
    public static void main(String[] args) {

         // code signature
         System.out.println("2024/10/18_EspinosaJonathan_Exercise5.4");

        double tuition = 10000;
        double fourYearMark = 0;
        for (int t = 0; t < 14; t++) {
            tuition *= 1.05;

            if (t >= 10) {
                fourYearMark += tuition;
            }

            if (t == 0 || t == 10) {
                System.out.printf("In %1d year the tuition will be $%,.3f\n", (t + 1), tuition);
            } else {
                System.out.printf("In %1d years it will be $%,.3f\n", (t + 1), tuition);
            }
        }
        System.out.printf("After the tenth year, the cost of four years' worth of tuition will be $%,.3f", fourYearMark);

    }
}
