package PackageCalculator;

public class Runner {
    public static void main(String[] args) {
        Lessons Work_1 = new Lessons(3);
        Lessons Work_2 = new Lessons(2);
        Lessons Work_3 = new Lessons(1);

        Person me = new Person(Work_1);

        Calculator meCalc = new Calculator(3, 0.5, 10, 12, me);

        System.out.println("Какую сумму куратор будет получать за студента, если он просрочит сдачу одной темы на 3 недели : "
        + meCalc.ProscrochkaWorks());

        Work_1 = new Lessons(2);
        me = new Person(Work_1, Work_2, Work_3);
        meCalc = new Calculator(3, 0.4, 9, 12, me);
        System.out.println("Какую сумму куратор будет получать за студента, если он просрочит сдачу двух из трех тем на 2 недели : " +
                meCalc.ProscrochkaWorks());

        Work_1 = new Lessons(3);
        Work_2 = new Lessons(3);
        Work_3 = new Lessons(3);
        meCalc = new Calculator(3, 0.4, 9, 12, me);
        System.out.println("Какую сумму куратор будет получать за студента, если он просрочит сдачу всех тем на 3 недели : " +
                meCalc.ProscrochkaWorks());


    }
}
