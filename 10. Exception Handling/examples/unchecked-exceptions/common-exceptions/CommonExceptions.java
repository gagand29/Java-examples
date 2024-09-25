import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {

        //**************ArrayIndexOutOfBounds**************//
        int[] grades = new int[] {96, 65, 56, 86};
        System.out.println(grades[4]);//error message

       //**************NullPointerException**************//
        String[] names = new String[7]; 
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Joe";

        for (String name : names) {
            System.out.println(name.toUpperCase());// error we use if name not equal to null
        }

        //**************InputMismatchException**************//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a random integer");
        scanner.nextInt();// same check scanner.hasNextInt() then pick text 
        scanner.close();

    }
}