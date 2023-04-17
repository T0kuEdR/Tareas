public class Taxi extends Automovil{
    private String nomTaxista;
    private float tarifa;
    private int numHoras;

    public Taxi() {
    }

    public Taxi(int cantRuedas, int capcidadDePersonas, String tamano, String marca, String modelo, int anno, String nomTaxista, float tarifa, int numHoras) {
        super(cantRuedas, capcidadDePersonas, tamano, marca, modelo, anno);
        this.nomTaxista = nomTaxista;
        this.tarifa = tarifa;
        this.numHoras = numHoras;
    }

    public String getNomTaxista() {
        return nomTaxista;
    }

    public void setNomTaxista(String nomTaxista) {
        this.nomTaxista = nomTaxista;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "nomTaxista='" + nomTaxista + '\'' +
                ", tarifa=" + tarifa +
                ", numHoras=" + numHoras +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anno=" + anno +
                ", cantRuedas=" + cantRuedas +
                ", capcidadDePersonas=" + capcidadDePersonas +
                ", tamano='" + tamano + '\'' +
                '}';
    }
    public void ocupado(){
        System.out.println("el taxi esta ocupado, tienes que esperar otro");
    }
    public void libre(){
        System.out.println("el esta libre c:");
    }

    @Override
    public void mover() {
        System.out.println("El taxi se esta moviendo");
    }

    @Override
    public void chocado() {
        System.out.println("el taxi choco!! D:");
    }
}

