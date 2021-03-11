package PackageCredit;

public class Credit {
    private String NameOfCredit ;
    private int rate ; //ставка
    private String  date ;
    private boolean fine ;




    public  Credit(int rate, String  date){
        this.rate = rate;
        this.date = date;
    }

    public  Credit(String NameOfCredit, int rate, String  date, boolean fine){
        this(rate, date );
        this.NameOfCredit = NameOfCredit;
        this.fine = fine;
    }



    public String getNameOfCredit() {
        return NameOfCredit;
    }

    public void setNameOfCredit(String nameOfCredit) {
        NameOfCredit = nameOfCredit;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String  getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    public boolean getFine() {
        return fine;
    }

    public void setFine(boolean fine) {
        this.fine = fine;
    }

    public void Show(){
        if (fine == true){
            System.out.println("Название кредита : " + NameOfCredit + " Ставка : " + rate + " Дата погошения : " + date + " Штраф есть" );

        }else
        System.out.println("Название кредита : " + NameOfCredit + " Ставка : " + rate + " Дата погошения : " + date + " Штрафа нету ");


    }



}

