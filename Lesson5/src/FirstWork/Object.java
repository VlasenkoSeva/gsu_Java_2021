package FirstWork;
import java.util.Objects;

public class Object {
    private String nameOfObjects;
    private int time;
    private String difficulty;

    public Object(String nameOfObjects, int time, String difficulty){
        this.difficulty = difficulty;
        this.nameOfObjects = nameOfObjects;
        this.time = time;
    }



    public String getNameOfObjects() {
        return nameOfObjects;
    }

    public void setNameOfObjects(String nameOfObjects) {
        this.nameOfObjects = nameOfObjects;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
