package FirstWork;

public class Professor extends Student {
    private String Salary;

    public Professor(String name, int phone_Number, String email_Addres, int Salary, Address address) {
        super(name, phone_Number, email_Addres, address);
    }

    public String getSalary(){
        return Salary;
    }

}
