package FirstWork;

public class Acrobat implements Editor {


    @Override
    public void compression() {
        System.out.println("Какой формат файла вам нужен?");
    }

    @Override
    public void translate() {
        System.out.println("Какой язык предпочитаете?");
    }

    @Override
    public void changeFont() {
        System.out.println("Font - Segoe UI");
    }
}
