package FirstWork;

public interface Editor {
    Editor [] editor = new Editor[]{new Word(), new Acrobat(), new Word()};

    void compression();

    void translate();

    void changeFont();

    default void haos (){}
}
