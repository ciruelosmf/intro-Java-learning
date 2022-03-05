/*package primerprograma; */
import java.util.Scanner;

public class SumarNumeros {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese  el primer número");
        int numero1 = leer.nextInt();

        System.out.println("Por favor, ingrese  el segundo número");
        int numero2 = leer.nextInt();

        int numero_final = numero1 + numero2;

        System.out.println("La suma de los dos números es: ");
        System.out.println(numero_final);

    }
}