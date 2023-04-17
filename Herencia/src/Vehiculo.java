public class Vehiculo {
    protected int cantRuedas;
    protected int capcidadDePersonas;
    protected String tamano;

    public Vehiculo() {
    }

    public Vehiculo(int cantRuedas, int capcidadDePersonas, String tamano) {
        this.cantRuedas = cantRuedas;
        this.capcidadDePersonas = capcidadDePersonas;
        this.tamano = tamano;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getCapcidadDePersonas() {
        return capcidadDePersonas;
    }

    public void setCapcidadDePersonas(int capcidadDePersonas) {
        this.capcidadDePersonas = capcidadDePersonas;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "cantRuedas=" + cantRuedas +
                ", capcidadDePersonas=" + capcidadDePersonas +
                ", tamano='" + tamano + '\'' +
                '}';
    }

    public void mover(){
        System.out.println("el vehiculo se esta moviendo...");
    }
    public void quieto(){
        System.out.println("el vehiculo esta quiento ._. ...");
    }
}
