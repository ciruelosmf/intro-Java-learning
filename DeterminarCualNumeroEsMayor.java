/*package primerprograma; 
ej 6
*/
import java.util.Scanner;

public class DeterminarCualNumeroEsMayor {


        public static void main (String[] args) {

            int num = 0;
            int num2 = 0;

            Scanner leer = new Scanner(System.in);


            System.out.println(" ");
            System.out.println(" ");
            System.out.println("-------------- ");
            System.out.println(" ");
            System.out.println("Este programa intenta verificar cuál de los dos número ingresados es mayor ");
            System.out.println(" ");
            System.out.println(" ");



        



            System.out.println("Por favor, ingrese un número");
            num = leer.nextInt();
            System.out.println(" ");
            System.out.println("Por favor, ingrese otro número");
            num2 = leer.nextInt();








            System.out.println(" ");
            if (num > num2){
                System.out.println("El número " + num + " es mayor que " + num2);
            }
            else{
                System.out.println("El número " + num2 + " es mayor que " + num);
            }







            System.out.println(" ");
            System.out.println("-------------- ");






    }
}