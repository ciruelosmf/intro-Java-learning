/*package primerprograma; 
ej 1 extra
*/


import java.util.Scanner;



public class ConvertirMinutosAHorasDias {
    
    static int suma_dias = 0;
    static int suma_horas = 0;

    static int ret_func_dias = 0;
    static int ret_func_horas = 0;








    public static int convertir_a_dias(int minutos)         {
        int mins_en_dia = 1440;
        suma_dias = minutos / mins_en_dia;
        return suma_dias;
    
    
        /*  con una línea sola:
    
    return minutos / 1440;  
    
    */
                                                    }  







    public static int convertir_a_horas(int minutos)         {
        
        if (minutos < 1440) {
            suma_horas = minutos / 60;
            return suma_horas;
        }



        
        
        else{
            int suma_dias_p_sobrante_min = minutos / 1440;

            int sobrante_minutos = minutos - (1440 * suma_dias_p_sobrante_min);
            
 

            return sobrante_minutos / 60;

        }
        
    
                                                }  



    public static void main (String[] args) {

    
        int num = 0;
        int num2 = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("-------------- ");



        System.out.println("Por favor, ingrese una cantidad de minutos a calcular");
        num = leer.nextInt();
        System.out.println(" ");


        int ret_func_dias = convertir_a_dias(num);
        int ret_func_horas = convertir_a_horas(num);

        System.out.println("Los " + num + " minutos a calcular se dividen en");
        System.out.println(" ");
        System.out.println(ret_func_dias + "Días y ");
        System.out.println(" ");
        System.out.println(ret_func_horas + " Horas");
        System.out.println(" ");
        System.out.println("-------------- ");
        

        

        
        







}
}
