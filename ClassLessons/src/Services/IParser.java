package Services;

import java.util.Date;

public interface IParser {
    void putFilePath();

    void putFilePath();

    void putFilePath();

    void putFilePath(String path);

    boolean getPath();

    void putFilePAth(String path);

    double parse();
    default Date dateParse(){
        return new Date();
    }
}
