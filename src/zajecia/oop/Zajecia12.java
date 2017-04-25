package zajecia.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class Zajecia12 {
    public static void main(String[] args) {
        Address address = new Address();
        address.street = "Długa";
        address.flatNumber = 13;
        address.city="Poznań";
        address.postalCode="61-514";
        address.country="Polska";

        User user = new User();
        user.firstName = "Jan";
        user.lastName = "Kowalski";
        user.phoneNumber = "123456789";
        user.address = address;
        user.age = 30;


        System.out.println();


        user.display();
//        address.display();

    }

}
