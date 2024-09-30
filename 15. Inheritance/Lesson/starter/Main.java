import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {

    public static void main(String[] args) {
        
        Shirt shirt = new Shirt(Size.SMALL,50,"blue","nike" );
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(32,32, 50, "black","nike");
        pants.fold();
        productStore(pants);

    }

        public static void productStore (Product product){
            System.out.println("thanks for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName());

            product.wear();
        }
        // public static void shirtStore(Shirt shirt){
        //     System.out.println("thanks for purchasing " + shirt.getBrand() +" shirts."  );
        // }
}
