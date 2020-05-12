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
        this.Desserts = Desserts;
        this.Appetizers = Appetizers;
        this.Salad = Salad;
        this.LunchSpecials = LunchSpecials;
        this.Kids = Kids;
        this.Beverages = Beverages;

    }

   public String toString(){
        return "Deserts: "+Desserts+"\nAppetizers: "+Appetizers+"\nSalad: "+Salad+"\nLunchSpecials"
                +LunchSpecials+"\nKids: "+Kids+"\nBeverages: "+Beverages;
   }

}