package Sprint_01;
//Code origin Safar Mahmadov
import java.util.Scanner;

public class Rating {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for your order, your your feedback is greatly appreciated, would you please rate your experience?");
        String answear = scan.nextLine();

        if (answear.equalsIgnoreCase("yes") || answear.equalsIgnoreCase("sure") ||answear.equalsIgnoreCase("yeah")|| answear.equalsIgnoreCase("of course") || answear.equalsIgnoreCase("why not")){
            System.out.println("in a scale of 0 to 5 how would you rate your experience?");
            int rating = scan.nextInt();
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
        }
    }
}
