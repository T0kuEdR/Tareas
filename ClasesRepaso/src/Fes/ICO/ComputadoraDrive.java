package Fes.ICO;

public class ComputadoraDrive {
    public static void main(String[] args) {
        Computadora compu1 = new Computadora(4,124,"intel");
        compu1.encendida();
        System.out.println(compu1);
        Computadora compu2 = new Computadora(4,124,"intel");
        compu2.apagada();
        System.out.println(compu2);
    }
}
