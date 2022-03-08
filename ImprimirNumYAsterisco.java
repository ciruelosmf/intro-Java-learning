/*package primerprograma; */
import java.util.Scanner;

public class ImprimirNumYAsterisco {
    public static void main (String[] args) {

        Scanner leer = new Scanner(System.in);
        
System.out.println("-------------- ");
System.out.println(" ");

        System.out.println("Este programa Imprime un número ingresado por usted, y luego un asterisco repetido la cantidad de veces del ´numero que ingresó. ");
        System.out.println(" ");
        
System.out.println(" ");



for (int i = 0; i < 3; i++) {

    System.out.printf("Por favor, ingrese un número ");
    int num = leer.nextInt();

    String stringy = "";
    for (int ii = 0; ii < num; ii++) {
        stringy += "*";

    }

    System.out.println(num + " " + stringy);
    System.out.println(" ");


}



System.out.println("-------------- ");
System.out.println(" ");



    }
}