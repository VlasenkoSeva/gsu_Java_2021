package FirstWork;

import java.awt.geom.AffineTransform;

public class Runnner {
    public static void main(String[] args) {
        /*Person person = new Person("Seva", 291227509, "seva.v.@mail.ru");
        person.Purchase();*/

        Address myAddress = new Address("Sweden", "Baket Street", "Stockholm", "Stockholm",2281337 );
        Student me = new Student("Seva", 1227509, "lolkek@mail.ru", myAddress);

        me.getAddress().outPutAsLAbel();
        System.out.println(" My average Mark : " + me.getAverageMark());

    }
}
