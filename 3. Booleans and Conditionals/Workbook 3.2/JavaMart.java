public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
        if(wallet >= toyCar){
            System.out.println("sure!");
            wallet -= toyCar;
        }
        else{
            System.out.println("sorry i dont have enough money : "+ wallet+"left");
        }
        

        
        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if(wallet >= nike){
            System.out.println("sure!");
            wallet -= nike;
            System.out.println("i have this much money left"+(wallet)+"money");
        }

    }
}
