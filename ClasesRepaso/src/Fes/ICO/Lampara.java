package Fes.ICO;

public class Lampara {
    private String marca;
    private boolean estado;
    private double longitud;

    public Lampara(String marca) {
        this.marca = marca;
    }

    public Lampara(boolean estado) {
        this.estado = estado;
    }

    public Lampara(double longitud) {
        this.longitud = longitud;
    }

    public Lampara(String marca, boolean estado, double longitud) {
        this.marca = marca;
        this.estado = estado;
        this.longitud = longitud;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", estado=" + estado +
                ", longitud=" + longitud +
                '}';
    }

    public void encendida(){
        System.out.println("La lampara esta encendida...");
    }

    public void apagada(){

        System.out.println("La lampara esta apagada...");
    }
}
