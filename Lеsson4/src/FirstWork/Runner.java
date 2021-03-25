package FirstWork;

public class Runner {
    public static void main(String[] args) {
        Editor acrobat = new Acrobat();
        Editor notepad = new NotePad();
        Editor word = new Word();

        acrobat.changeFont();
        acrobat.compression();
        acrobat.translate();
    }
}
