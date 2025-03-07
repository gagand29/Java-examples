package product;

public class Pants extends Product{

    private int waist;
    private int length;

    public Pants(int waist, int length , double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }
    

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("\n just folded the "+ this.getBrand()+" "+ this.getClass().getSimpleName());
    }
    @Override
    public void wear() {
        System.out.println("wear");
    }

}
