/*package primerprograma; 

Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido

*/

import java.util.Scanner;





public class RellenarVectorConRandomyBuscar {
            /**//**/ /**//**/ /**//**/ /**//**/
            /**//**/ /**//**/ /**//**/ /**//**/
            /**//**/ /**//**/ /**//**/ /**//**/



    static int[] vecty = new int[100];
    




    public static void rellenar_vector() 
    {

        for (int i = 0; i < 100; i++) {
            int numero = (int) (Math.random() * 100);
            System.out.println(numero);
            vecty[i] = numero;

        }
    }




    
    public static void buscar_en_vector(int []vec, int numero_a_buscar)  {

        for (int i = 0; i < 100; i++) {
            if (vec[i] == numero_a_buscar) {
                System.out.println("El número está en la posición del array:  ");
                System.out.println(i);
                System.out.println("-------------- ");

            }

                                        }
                                                    }



    public static void main (String[] args) {


        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese el número a buscar: ");
        int numero_input = leer.nextInt();
        System.out.println("-------------- ");
        System.out.println(" ");
        System.out.println(" ");
        rellenar_vector();
        buscar_en_vector(vecty, numero_input);
        System.out.println("-------------- ");
        System.out.println(" ");


                                            }





}
