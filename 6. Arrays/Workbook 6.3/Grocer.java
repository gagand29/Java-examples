public class Grocer {
    public static void main(String[] args) {
        
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee"};
        System.out.println("\nDo you sell coffee?");

        for(int i=0;i<store.length;i++) {
            if(store[i].equals("coffee")){
                System.out.println("we have that "+ i);
                break;

            }
        }
    
    }
}
