package Sprint_01;

public class cheesecakeFactory {
    static String restaurant="cheesecake Factory";
    String address;
    int zipcode;
    String phone;

    public  cheesecakeFactory(String address,int zipcode,String phone){
        this.address=address;
        this.zipcode=zipcode;
        this.phone=phone;

    }
    public String toString(){
        return "Restaurant Name: "+restaurant+"\nAddress: "+address+"\nZipcode: "+zipcode
                +"\nPhone Number:"+phone;
    }
}

class cheesecakeFactoryMenu {
    String Desserts;
    String Appetizers;
    String Salad;
    String LunchSpecials;
    String Kids;
    String Beverages;

    public cheesecakeFactoryMenu(String Desserts, String Appetizers, String Salad, String LunchSpecials,
                                 String Kids, String Beverages) {
        this.Desserts      = Desserts;
        this.Appetizers    = Appetizers;
        this.Salad         = Salad;
        this.LunchSpecials = LunchSpecials;
        this.Kids          = Kids;
        this.Beverages     = Beverages;

    }

   public String toString(){
        return "Deserts: "+Desserts+"\nAppetizers: "+Appetizers+"\nSalad: "+Salad+"\nLunchSpecials"
                +LunchSpecials+"\nKids: "+Kids+"\nBeverages: "+Beverages;
   }

}



//      ------------------------   DESSERTS STARTS:   (CODE BY ZHAKSYBEK)      -----------------------------------------

class CheesCakes{   // Dessert haves 3 types: ==>   1.cheescakes

    String name;        // ORIGINAL
    String foodTags;    // EX:  sour cream, cream cheese
    String description; // The Original Topped with Glazed Fresh Strawberries. Our Most Popular Flavor for Over 35 Years!
    double price;       // $49.99   Price: website:==>  https://www.harryanddavid.com/h/bakery/cheesecake-factory

    public CheesCakes(String name, String foodTags, String description, double price){
    this.name        = name;
    this.foodTags    = foodTags;
    this.description = description;
    this.price       = price;

    }

    public String toString(){
        return  "Name: "+name + "\nDescription: "+description + "\nFood Tags: "+foodTags+"\nPrice: $"+price ;
    }

    static CheesCakes cheesCakes1 = new CheesCakes("ORIGINAL","Sour cream, cream cheese","Our Famous Creamy Cheesecake with a Graham Cracker Crust and Sour Cream Topping.",30);

    static CheesCakes cheesCakes2 = new CheesCakes("FRESH STRAWBERRY CHEESECAKE","Strawberries, cream cheese",
            "The Original Topped with Glazed Fresh Strawberries..",35);

    static CheesCakes cheesCakes3 = new CheesCakes("PINEAPPLE UPSIDE-DOWN CHEESECAKE","Pineapple, cream cheese",
            "For every slice of Pineapple Upside-Down Cheesecake sold*, 25 cents will be donated to Feeding America",25);



}  // ends class cheesCakes



class SpecialtyDesserts{  // Dessert haves 3 types: ==>   2. Specialty Desserts
    String name;        // LINDA'S FUDGE CAKE
    String foodTags;    // EX:  chocolate
    String description; // Layers of Rich Chocolate Cake and Fudge Frosting.
    double price;       // $49.99   Price: website:==>  https://www.harryanddavid.com/h/bakery/cheesecake-factory

    public SpecialtyDesserts(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name + "\nDescription: "+description + "\nFood Tags: "+foodTags+"\nPrice: $"+price ;
    }

    static SpecialtyDesserts specialDess1 = new SpecialtyDesserts("LINDA'S FUDGE CAKE","chocolate",
            "Layers of Rich Chocolate Cake and Fudge Frosting.",28.30);

    static SpecialtyDesserts specialDess2 = new SpecialtyDesserts("BLACK-OUT CAKE","chocolate",
            "Our Deepest, Richest Chocolate Cake with Chocolate Chips, Finished with Almonds.",30.84);

    static SpecialtyDesserts specialDess3 = new SpecialtyDesserts("WARM APPLE CRISP","apple, vanilla",
            "Our Delicious Crispy Nutty Topping and Vanilla Ice Cream.",25.50);





}  // ends class cheesCakes



class IceCreamDelights{ // Dessert haves 3 types: ==>   3. Ice Cream Delights
    String name;        // HOT FUDGE SUNDAE
    String foodTags;    // EX:  ice cream, chocolate, almonds
    String description; // The Best Hot Fudge Anywhere. Topped with Whipped Cream and Almonds.
    double price;       // $49.99   Price: website:==>  https://www.harryanddavid.com/h/bakery/cheesecake-factory

    public IceCreamDelights(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name + "\nDescription: "+description + "\nFood Tags: "+foodTags+"\nPrice: $"+price ;
    }

    static IceCreamDelights iceCreamObj1 = new IceCreamDelights("HOT FUDGE SUNDAE","ice cream, chocolate, almonds",
            "The Best Hot Fudge Anywhere.",16);

    static IceCreamDelights iceCreamObj2 = new IceCreamDelights("CHOCOLATE BROWNIE SUNDAE"," chocolate, vanilla, almonds",
            "Our own Fabulous Godiva Chocolate Brownie",20.25);

