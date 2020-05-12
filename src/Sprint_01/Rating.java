package Sprint_01;
//Code origin Safar Mahmadov
import java.util.Scanner;

public class Rating {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //
        System.out.println("Thank you for your order, your your feedback is greatly appreciated, would you please rate your experience?");
        String answear = scan.nextLine(); // ask the users if they want to participate in rating - safar

        if (answear.equalsIgnoreCase("yes") || answear.equalsIgnoreCase("sure") ||answear.equalsIgnoreCase("yeah")|| answear.equalsIgnoreCase("of course") || answear.equalsIgnoreCase("why not")) {
            System.out.println("In a scale of 1 to 6 how would you rate your experience?");
            System.out.println("                                            ");
            System.out.println("1: Dissatisfied"+"\n2: Very Dissatisfied"+"\n3: Somewhat Dissatisfied"+"\n4: Somewhat Satisfied"+
                    "\n5: Satisfied"+"\n6: Very Satisfied");
            int rating = scan.nextInt();

            // my codes ends here (safar)



        }

    }
}
