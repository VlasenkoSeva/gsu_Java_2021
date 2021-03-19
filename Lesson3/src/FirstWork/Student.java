package FirstWork;

public class Student extends Person {
    private int studentNumber;
    private double averageMark;

    public Student(String name, int phone_Number, String email_Addres, Address address) {
        super(name, phone_Number, email_Addres,address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }



    public void iseEligabletoEnroll(){
        System.out.println("Have a right");
    }

    public void seminarsTaken(){
        System.out.println("Why do I need a seminar, what is it?");
    }



    public int getStudentNumber() {
        return studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }
}

