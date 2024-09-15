import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        int number = 9;

       System.out.print("I chose a number between 1 and 9. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int guess = scan.nextInt();
       while(guess != number){
        System.out.println("guess again");
        guess = scan.nextInt();
       }

       System.out.println("you got it!");
        
        scan.close();
    }

}
