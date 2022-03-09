/*package primerprograma; 

Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.

2  7  6    
9  5  1
4  3  8

*/

import java.util.Scanner;





public class MatrizEsCuadradoMagico {
            /**//**/ /**//**/ /**//**/ /**//**/
            /**//**/ /**//**/ /**//**/ /**//**/
            /**//**/ /**//**/ /**//**/ /**//**/



    static int[][] matriz = new int[3][3];
    static Scanner leer = new Scanner(System.in);
    static int suma_fila;
    static int suma_col;
    static int suma_diag;








    public static void rellenar_vector(int i1, int i2, int numero_para_rellenar)    {


        matriz[i1][i2] = numero_para_rellenar;

        
                                                                                        }










                                                                        





    public static void sum_fila_matriz()                    {

    suma_fila = matriz[0][0] + matriz[0][1] + matriz[0][2];

                                                             }  
    







    public static void sum_col_matriz()         {

    suma_col = matriz[0][0] + matriz[1][0] + matriz[2][0];

                                                } 







    public static void sum_diag_matriz()        {

    suma_diag = matriz[0][0] + matriz[1][1] + matriz[2][2];


                                                }                                                                                                                                             







    public static void check_si_matriz_magica_verdadera(){

    if (suma_fila == suma_col && suma_col == suma_diag) {
        System.out.println("La matriz es mágica");
    }
    else{
        System.out.println("La matriz no es mágica");
    }

}




    public static void main (String[] args) {





        System.out.println("-------------- ");
        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {

            for (int i2 = 0; i2 < 3; i2++) {
                System.out.println("Por favor, ingrese el número a usar: ");
                int numero_input = leer.nextInt();
                rellenar_vector(i, i2, numero_input);
            }
        }
                
        
        

        System.out.println("-------------- ");
        System.out.println(" ");

        for (int i = 0; i < 3; i++) {

            for (int i2 = 0; i2 < 3; i2++) {

                System.out.println(matriz[i][i2]);

            }
        }



        sum_fila_matriz();
        sum_col_matriz();
        sum_diag_matriz();
        System.out.println(suma_diag + "----");
        check_si_matriz_magica_verdadera();


                                            }





}
