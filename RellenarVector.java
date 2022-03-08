/*package primerprograma; 

Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido

*/



import java.util.Scanner;
import java.util.Scanner;





public class RellenarVectorConRandomyBuscar {
    public static void main (String[] args) {

        int[] vecty = new int[100];
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------- ");
        System.out.println(" ");

        private void rellenar_vector() {
            for (int i = 0; i < 100; i++) {
                int numero = (int) (Math.random() * 10);
                vecty[i] = numero;
            }
        }

        System.out.println(" ");
        rellenar_vector();
        System.out.println(vecty[1]);

        System.out.println("-------------- ");
        System.out.println(" ");

    }
}