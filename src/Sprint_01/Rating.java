package Sprint_01;

import java.util.Scanner;

public class Rating {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //
        System.out.println("Thank you for your order, your your feedback is greatly appreciated, would you please rate your experience?");
        String answear = scan.nextLine(); // ask the users if they want to participate in rating - safar

        if (answear.equalsIgnoreCase("yes") || answear.equalsIgnoreCase("sure") ||answear.equalsIgnoreCase("yeah")|| answear.equalsIgnoreCase("of course") || answear.equalsIgnoreCase("why not")){
            System.out.println("in a scale of 0 to 5 how would you rate your experience?");
            int rating = scan.nextInt();
// under construction
            // the service is based on service delivery
        }
    }
}
