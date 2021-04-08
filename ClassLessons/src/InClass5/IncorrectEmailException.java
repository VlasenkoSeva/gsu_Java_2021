package InClass5;

public class IncorrectEmailException extends  Exception{
    private int code;

    public IncorrectEmailException(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage(){
        return "Inccorect Status";
    }
}