    static IceCreamDelights iceCreamObj3 = new IceCreamDelights("BOWL OF ICE CREAM"," chocolate, vanilla, almonds",
            "Two and a half scoops of Vanilla Ice Cream.",18);

}// ends class iceCreamDelights


//      ------------------------  ^ DESSERTS DONE ^      --------------------------------------------


//      ------------------------   Appetizers STARTS: CODE BY: @Zhaksybek Satylgan ---------------------------------


class SmallSnacks{   //  APPETIZERS  Haves 2 types:  1.Small Snacks
    String name;        // CHICKEN TAQUITOS
    String foodTags;    // EX:   chicken, corn, onions, cilantro, cheese, avocado, mexican
    String description; // Crispy Corn Tortillas Filled with Grilled Chicken and Cheese. Served with Avocado Cream and Salsa Verde.
    double price;       // $49.99

    public SmallSnacks(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name + "\nDescription: "+description + "\nFood Tags: "+foodTags+"\nPrice: $"+price ;
    }

} // end of class:  smallSnacks


class AppertizersInfo{   //  APPETIZERS  Haves 2 types:  1.APPETIZERS
    String name;        // HUMMUS
    String foodTags;    // EX:   Food Tags:  garbanzo beans, tahini, garlic, lemon
    String description; // A Smooth, Creamy Blend of Garbanzo Beans, Tahini, Garlic, Lemon and Olive Oil.
    double price;       // $30.99

    public AppertizersInfo(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}// end of class:  appertizersInfo

//      ------------------------  ^^^  Appetizers ENDS  ^^^ CODE BY: @Zhaksybek Satylgan -------------------------------



//      ------------------------   SALADS STARTS: CODE BY:   -----------------------------------------------------------

//  Menu SALADS HAVES 2 TYPES:  1. Appertizer salads        2. SALADS   INFO_WEBSITE: https://www.thecheesecakefactory.com/menu/salads/

class AppertizerSalads{   //   1. Appertizer salads
    String name;        // TOSSED GREEN SALAD
    String foodTags;    // EX:   This item is featured on our SkinnyLicious® Menu.
    String description; // Mixed Greens, Assorted Vegetables, Tomato and Croutons with Your Choice of Dressing.
    double price;       // $30.99

    public AppertizerSalads(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

} //end of class:  appertizerSalads


class SaladsInfo{   //   1. Salads  :   Big SALADS
    String name;        // SHEILA'S CHICKEN AND AVOCADO SALAD
    String foodTags;    // EX:   Food Tags:  chicken, avocado, carrots, cilantro, cashews, red onions
    String description; // Grilled Chicken, Fresh Avocado, Cilantro and Cashews Tossed in a Citrus-Honey-Peanut Vinaigrette.
    double price;       // $30.99

    public  SaladsInfo(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

} //end of class:  SaladsInfo

//      ------------------------  ^^^  SaladsInfo ENDS  ^^^ ------------------------------------------------------------




//      ------------------------   SALADS STARTS: CODE BY:   -----------------------------------------------------------

class LunchSpecials{    // DOESN'T have types, We'll set info directly

    String name;        // RENEE'S SPECIAL
    String foodTags;    // EX:   --
    String description; // One-Half of a Fresh Turkey Sandwich or Chicken-Almond Salad Sandwich,
    double price;       // $40.99

    public  LunchSpecials(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}
// ------------------------  ^^^  SaladsInfo ENDS  ^^^ ------------------------------------------------------------



//      ------------------------   Kids STARTS: CODE BY:   -----------------------------------------------------------
class Kids{    // DOESN'T have types, We'll set info directly

    String name;        // KIDS' ROADSIDE SLIDERS
    String foodTags;    // EX:   Food Tags:  beef, kids, sliders
    String description; // Two Bite-Sized Burgers on Mini-Buns. Served with Fries or Fresh Fruit.
    double price;       // $40.99

    public  Kids(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}

// ------------------------  ^^^ Kids ENDS  ^^^ -----------------------------------------------------------------------




//  Beverages   HAVES 6 types ;  BUT I"LL ADD 3 TYPES  (1.Coctails   2.Hot drinks  3.BeerWines)

//      ------------------------   Beverages STARTS: CODE BY:   --------------------------------------------------------

class Coctails{    //

    String name;        // TROPICAL TIKI PUNCH
    String foodTags;    // EX:  Food Tags:  rum, pineapple, ginger, lime, beverage, drink, cocktail
    String description; // Sailor Jerry and Bacardi Lime Rums Infused with Pineapple, Fresh Ginger and Lime.
    double price;       // $40.99

    public  Coctails(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}

// Hot drinks

class HotDrinks{    //

    String name;        // DOUBLE ESPRESSO
    String foodTags;    // EX:  espresso, beverage, drink
    String description; // Enjoy a double shot of espresso..
    double price;       // $40.99

    public HotDrinks(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}

// Beer & Wine

class BeerWine{    //

    String name;        // WINE
    String foodTags;    // EX:   beverage, drink
    String description; // The Cheesecake Factory is proud to offer a carefully selected wine list sure to appeal to everyone.
    double price;       // $12.95 per glass

    public BeerWine(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}







// ------------------------  ^^^  Beverages  ENDS  ^^^ -----------------------------------------------------------------------












