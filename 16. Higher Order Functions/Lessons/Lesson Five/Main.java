import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // *******************forEach*******************
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
        usernames.stream()
        .map(username-> username.toUpperCase())
        .forEach(username->{
            System.out.println(username);
        });

        // *******************toList*******************
        List<String> upperUsernames=usernames.stream()
        .map(username-> username.toUpperCase())
        .toList();


        // *******************reduce*******************

        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
        Double totalEarnings = earnings.stream()
        .reduce(0.0, (x,y)->{
            return x+y;
        });
        System.out.println(totalEarnings);


        // *******************reduce*******************

        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
        Double fundsRemaining = expenses.stream()
        .reduce(100.0, (x,y)->{
            return x-y;
        });
        
        System.out.println(fundsRemaining);
       
       
        // *******************findFirst*******************
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");
        String result=aisles.stream().filter(aisle->aisle.equals("coffee"))
        .findFirst().orElse(null);
        
        String res = result ==null? "no we dont":"yes";
        System.out.println(res);
        
        
        // *******************count*******************        
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 1 repeat?");
        long count = numbers.stream()
        .filter(number-> number==1).count();

        System.out.println(count);
        
    }   
    
}

