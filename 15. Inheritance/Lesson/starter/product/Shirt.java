package product;

public class Shirt extends Product {

    public Shirt(Size size,double price, String color, String brand) {
        super(price,color,brand);
        this.size = size;
    }

    
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("\n lay shirt on flat surface and folded the "+ this.getBrand()+" "+ this.getClass().getSimpleName());
    }

    @Override
    public void wear() {
        // TODO Auto-generated method stub
        System.out.println("wear it and try!");
        
    }

}
