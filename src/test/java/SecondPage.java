import com.github.javafaker.Faker;

/**
 * this class is for learning about JAVA Faker class for generating fake data for testing
 * Created by arpan on 04/01/2017.
 */
public class SecondPage {

    public static void main(String[] args) {


        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton
        String phoneNumber = faker.phoneNumber().phoneNumber();

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        System.out.println("name: "+ name);
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Street Address: "+ streetAddress);
    }

}
