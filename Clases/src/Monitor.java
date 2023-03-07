public class Monitor {
    private String marca;
    private double resolucion;
    private double tamaino;
    private  byte frecuencia;

    public Monitor(){
        marca = "";
        resolucion = 0;
        tamaino = 0;
        frecuencia = 0;
    }
    public Monitor(String marca, double resolucion, double tamaino, byte frecuencia) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tamaino = tamaino;
        this.frecuencia = frecuencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public double getTamaino() {
        return tamaino;
    }

    public void setTamaino(double tamaino) {
        this.tamaino = tamaino;
    }

    public byte getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(byte frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", resolucion=" + resolucion +
                ", tamaino=" + tamaino +
                ", frecuencia=" + frecuencia +
                '}';
    }

    public void encender(){
        System.out.println("El monitor esta prendido...");
    }
    public  void apagado(){
        System.out.println("El monitor esta apagado...");
    }
    public  void proyectar(){
        System.out.println("El monitor esta proyectando...");
    }
}
