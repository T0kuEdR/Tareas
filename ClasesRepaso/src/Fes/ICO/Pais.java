package Fes.ICO;

public class Pais {
    private String nombre;
    private String moneda;
    private int habitantes;

    public Pais(String nombre, String moneda, int habitantes) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", moneda='" + moneda + '\'' +
                ", habitantes=" + habitantes +
                '}';
    }

    public void crisis(){
        System.out.println(nombre +" esta en crisis");
    }
    public void estable(){
        System.out.println(nombre + " esta bien");
    }
    public void crecimiento(){
        System.out.println("Pais desarrollado");
    }
}
