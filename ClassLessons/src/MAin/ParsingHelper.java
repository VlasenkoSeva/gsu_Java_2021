package MAin;

import Services.IParser;

public class ParsingHelper {

    public static final int XML = 1;
    public static final int CSV = 2;



    public static void parse(IParser parser){
        parser.parse();
        System.out.println(parser.dateParse());
        System.out.println(parser.getPath());
    }
}
