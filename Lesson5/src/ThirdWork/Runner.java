package ThirdWork;

public class Runner {
    public static void main(String[] args) {
        Computer<String, Number> pc = new Computer<>("AMD");
        System.out.println(pc.pc());
    }
}
