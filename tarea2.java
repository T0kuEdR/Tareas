# Tareas
Garcia Santiago Emiliano POO 2208 FESA

import java.util.Scanner;
public class tarea2{
    public static void main (String[] args){
     Scanner teclado = new Scanner(System.in);
    String [] a;
    String b = "";
   
    System.out.println("Ingrese su nombre, profesion, pais");
     b = teclado.nextLine();
     a=b.split(" ");

    System.out.println("Nombre: "+ a[0]);
    System.out.println("Profesion: "+ a[1]);
    System.out.println("Pais: "+ a[2]);
    }
}
