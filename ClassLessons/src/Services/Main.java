package Services;

import MAin.ParsingHelper;
import Enum.ParseType;

public class Main {
    public static void main(String[] args) {
        IParser csvParcer = new csvParser();
       // csvParcer.putFilePath("Kalfklawk");
        ParsingHelper.parse(new csvParser());
        IParser xmlPArser = new XmlParser();
       // csvParcer.putFilePath("gsdgsdks");
        ParsingHelper.parse(new XmlParser());

        ParseType type = ParseType.XML;
        IParser parser = null;


        switch (type){
            case CSV: {
                csvParcer = new csvParser();

                break;
            }

            case XML:{
                csvParcer = new XmlParser();
                break;
            }

            case TXT: {
                System.out.println("TXT");
                break;
            }
        }
        ParsingHelper.parse(parser);
    }
}
