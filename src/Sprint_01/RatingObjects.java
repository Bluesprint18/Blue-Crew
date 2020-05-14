package Sprint_01;
//Code origin Safar Mahmadov
import java.util.Scanner;

public class RatingObjects {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //
        System.out.println("Thank you for your order, your your feedback is greatly appreciated, would you please rate your experience?");
        String answer = scan.nextLine(); // ask the users if they want to participate in rating - safar

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("sure") ||answer.equalsIgnoreCase("yeah")|| answer.equalsIgnoreCase("of course") || answer.equalsIgnoreCase("why not")) {
            System.out.println("In a scale of 1 to 5 how would you rate your experience?");

            System.out.println("1: Dissatisfied"+"\n2: Somewhat Dissatisfied"+"\n3: Somewhat Satisfied"+
                    "\n4: Satisfied"+"\n5: Very Satisfied");
            int rating = scan.nextInt();



            // my codes ends here (Safar)


            //Aigerim code aka Ika911
            if(rating==1){
                System.out.println("*");
            }else if(rating==2){
                System.out.println("**");
            }else if(rating==3){
                System.out.println("***");
            }else if(rating==4){
                System.out.println("****");
            }else if(rating==5) {
                System.out.println("*****");
            }

            //Aigerim: that's it for now...to be continued...
            //Ika911 continues
            System.out.println("Comment down bellow and earn 5 points");
            System.out.println("Would you like to leave a comment?");
             String comment=scan.next();
             if(comment.equalsIgnoreCase("no")){
                 System.out.println("Thank you for your time!");
             }else if(comment.equalsIgnoreCase("yes")){
                 System.out.println("Any feedback is appreciate. How did we do?");
                 comment=scan.next();
                 System.out.println("Thank you for your comment! You just earned 5 points");
                 System.out.println("Would you like to redeem your points?");
                 answer=scan.next();
             }
             //Ika911 for redeeming i need to create class "POINTS" so i will just stop here

// under construction


            /*
            Team please list your ideas down below on how we can improve the Rating func:
            To do tasks:
          users can leave comments when they rate the delivery service  - Safar
          come up with a codes that can take multiple inputs (ratings), then
          calculate and display average rating -Baihetiyaer

             */

        }

    }
}
