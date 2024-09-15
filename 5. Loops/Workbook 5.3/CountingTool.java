import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       System.out.println("hi! Gagan , choose a numnber to count ");

        int number=scan.nextInt();

        System.out.println("great! will start?");
        for(int i=0; i<=number; i++){
            System.out.print(i+" ");
        }

        scan.close();
    }
}
