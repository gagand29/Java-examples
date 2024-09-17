import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person person = new Person("Gagan", "Indian", "11/11/1111", 5); 
        
        if (person.applyPassport()) {
            person.setPassport();
        }
        
        // This should trigger the toString method and print the details
        System.out.println(person);
     }
}
