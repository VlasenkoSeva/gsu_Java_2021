package FirstWork;

public class Runner {


    public static void main(String[] args) {
        Object litreture = new Litreture("Литература", 45, "Hard");
        Object math = new Math("Математика",45,"Very Hard");
        Object physics = new Physics("Физика", 45,"Unbelievable");

        Object[] objects = {litreture,math,physics};



    }
    public static void col(Object[] obj){
        int sum = 0;
        boolean ch;

        for (int i = 0; i < obj.length; i++) {
            sum = 1;
            ch = false;


            for (int k = 0; k < i; k++) {
                if (obj[k].getClass() == obj[i].getClass()) {
                    ch = true;
                }
            }
            if (ch){
                continue;
            }

            for (int j = i+1; j < obj.length; j++) {
                if (obj[j].getClass() == obj[i].getClass()){
                    sum++;
                }

            }
            if (sum != 1){
                System.out.println(obj[i].getNameOfObjects() + "( "+ obj[i].getNameOfObjects()+"" + obj[i].getTime()
                + " " + obj[i].getDifficulty() + " ) -" + sum );
            }

        }
    }
}
