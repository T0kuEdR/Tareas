import java.awt.*;

public class Automovil {
    private String marca;
    private String subMarca;
    private byte anno;
    private Color color;

    public Automovil(){
        marca ="";
        subMarca ="";
        anno=0;
        color =Color.BLACK;

    }

    public Automovil(String marca, String subMarca, byte anno, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.anno = anno;
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSubMarca() {
        return subMarca;
    }
    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }
    public byte getAnno() {
        return anno;
    }
    public void setAnno(byte anno) {
        this.anno = anno;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;

    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", anno=" + anno +
                ", color=" + color +
                '}';
    }

    public void avanzar(){
        System.out.println("El carro esta avanzando...");
}
    public void estacionado(){
        System.out.println("El carro esta estacionado...");
    }
    public void reparacion(){
        System.out.println("El carro esta en el taller...");
    }

}
