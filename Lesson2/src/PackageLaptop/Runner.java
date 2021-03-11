package PackageLaptop;

public class Runner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("C0-E4-34-DF-D2-5F", "HP","2.1kg", "Ryzen", "Windows");
        /*Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();*/

        laptop.Show();
        laptop.showNotePad("Notepad",2);
    }
}
