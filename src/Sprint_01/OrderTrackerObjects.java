package Sprint_01;
//Code origin Aigerim Ibraimova
import java.util.Scanner;

public class OrderTrackerObjects {
    public static void main(String[] args) {
        //from here Bahtiyar change
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to cheesecake Factory!!");
        System.out.println("Please enter your Zipcode");
        int zipcode = scan.nextInt();
        cheesecakeFactory location01 = new cheesecakeFactory("Stoneridge Mall\n" +
                "1350 Stoneridge Mall Road\n" +
                "Pleasanton, CA: ",94588," 925-463-1311");
        cheesecakeFactory location02 = new cheesecakeFactory( "Hillsdale Shopping Center\n" +
                "398 Hillsdale Shopping Center\n" +
                "San Mateo, CA ",94403,"650-638-0310" );
        cheesecakeFactory location03 = new cheesecakeFactory( "Plaza Escuela\n" +
                "1181 Locust Street\n" +
                "Walnut Creek, CA ",94596,"925-952-8450" );
        cheesecakeFactory location04 = new cheesecakeFactory( "Union Square\n" +
                "251 Geary Street\n" +
                "San Francisco, CA " ,94102,"415-391-4444");
        if (zipcode>=94588&&zipcode<94596){
            System.out.println("The location near you is: "+location01);
        }else if (zipcode>=94596){
            System.out.println("The location near you is: "+location03);
        }else if (zipcode>=94102&&zipcode<94404){
            System.out.println("The location near you is: "+location04);
        }else {
            System.out.println("The location near you is: "+location02);
        }
        cheesecakeFactoryMenu menu = new cheesecakeFactoryMenu( "Caramel cheesecake\nOreo cheesecake\nChocolate cake"
                ,"Fried chicken sliders\nHot Spinach\nTex mex Eggrolls","Santa fe Salad\nCobb Salad\nTuna Salad",
                "Lunch pasta\nLunch Favorites\nLunch Salmon",
                "Kids roadsideSliders\nKids southren fried chicken\nKinds Mini Corndog",
                "Beer\nWine\nIce Coffe\nPepsi\nCocacola");
        System.out.println("would you like see our menu?");
        String yesno = scan.next();
        if (yesno.equalsIgnoreCase( "yes" )){
            System.out.println(menu);
        }
        System.out.println("Please Pick your order and when you done please go to check out!");
        System.out.println("this is all you got today?");
        String answer01 = scan.next();
        if (answer01.equalsIgnoreCase( "yes" )){
            System.out.println("Thank you for your order!");
        }
        //my code end here : Bahtiyar
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
