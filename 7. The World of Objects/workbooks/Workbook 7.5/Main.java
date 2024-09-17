import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Gagan", "Indian", "01/01/1111", 9);
        person.chooseSeat();

        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        if (person.applyPassport()) {
            System.out.println("congrajulations: " + person.getName());
        } else {
            System.out.println("sorry rejected: " + person.getName());
        }

        System.out.println("Name: " + person.getName() + "\n"
                + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n"
                + "Seat Number: " + person.getSeatNumber() + "\n"
                + "Passport: " + Arrays.toString(person.getPassport()) + "\n");

    }

}
