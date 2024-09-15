import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "gag";
        String password = "habibi";
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
         String uname = scan.next();
        System.out.print("- Password: ");
        String pass = scan.next();
        
        while(!uname.equals(username) || !pass.equals(password))
        {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            uname = scan.nextLine();
            System.out.print("- Password: ");
            pass = scan.nextLine();
        }
      
            
        System.out.println("\nSign in successful. Welcome!");
        

        scan.close();
        
    }
}
