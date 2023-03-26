public class Cafetera {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Cafetera() {
    }

    public Cafetera(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
      return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;

    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void americano(){
        if (getAgua()>=180 && getCafe()>=15 && getVasos()>=1) {
            setAgua(getAgua() - 180);
            setCafe(getCafe() - 15);
            setVasos(getVasos() - 1);
            System.out.println("Cafe americano servido...");
            if(getAgua() >= 100 && getCafe() >= 14 && getCrema() >= 70 && getVasos() >= 1){
                System.out.println("Puede seguir sirviendo\n");
            }
            else {
                System.out.println("Ya no suficientes recursos para otro\n");
            }
        }
        else {
            System.out.println("No hay suficientes recursos");
        }
    }
    public void expreso(){
        if (getAgua()>=120 && getCafe() >= 10 && getVasos() >= 1) {
            setAgua(getAgua() - 120);
            setCafe(getCafe() - 10);
            setVasos(getVasos() - 1);
            System.out.println("Cafe expreso servido...");
            if(getAgua() >= 100 && getCafe() >= 14 && getCrema() >= 70 && getVasos() >= 1){
                System.out.println("Puede seguir sirviendo\n");
            }
            else {
                System.out.println("Ya no suficientes recursos para otro\n");
            }
        }
        else {
            System.out.println("No hay suficientes recursos");
        }
    }
    public void capuchino(){
        if(getAgua() >= 100 && getCafe() >= 14 && getCrema() >= 70 && getVasos() >= 1) {
            setAgua(getAgua() - 100);
            setCafe(getCafe() - 14);
            setCrema(getCrema() - 70);
            setVasos(getVasos() - 1);
            System.out.println("Cafe capuchino servido...");
            if(getAgua() >= 100 && getCafe() >= 14 && getCrema() >= 70 && getVasos() >= 1){
                System.out.println("Puede seguir sirviendo\n");
            }
            else {
                System.out.println("Ya no suficientes recursos para otro\n");
            }
        }
        else{
            System.out.println("No hay suficientes recursos");
        }
    }
    public void check(){
        System.out.println("La cafetera tiene:\n" +
                "Cafe: " + getCafe() +"\n" +
                "Agua: " + getAgua() + "\n" +
                "Crema: "+ getCrema() + "\n" +
                "Vasos: "+ getVasos());

    }

}
