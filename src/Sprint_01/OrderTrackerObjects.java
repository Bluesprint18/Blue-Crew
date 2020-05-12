package Sprint_01;

import java.util.Scanner;

public class OrderTrackerObjects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for your order!");
        System.out.println("Would you like to track your order?");
        String answer = scan.next();
        answer.toLowerCase();
        if (answer.equals("no")) {
            System.out.println("Thank you! Your order will be delivered shortly");
        } else {
            System.out.println("Thank you for entering your info!");
            System.out.println("Your order will be automativally in OrderTracker");

            OrderTracker order1 = new OrderTracker();
            order1.setInfo("4 beef tacoes, 4 sodas, 2 strawberry cheescakes",
                    5750, "Broadway street, Sacramento CA",
                    95840, 916, 5957471);
            order1.NotificationByText();
            order1.seeOnMap();
            System.out.println(order1);
        }



}

}
