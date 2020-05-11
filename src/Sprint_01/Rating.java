package Sprint_01;

import java.util.Scanner;

public class Rating {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for your order, your feadback is very important to us, would you please rate your experioence?");
        String answear = scan.nextLine();

        if (answear.equalsIgnoreCase("yes") || answear.equalsIgnoreCase("sure") ||answear.equalsIgnoreCase("yeah")|| answear.equalsIgnoreCase("of course") || answear.equalsIgnoreCase("why not")){
            System.out.println("From scale of 0 to 5; 5 being the best what you give?");
            int rating = scan.nextInt();

        }
    }
}
