package ThirdWork;

public class Discount21 extends Product {


    public Discount21(String name, double price, int rate) {
        super(name, price, rate);
    }

    @Override
    public void discount() {
        super.discount();
        System.out.println("Скидка " + getName() +" : 21%");
    }
}
