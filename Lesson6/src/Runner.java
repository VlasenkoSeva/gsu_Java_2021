public class Runner {
    public static void main(String[] args) {
        Integers integer = new Integers("x^2");
        System.out.println(String.valueOf(integer));

        String x = "300";

        try {
            int y = Integer.parseInt(x.trim());
            System.out.println("Теперь переменная х : " + x);
        }catch (NumberFormatException ex){
            System.out.println("NumberFormatException : " + ex.getMessage());
        }



    }

    static class Integers{
        private String name;

        public Integers(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Ваша функция{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
