package PackageCredit;

public class Runner {
    public static void main(String[] args) {
        Credit credit = new Credit("Consumer", 100, "21.02.2021", true);
        Credit credit1 = new Credit(50 , "14.07.2021");
        Credit [] array = {credit, credit1};
        credit.Show();
    }



}