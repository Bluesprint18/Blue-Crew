package Sprint_01;

import java.util.ArrayList;
import java.util.Arrays;

public class restaurantObject {
    public static void main(String[] args) {
        Restaurant TapsilogExpress = new Restaurant();
        Restaurant RedApplePizza = new Restaurant();
        Restaurant Elios = new Restaurant();
        Restaurant NickFamilyRestaurant = new Restaurant();
        Restaurant MariscosElTata = new Restaurant();
        Restaurant RocknRollSushi = new Restaurant();
        TapsilogExpress.setRestaurant("Tapsilog Express","14843 Washington Ave, San Leandro, CA 94578"
                ,4,"Filipino","(510) 878-1232");
        RedApplePizza.setRestaurant("RedApple Pizza","14799 Washington Ave, San Leandro, CA 94578",
                4,"Pizza","(510) 357-4500");
        Elios.setRestaurant("Elios","260 Floresta Blvd, San Leandro, CA 94578",
                4,"Family-friendly","(510) 351-0463");
        NickFamilyRestaurant.setRestaurant("Nick Family Restaurant","14660 Washington Ave, San Leandro, CA 94578",
                4,"Family-friendly","(510) 351-5676");
        MariscosElTata.setRestaurant("Mariscos El Tata","14680 Washington Ave, San Leandro, CA 94578",
                3,"Mexican","(510) 564-4123");
        RocknRollSushi.setRestaurant("Rock & Roll Sushi","579 Floresta Blvd, San Leandro, CA 94578",
                4,"Japanese","(510) 667-9545");
        ArrayList<Restaurant>restaurantlist=new ArrayList<>();
        restaurantlist.addAll(Arrays.asList(TapsilogExpress,RedApplePizza,Elios,NickFamilyRestaurant,
                MariscosElTata,RocknRollSushi));
        RocknRollSushi.rating();
        //for (Restaurant each:restaurantlist){
        //    System.out.println(each);
       // }

    }
}
