package Fes.ICO;

import java.awt.*;

public class LibroDriver {
    public static void main(String[] args) {
        Libro lib1 = new Libro("Biblia","Varios",500, Color.GREEN);
        lib1.abierto();
        System.out.println(lib1);
        Libro lib2 = new Libro("Quijote","Cervantes",100, Color.GREEN);
        lib2.cerrado();
        System.out.println(lib2);
    }
}
