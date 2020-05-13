package Sprint_01;
//Code origin Safar Mahmadov
import java.util.Scanner;

public class Rating {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //
        System.out.println("Thank you for your order, your your feedback is greatly appreciated, would you please rate your experience?");
        String answear = scan.nextLine(); // ask the users if they want to participate in rating - safar

        if (answear.equalsIgnoreCase("yes") || answear.equalsIgnoreCase("sure") ||answear.equalsIgnoreCase("yeah")|| answear.equalsIgnoreCase("of course") || answear.equalsIgnoreCase("why not")) {
            System.out.println("In a scale of 0 to 5 how would you rate your experience?");
            System.out.println("                                            ");
            System.out.println("1: Dissatisfied"+"\n2: Somewhat Dissatisfied"+"\n3: Somewhat Satisfied"+
                    "\n4: Satisfied"+"\n5: Very Satisfied");
            int rating = scan.nextInt();
            
            // my codes ends here (safar)
//<<<<<<< HEAD




//=======
            //Aigerim code aka Ika911
            if(rating==1){
                System.out.println("*");
            }else if(rating==2){
                System.out.println("**");
            }else if(rating==3){
                System.out.println("***");
            }else if(rating==4){
                System.out.println("****");
            }else if(rating==5){
                System.out.println("*****");
          //  }else if(rating==5){
            //    System.out.println("***** ");
            }
            //Aigerim: thats it for now...to be continued...
// under construction
//>>>>>>> 6bb761d8afc6d8e07aa2dfc4a50f59aa888e7391
        }

    }
}
