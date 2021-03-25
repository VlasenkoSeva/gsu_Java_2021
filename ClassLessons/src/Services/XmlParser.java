package Services;

import java.util.Date;

public  class XmlParser implements IParser{
    private String path;

    @Override
    public void putFilePath() {

    }

    @Override
    public void putFilePath(String path) {
        this.path = path;
    }

    @Override
    public boolean getPath() {

        return false;
    }

    @Override
    public void putFilePath(String path) {

    }

    @Override
    public double parse() {
        return 0;
    }

    @Override
    public Date dateParse() {
        return null;
    }
}
