/*package primerprograma; */
import java.util.Scanner;

public class PedirFraseTransformarlaEnMayusculaMinu {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese una frase larga, la cual será mostrada en pantalla en formato Mayúscula y Minúscula");
        String frase = leer.nextLine();
        String frase_mayuscula = frase.toUpperCase();
        String frase_minuscula = frase.toLowerCase();




System.out.println("-------------- ");
System.out.println(" ");
        System.out.println("La frase es: " + frase);
        System.out.println(" ");
System.out.println("-------------- ");

System.out.println(" ");
        System.out.println("La frase en Mayúscula es: " + frase_mayuscula);
        System.out.println(" ");
System.out.println("-------------- ");

System.out.println(" ");
        System.out.println("La frase en Minúscula es: " + frase_minuscula);
        System.out.println(" ");
System.out.println("-------------- ");

        

    }
}