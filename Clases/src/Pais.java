public class Pais {
    private String nombre;
    private String moneda;
    private byte estados;
    private int habitantes;

    public Pais(){
        nombre ="";
        moneda ="";
        estados=0;
        habitantes=0;
    }
    public Pais(String nombre, String moneda, byte estados, int habitantes) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.estados = estados;
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
    public byte getEstados() {
        return estados;
    }
    public void setEstados(byte estados) {
        this.estados = estados;
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
                ", estados=" + estados +
                ", habitantes=" + habitantes +
                '}';
    }

    public void crisis(){
        System.out.println("El pais esta entrando en crisis...");
    }
    public void estable(){
        System.out.println("El pais esta estable...");
    }
    public void prosperando(){
        System.out.println("El pais esta prosperando c:");
    }
}
