package InClass4.Services;

import InClass4.MAin.ParsingHelper;
import InClass4.Enum.ParseType;
import InClass5.GeneralType;
import InClass5.IncorrectEmailException;

public class Main {

   /* public static void sendEmail(String email) throws IncorrectEmailException{
        if ( email == null) {
            throw new IncorrectEmailException(1);
        }
    }
*/
    public static void main(String[] args) {
        /*try{
            sendEmail(null);
        }catch (IncorrectEmailException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Done");
        }*/
        GeneralType<XmlParser> type = new GeneralType<>(new XmlParser("Null"));

    }
}
