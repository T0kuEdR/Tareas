public class Main {
    public static void main(String[] args) {

        Taxi taxi = new Taxi(4,5,"mediano"," toyotan",
                "Tsuru",2000,"Jose",200,8);
        System.out.println(taxi);
        taxi.chocado();
        taxi.mover();
        taxi.ocupado();
        Vehiculo vehiculo = new Vehiculo(2,1,"chico");
        System.out.println(vehiculo);
        Automovil auto = new Automovil(4,8,"grande","BMW","Micro",2006);
        System.out.println(auto);
    }
}