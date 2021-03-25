package Enum;

public enum ParseType {
    CSV(1,"CSV"),
    XML(2,"XML"),
    TXT(3,"TXT");

    private int id;
    private String name;

    private ParseType(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
