import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число :");
        int x = in.nextInt();
        if ((x&1) == 0){
            System.out.println( x * 1.5);
        }else{
            System.out.println(x*x);
        }
    }
}
