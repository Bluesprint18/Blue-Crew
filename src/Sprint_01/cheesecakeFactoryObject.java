package Sprint_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

import static Sprint_01.CheesCakes.*;
import static Sprint_01.IceCreamDelights.*;
import static Sprint_01.SpecialtyDesserts.*;

public class cheesecakeFactoryObject {

    public static void main(String[] args) {
        // Here wi'll create our project

        Scanner scan = new Scanner(System.in);

        System.out.println("           *** Welcome to Cheesecake Factory App! ***\n" +
                "\n  We have been serving our community for over 100 years. We have celebrated  Birthdays,\n" +
                "Anniversaries and many other wonderful events with you delivering tasty and healthy food\n" +
                "recipes of we inherited from our great grandparents.");

        System.out.println();
        System.out.println("=============================================================================");
        System.out.println();

        System.out.println("**************** Please choose menu: ***********************************");

        System.out.println("1.Desserts;\n" +
                "2.Appetizers;\n" +
                "3.Salad;\n" +
                "4.LunchSpecials;\n" +
                "5.Kids;\n" +
                "6.Beverages;");
        System.out.println("==================");
        System.out.print("Enter menu number: ");
        int chooseMenu = scan.nextInt();
        System.out.println();

        if (chooseMenu==1){ // main if for menu
            System.out.println("DESSERTS: 1.CHEESECAKES"+"\n\t\t2.SPECIALTY DESSERTS"+"\n\t\t3.ICE CREAM DELIGHTS");

            System.out.println("====================");
            System.out.print("Enter dessert number: ");
            int chooseDessert = scan.nextInt();
            System.out.println();

                if (chooseDessert==1){ // nested if ==> for dessert
                //   DESSERT type 1 :  cheeseCakesList ==> contains 3 static  "cheeseCakes1" object
                ArrayList<CheesCakes> cheesCakesList = new ArrayList<>();
                cheesCakesList.addAll(Arrays.asList(cheesCakes1, cheesCakes2, cheesCakes3)); // this objects static from  "cheeseCakesList" class
                System.out.println("*************** CHEESECAKES *******************************");

                // Order to screen every "CheesCakes" elements
                for (CheesCakes each : cheesCakesList){
                    System.out.println( each);
                    System.out.println();
                }

                }else if (chooseDessert==2){
                    //  DESSERT type 2 :  SpecialtyDesserts
                    ArrayList<SpecialtyDesserts> specialDessList = new ArrayList<>();
                    specialDessList.addAll(Arrays.asList(specialDess1, specialDess2, specialDess3));

                    System.out.println("*************** SPECIALTY DESSERTS *******************************");
                            // Order to screen every "SpecialtyDesserts" elements
                            for (SpecialtyDesserts each : specialDessList){
                            System.out.println( each);
                            System.out.println();
                            }



                    }else if (chooseDessert==3){
                    //DESSERT type 3: iceCreamObj1
                    ArrayList<IceCreamDelights> iceCreamList = new ArrayList<>();
                    iceCreamList.addAll(Arrays.asList(iceCreamObj1,iceCreamObj2,iceCreamObj3));
                    // Order to screen every "IceCreamDelights" elements
                    for (IceCreamDelights each : iceCreamList){
                        System.out.println( each);
                        System.out.println();
                    }


                }else {
                    System.out.println("Invalid number");
                }



        } // End of  main if statement (menu)
















        




        //Requirement to Object part:  from @Aigerim Ibraimova


        /*
            

            Due to the COVID-19, we had to close our locations.
Fortunately,with the help of new technology we can still serve our community.
 We are happy to announce that we are launching our application BOMB.COM that
 will allow you to order your favorite food from our old and new menu
 with listed ingredients and pictures . All the discounts will be applied
 for the once who qualify. In this case you will be able to enjoy food at home
 or work without  spending money on gas and time standing in lines to be seated.

 1.  You can search food by the categories. Our app wil allow you to filter the price,
 meat choice,alcoholic(have to be 21 and over)and non alcoholic beverages, deserts
 and delivered to you in no time.

 2.You will be able to order without registering and opening account. Keep in mind
that having an account will save you time for tge next order and will accumulate
pints that you can use for the next order and save come money.

 3. We accept all kinds of payments:credit, debit and ACH(bank account:routing and checking numbers).

 4. You will be able see your order on the map from the time you created it up until
its delivered to your doorsteps in a short time.You can rate the meal from *-***** from least favorite to the best. We will appreciate
your feedback and will keep improving the quality of the food.
 Why go through middle man like door dash and pay high delivery fee?
when you can contact us directly and pay very competitive low delivery fee.
 We would  like to assure you that the food will be  cooked with following all the
  health association laws and rules. Your well being is important to us
You can rate the meal from *-***** from least favorite to the best. We will appreciate
your feedback and will keep improving the quality of the food.
         */












    }
}
