package InClass4.Enum;

public enum Status {

    ACTIVE(1),
    DELETE(2),
    SUSPENDED(3),
    PENDING(4);

    Status(int id){
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
