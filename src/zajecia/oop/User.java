package zajecia.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class User {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public Address address;
    public int age;

    public void display() {
        System.out.println(firstName + " " + lastName + ", age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        address.display();
    }
}
