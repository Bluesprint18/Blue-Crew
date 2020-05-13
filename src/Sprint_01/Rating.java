package Sprint_01;
//Code origin Safar Mahmadov
import java.util.Scanner;

public class Rating {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //
        System.out.println("Thank you for your order, your your feedback is greatly appreciated, would you please rate your experience?");
        String answer = scan.nextLine(); // ask the users if they want to participate in rating - safar

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("sure") ||answer.equalsIgnoreCase("yeah")|| answer.equalsIgnoreCase("of course") || answer.equalsIgnoreCase("why not")) {
            System.out.println("In a scale of 0 to 5 how would you rate your experience?");
            System.out.println("                                            ");
            System.out.println("1: Dissatisfied"+"\n2: Somewhat Dissatisfied"+"\n3: Somewhat Satisfied"+
                    "\n4: Satisfied"+"\n5: Very Satisfied");
            int rating = scan.nextInt();
//<<<<<<< HEAD

<<<<<<< HEAD
            // my codes ends here (Safar)
//=======
            
            // my codes ends here (safar)
//>>>>>>> 808814cb24f2d1d9a67c19ef21afec86c4316024
//<<<<<<< HEAD
=======
            // my codes ends here (Safar) -------------------------------
>>>>>>> 44de166bc6bc53e7dbd2c5461153cadbc7e69962


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


          //  }else if(rating==5){
            //    System.out.println("***** ");
            }
            //Aigerim: that's it for now...to be continued...
// under construction


            /*
            Team please list your ideas down below on how we can improve the Rating func:
            To do tasks:
          users can leave comments when they rate the delivery service  - Safar
          come up with a codes that can take multiple inputs (ratings), then calculate and display average rating -Baihetiyaer

             */

        }

    }
}
