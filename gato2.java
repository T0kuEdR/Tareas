import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de 9 caracteres que contenga solo 'X', 'O' o '_':");
        String cadena = scanner.nextLine();

        if (cadena.length() != 9) {
            System.out.println("La cadena debe tener exactamente 9 caracteres.");
            return;
        }
        for (char c : cadena.toCharArray()) {
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("La cadena solo puede contener 'X', 'O' o '_'.");
                return;
            }
        }
        String [] caracter;
        caracter = cadena.split("");
        System.out.println(" --- ");
        System.out.println("|"+caracter[0]+caracter[1]+caracter[2]+"| \n|"+caracter[3]+caracter[4]+caracter[5]+"| \n|"
        +caracter[6]+caracter[7]+caracter[8]+"|");
        System.out.println(" --- ");
    }
}
