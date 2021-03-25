package SecondWork;

public enum Month {
    January(1),
    february(2),
    march(3),
    april(4),
    may(5),
    june(6),
    july(7),
    august(8),
    september(9),
    october(10),
    november(11),
    december(12);

    private int id;

    Month(int id){
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
