package FourthWork;

public abstract class Product {
    private ProductsType type;
    private String name;

    public ProductsType getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public void show(){
        System.out.println("Type of products" + type + " Name of products");
    }
}

