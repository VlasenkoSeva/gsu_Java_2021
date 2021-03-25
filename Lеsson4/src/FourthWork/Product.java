package FourthWork;

public enum Product {
    Home {
        public Product getDescription() {
            System.out.println("Для дома");
            return Home;
        }
    },
    Child {
        public Product getDescription(){
        return  Child;
    }
    },
    Hardware{
        public Product getDescription(){
        return Hardware;
    }
    },
    Pharmacy{
        public Product getDescription(){
        return Pharmacy;
    }
    },
    Food{
        public Product getDescription(){
        return Food;
    }
    };



}
