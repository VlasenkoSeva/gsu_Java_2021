package FirstWork;

import java.security.PrivateKey;

public class Address {
    private String country;
    private String street;
    private String city;
    private String state;
    private int postCode;

    public Address(String country, String street, String city, String state, int postCode){
        this.country = country;
        this.street = street;
        this.city = city;
        this. state = state;
        this.postCode = postCode;
    }

    public void validate (){
        System.out.println("Address confirm");
    }

    public void outPutAsLAbel (){
        System.out.println("Country : " + country + ", State : " + state + ", City : " + city + ", Street : " + street +
                ", Postal Code : " + postCode);
    }
}
