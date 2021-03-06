import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 7 :");
        int x = in.nextInt();
        if (x >= 8){
            System.out.println("Вы ввели неправильное число, попробуйте ещё раз :");
            x = in.nextInt();
        }
        switch (x){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Weekends");
                break;
            case 7:
                System.out.println("Weekends");
                break;
        }
    }
}
