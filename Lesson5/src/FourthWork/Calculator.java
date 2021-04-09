package FourthWork;

public class Calculator<T, sum> {

    public static void main(String[] args) {
        int T[] = {3, 7, 8, 6, 16, 5};
        int sum = 0;
        int otric = 0;
        for (int i = 0; i < T.length; i++) {
            sum += T[i];
            otric -= T[i];
        }
        System.out.println(sum);
        System.out.println(otric);
    }
}


