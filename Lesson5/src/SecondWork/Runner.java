package SecondWork;

public class Runner {
    public static void main(String[] args) {
        Information information = new Information("qwerty","Prog228");

        try {
             Exeption(information);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
    public static void Exeption(Information error) throws Exception{
        String login2 = "Prog228";
        String password2 = "qwerty";

        if (error.getLogin().equals(login2) || error.getPassword().equals(password2)){
            throw new Exception("Проверьте введенные данные");
        }
        else{
            System.out.println("Success");
        }
    }
}
