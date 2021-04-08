package FourthWork;

public enum ProductsType {
    Home (1,"Для дома"),
    Child (2,"Для детей"),
    Hardware(3,"Хозтовары"),
    Pharmacy(4,"Мед товары"),
    Food(5,"Еда");

    private int id;
    private String name;

    ProductsType(int id, String name){
        this.id =  id;
        this.name = name;
    }

    public String getDescriprion(){
        return name;
    }

    public int getId() {
        return id;
    }
}
