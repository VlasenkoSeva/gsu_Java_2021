package ThirdWork;

import FirstWork.Acrobat;
import FirstWork.Editor;
import FirstWork.NotePad;
import FirstWork.Word;

public class Runner {
    public static void main(String[] args) {
        Editor acrobat = show(Enum.Acrobat);

        acrobat.translate();
        acrobat.compression();
        acrobat.changeFont();
        acrobat.haos();
    }

    public static Editor show(Enum type) {
        switch (type) {
            case Word:
                return new Word();

            case NotePad:
                return new NotePad();

            case Acrobat:
                return new Acrobat();
        }
        return null;
    }
}
