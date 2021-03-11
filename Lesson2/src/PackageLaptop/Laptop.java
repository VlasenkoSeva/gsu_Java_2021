package PackageLaptop;

public class Laptop {
    private String MacAddress;
    private String Model;
    private String Weight;
    private String ProcesorType;
    private String OS;

    public Laptop(String MacAddress, String Model, String  Weight, String ProcesorType, String OS ){
        this.MacAddress = MacAddress;
        this.Model = Model;
        this.Weight = Weight;
        this.ProcesorType = ProcesorType;
        this.OS = OS;
    }

    public Laptop(String macAddress, String model, String os){
        this.MacAddress = macAddress;
        this.Model = model;
        this.OS = os;
    }

    public Laptop(String weight, String procesorType){
        this.Weight = weight;
        this.ProcesorType = procesorType;
    }

    public Laptop(){

    }

    public void showNotePad(String FileName){
        System.out.printf("Content of name file", FileName);
    }

    public void showNotePad(String FileName, int StringOfCode){
        System.out.printf("Content of name file with name strings of code", FileName, StringOfCode);
    }

    public String getMacAddress() {
        return MacAddress;
    }

    public void setMacAddress(String macAddress) {
        MacAddress = macAddress;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String  getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getProcesorType() {
        return ProcesorType;
    }

    public void setProcesorType(String procesorType) {
        ProcesorType = procesorType;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }


    public void Show(){
        System.out.println("MacAddress : " + MacAddress + ",Model : " + Model + ",Weight : " + Weight + ",ProcesorType : " + ProcesorType + ",OS : " + OS);
    }

}
