public class Tip {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        tipW(bill);
    
        //Task 2: Call a function that tips the waiter.
    }



    public static void tipW(double bill){

        double tip = bill*0.15;
        System.out.println("Tip: " + tip);

    }

}