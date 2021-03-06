import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число : ");
        int f = in.nextInt();
        System.out.println("Факториал от F = " + Factorial(f));
    }

    public static int Factorial(int f){
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

