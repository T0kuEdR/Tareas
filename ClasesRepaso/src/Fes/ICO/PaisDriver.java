package Fes.ICO;
public class PaisDriver { 
    public static void main(String[] args){
        Pais pais1 = new Pais("Mexico","peso",120000);
        pais1.crisis();
        System.out.println(pais1);
        Pais pais2 = new Pais("EEUU","Dolar",1000000);
        pais2.estable();
        System.out.println(pais2);
    }
}
