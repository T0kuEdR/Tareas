package Fes.ICO;

public class Computadora {

    private int ram;
    private int memoria;
    private String procesador;
    public Computadora(int ram) {
        this.ram = ram;
    }
    public Computadora(String procesador) {
        this.procesador = procesador;
    }

    public Computadora(int ram, int memoria, String procesador) {
        this.ram = ram;
        this.memoria = memoria;
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "ram=" + ram +
                ", memoria=" + memoria +
                ", procesador='" + procesador + '\'' +
                '}';
    }

    public void encendida(){
        System.out.println("La compu esta prendida");
    }
    public void apagada(){
        System.out.println("La compu esta apagada");

    }
}
