package ThirdWork;

public class Runner {
    public static void main(String[] args) {
        Product discount21 = new Discount21("Processor", 343, 10);
        Product discount25 = new Discount25("Video Card", 468, 8);
        Product discount50 = new Discount50("Cooler", 75, 9);

        Product [] array = {discount21, discount25, discount50};


        public void Show( Product [] array){
            for (Product product : array){
                product.discount();
            }
        }
    }
}
