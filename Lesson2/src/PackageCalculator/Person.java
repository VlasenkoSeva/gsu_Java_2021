package PackageCalculator;

public class Person {
    private Lessons [] works;

    public Person(Lessons ... works){
        this.works = works;
    }

    public Lessons[] getWorks() {
        return works;
    }
}
