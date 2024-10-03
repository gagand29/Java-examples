import java.math.BigDecimal;

public class Decimals {
    public static void main(String[] args) {

        // double x = 0.1;
        BigDecimal x = new BigDecimal("0.1");

        System.out.println(x);

        // double y = 0.2;
        BigDecimal y = new BigDecimal("02");
        // double z = x + y;
        
        System.out.println(x.add(y));

    }

}