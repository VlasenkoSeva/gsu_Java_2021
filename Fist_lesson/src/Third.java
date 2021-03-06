public class Third {
    public static void main(String[] args) {
        int num = 1;
        while( num <= 50){
            if ((num & 9) == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
