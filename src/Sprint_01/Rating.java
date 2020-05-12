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
<<<<<<< HEAD

            // my codes ends here (safar)



=======
            //Aigerim code aka Ika911
            if(rating==0){
                System.out.println("Extremely bad, I wouldn't recommend");
            }else if(rating==1){
                System.out.println("Not Extremely bad");
            }else if(rating==2){
                System.out.println("Ok");
            }else if(rating==3){
                System.out.println("Good");
            }else if(rating==4){
                System.out.println("Very good, I would recommend");
            }else if(rating==5){
                System.out.println("Extremely good, I would recommend and will be back again");
            }
            //Aigerim: thats it for now...to be continued...
// under construction
>>>>>>> 6bb761d8afc6d8e07aa2dfc4a50f59aa888e7391
        }

    }
}
