package SecondWork;

public class Information {
    private String password ;
    private String login;

    public Information(String password,String login){
        this.login = login;
        this.password = password;
    }



    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
