package PackageCalculator;

public class Calculator {
    private Person [] students;
    private double nachChena;
    private double coefficientOfFine;
    private int numberOfStudents;
    private int endOfCourse;

    public Calculator(double nachChena, double coefficientOfFine, int numberOfStudents, int endOfCourse, Person... students){
        this.students = students;
        this.nachChena = nachChena;
        this. coefficientOfFine = coefficientOfFine;
        this. numberOfStudents = numberOfStudents;
        this.endOfCourse = endOfCourse;
    }

    public double ProscrochkaWorks(){
        double sum = 0;
        for( Person students : students){

            sum = sum + (endOfCourse - students.getWorks().length) * nachChena;

            for (Lessons lessons : students.getWorks()){
                sum = sum + nachChena * Math.pow((1 * coefficientOfFine), lessons.getProsrochka());
            }
        }
        return sum;
    }

    public double ProsrochkaWorksAll(){
        double sum = 0;
        int fineOfStudents = numberOfStudents - students.length;
        sum += ProscrochkaWorks();
        sum += fineOfStudents * nachChena * endOfCourse;
        return sum;
    }

}
