import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> micaja = new Caja<>(new String[10]);
        micaja.add(0,"Hola");
        micaja.add(1,"Adios");
        micaja.add(2,"Hi");
        System.out.println(micaja);
        System.out.println("----Comida----");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0,new Comida("Yogurt",true));
        System.out.println(cajaComida.get(0));
        System.out.println("-----");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Manzana",false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(13));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Yoguth", true));
        comidas.add(new Comida("Danonino", true));
        comidas.add(new Comida("Manzana", false));
        comidas.add(new Comida("Bisteck", false));
        System.out.println(comidas2.get(3));

        comidas.add(3, new Comida("Fresa", false));
        comidas.add(3,new Comida("Naraja", false));
        System.out.println("----final----");
        for (Comida comida : comidas2) {
            System.out.println(comida);
        }
    }
}