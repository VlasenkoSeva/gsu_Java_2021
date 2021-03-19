package ThirdWork;

public class Discount50 extends Product{


    public Discount50(String name, double price, int rate) {
        super(name, price, rate);
    }

    @Override
    public void discount() {
        super.discount();
        System.out.println("Скидка " + getName() +" : 50%");
    }
}
