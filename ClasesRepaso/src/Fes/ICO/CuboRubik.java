package Fes.ICO;

public class CuboRubik {
    private int Ancho;
    private int largo;
    private String estado;

    public CuboRubik(int ancho) {
        Ancho = ancho;
    }
    public CuboRubik(String estado) {
        this.estado = estado;
    }
    public CuboRubik(int ancho, int largo, String estado) {
        Ancho = ancho;
        this.largo = largo;
        this.estado = estado;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "Ancho=" + Ancho +
                ", largo=" + largo +
                ", estado='" + estado + '\'' +
                '}';
    }

    public void resuelto(){
        if (estado == "resuelto;"){
            System.out.println("El cubo esta resuelto");
        }else{
            System.out.println("Sigue intentando c:");
        }
    }
    public void desarmado(){
        if (estado == "desarmado"){
            System.out.println("El cubo rubik esta desarmado...");
        }
    }
}
