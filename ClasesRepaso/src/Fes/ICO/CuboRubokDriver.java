package Fes.ICO;

public class CuboRubokDriver {

    public static void main(String[] args) {
        CuboRubik cubo1 = new CuboRubik(3,3,"resuelto;");
        cubo1.resuelto();
        System.out.println(cubo1);
        CuboRubik cubo2 = new CuboRubik(5,5,"desarmado");
        cubo2.resuelto();
        System.out.println(cubo2);
        cubo2.desarmado();
        System.out.println(cubo2);
    }
}
