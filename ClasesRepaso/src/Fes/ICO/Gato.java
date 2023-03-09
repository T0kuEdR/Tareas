package Fes.ICO;

import java.awt.*;

public class Gato {
    private String nombre;
    private int edad;
    private Color color;
    private String complexion;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public Gato(int edad) {
        this.edad = edad;
    }

    public Gato(Color color) {
        this.color = color;
    }

    public Gato(String nombre, int edad, Color color, String complexion) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.complexion = complexion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color=" + color +
                ", complexion='" + complexion + '\'' +
                '}';
    }

    public void caminar(){
        System.out.println(nombre + " Esta camindando");
    }
    public void comer(){
        System.out.println(nombre + " Esta comiendo");

    }

    public void dormir(){
        System.out.println("SHH, esta mimido");
    }
}
