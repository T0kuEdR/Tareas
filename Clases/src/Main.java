import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Automovil auto1= new Automovil();
        auto1.avanzar();
        System.out.println(auto1);
        System.out.println("------");
        Persona per1= new Persona();
        System.out.println(per1);
        per1.dormir();
        System.out.println("------");
        Monitor moni1= new Monitor();
        moni1.encender();
        System.out.println(moni1);
        System.out.println("------");
        Pais pais1 = new Pais();
        System.out.println(pais1);
        pais1.crisis();
    }
}