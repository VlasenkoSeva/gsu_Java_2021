package ThirdWork;

import java.io.Serializable;

public class Computer <T,S extends Number>{
    private S ram;
    private T vram;
    private String nameOfProccesor;

    public Computer(String nameOfProccesor){
        this.nameOfProccesor = nameOfProccesor;
        this.ram = ram;
        this.vram = vram;
    }

    public String  pc(){
        if (nameOfProccesor.equals("Intel")){
            return (nameOfProccesor);
        }else
            if (nameOfProccesor.equals("AMD")){
                return nameOfProccesor;
            }
            else{
                System.out.println("У вас другой процессор");
            }
            return (toString());
    }
}
