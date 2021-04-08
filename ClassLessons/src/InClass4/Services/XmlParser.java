package InClass4.Services;

import java.util.Date;
import java.util.Objects;

public  class XmlParser implements IParser, Cloneable{
    private String path;
    private int size;

    public XmlParser(String s) {
    }

    public void Size(int size){
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XmlParser xmlParser = (XmlParser) o;
        return size == xmlParser.size && path.equals(xmlParser.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, size);
    }

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
    public void putFilePAth(String path) {

    }


    @Override
    public double parse() {
        return 0;
    }

    @Override
    public Date dateParse() {
        return null;
    }

    @Override
    public String toString() {
        return "XmlParser{" +
                "path='" + path + '\'' +
                '}';
    }

   public XmlParser clone(){
        return  this.clone();
   }
}
