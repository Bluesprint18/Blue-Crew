package Sprint_01;
//Code origin Aigerim Ibraimova
public class OrderTracker {

        String order;
        int areaCode;
        int phonenumber;
        int buildingNumber;
        String address;
        int zip;

        public void setInfo(String order, int buildingNumber, String address, int zip, int areaCode, int phonenumber) {
            this.order = order;
            this.buildingNumber = buildingNumber;
            this.address = address;
            this.zip = zip;
            this.areaCode = areaCode;
            this.phonenumber = phonenumber;
        }

        public void NotificationByText() {
            System.out.println("Message will be sent to this number: " +(areaCode)+phonenumber
                    + " when order left the facility or when order will get to your destination");
        }

        public void seeOnMap() {
            System.out.println("Your order on its way to this address: " +buildingNumber+" "+address+" "+zip);

        }

        public String toString() {
            return "Order: " + order + ",address number " + buildingNumber + ", address " + address + ",zip code: " + zip
                    + ", area code: " + areaCode + ",phone number: " + phonenumber;


        }
    }

