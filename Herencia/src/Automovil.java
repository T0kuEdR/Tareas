
public class Automovil extends Vehiculo{
    protected String marca;
    protected String modelo;
    protected int anno;

    public Automovil() {
    }

    public Automovil(int cantRuedas, int capcidadDePersonas, String tamano, String marca, String modelo, int anno) {
        super(cantRuedas, capcidadDePersonas, tamano);
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anno=" + anno +
                ", cantRuedas=" + cantRuedas +
                ", capcidadDePersonas=" + capcidadDePersonas +
                ", tamano='" + tamano + '\'' +
                '}';
    }
    public void nuevo(){
        System.out.println("el carro esta nuevo :D");
    }
    public void chocado(){
        System.out.println("El carro esta chocado...");
    }

}

