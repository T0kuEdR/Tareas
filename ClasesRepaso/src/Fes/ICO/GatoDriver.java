package Fes.ICO;

import java.awt.*;

public class GatoDriver {
    public static void main(String[] args) {
        Gato cat1 = new Gato("Lola",1, Color.LIGHT_GRAY,"Gorda");
        cat1.dormir();
        System.out.println(cat1);

        Gato cat2 = new Gato("Chona",2, Color.LIGHT_GRAY,"Flaca");
        cat2.comer();
        System.out.println(cat2);
    }
}
