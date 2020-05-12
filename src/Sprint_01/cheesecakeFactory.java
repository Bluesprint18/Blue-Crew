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

class cheesCakes{   // Dessert haves 3 types: ==>   1.cheescakes

    String name;        // ORIGINAL
    String foodTags;    // EX:  sour cream, cream cheese
    String description; // The Original Topped with Glazed Fresh Strawberries. Our Most Popular Flavor for Over 35 Years!
    double price;       // $49.99   Price: website:==>  https://www.harryanddavid.com/h/bakery/cheesecake-factory

    public cheesCakes(String name, String foodTags, String description, double price){
    this.name        = name;
    this.foodTags    = foodTags;
    this.description = description;
    this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}  // ends class cheesCakes



class specialtyDesserts{  // Dessert haves 3 types: ==>   2. Specialty Desserts
    String name;        // LINDA'S FUDGE CAKE
    String foodTags;    // EX:  chocolate
    String description; // Layers of Rich Chocolate Cake and Fudge Frosting.
    double price;       // $49.99   Price: website:==>  https://www.harryanddavid.com/h/bakery/cheesecake-factory

    public specialtyDesserts(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }


}  // ends class cheesCakes



class iceCreamDelights{ // Dessert haves 3 types: ==>   3. Ice Cream Delights
    String name;        // HOT FUDGE SUNDAE
    String foodTags;    // EX:  ice cream, chocolate, almonds
    String description; // The Best Hot Fudge Anywhere. Topped with Whipped Cream and Almonds.
    double price;       // $49.99   Price: website:==>  https://www.harryanddavid.com/h/bakery/cheesecake-factory

    public iceCreamDelights(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

}// ends class iceCreamDelights


//      ------------------------  ^ DESSERTS DONE ^      --------------------------------------------


//      ------------------------   Appetizers STARTS: CODE BY: @Zhaksybek Satylgan ---------------------------------


class smallSnacks{   //  APPETIZERS  Haves 2 types:  1.Small Snacks
    String name;        // CHICKEN TAQUITOS
    String foodTags;    // EX:   chicken, corn, onions, cilantro, cheese, avocado, mexican
    String description; // Crispy Corn Tortillas Filled with Grilled Chicken and Cheese. Served with Avocado Cream and Salsa Verde.
    double price;       // $49.99

    public smallSnacks(String name, String foodTags, String description, double price){
        this.name        = name;
        this.foodTags    = foodTags;
        this.description = description;
        this.price       = price;

    }

    public String toString(){
        return  "Name: "+name+ ", Food Tags: "+foodTags+", Price: "+price+"\nDescription: "+description;
    }

} // end of class:  smallSnacks


class appertizersInfo{   //  APPETIZERS  Haves 2 types:  1.APPETIZERS
    String name;        // HUMMUS
    String foodTags;    // EX:   Food Tags:  garbanzo beans, tahini, garlic, lemon
    String description; // A Smooth, Creamy Blend of Garbanzo Beans, Tahini, Garlic, Lemon and Olive Oil.
    double price;       // $30.99

    public appertizersInfo(String name, String foodTags, String description, double price){
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

class appertizerSalads{   //   1. Appertizer salads
    String name;        // TOSSED GREEN SALAD
    String foodTags;    // EX:   This item is featured on our SkinnyLicious® Menu.
    String description; // Mixed Greens, Assorted Vegetables, Tomato and Croutons with Your Choice of Dressing.
    double price;       // $30.99

    public appertizerSalads(String name, String foodTags, String description, double price){
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

}
















