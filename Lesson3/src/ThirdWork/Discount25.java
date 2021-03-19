package ThirdWork;

public class Discount25 extends  Product{


    public Discount25(String name, double price, int rate) {
        super(name, price, rate);
    }

    @Override
    public void discount() {
        super.discount();
        System.out.println("Скидка " + getName() +" : 25%");
    }
}
