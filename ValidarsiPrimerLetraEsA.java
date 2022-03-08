/*package primerprograma; */
import java.util.Scanner;

public class ValidarsiPrimerLetraEsA {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        
System.out.println("-------------- ");
System.out.println(" ");

        System.out.println("Este programa intenta validar si la primer letra de una frase ingresada es la letra -A- ");
        System.out.println(" ");
        System.out.println("Por favor, ingrese una frase larga");
        String frase = leer.nextLine();
System.out.println(" ");
System.out.println(frase[3]);
    String prefix = "a";
        if (frase.startsWith(prefix)) {
            System.out.println("Correcto, la primer letra de la frase ingresada es la letra -A- ");
        }




System.out.println("-------------- ");
System.out.println(" ");




        

    }
}