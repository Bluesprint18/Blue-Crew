package Sprint_01;

import java.util.Scanner;

public class Restaurant {
    String restaurant;
    String address;
    int rating;
    String cuisineStyle;
    String phone;
    int rate;
    public void setRestaurant(String restaurant,String address,int rating,
                              String cuisineStyle,String phone){
        this.restaurant=restaurant;
        this.address=address;
        this.rating=rating;
        this.cuisineStyle=cuisineStyle;
        this.phone=phone;
    }
    public void rating(){
        System.out.println(restaurant+" Rating is: "+rating+" Star\n" +
                "Do you wanna give a feed back and Rate this order?");
       Scanner input = new Scanner(System.in);
       String answer = input.nextLine();
       if (answer.equalsIgnoreCase("yes")){
           System.out.println("Plese give your Rating");
            rate = input.nextInt();
       }if (rate>rating){
           rating++;
        }else {
           rating--;
        }
        System.out.println("thanks for your Feedback and Rating");
    }

    public String toString(){
        return "Restaurant Name: "+restaurant+"\nAddress: "+address+
                "\nRatring: "+rating+" Star\nCuisine Style: "+cuisineStyle+"\nPhone Number:"+phone;
    }
}
