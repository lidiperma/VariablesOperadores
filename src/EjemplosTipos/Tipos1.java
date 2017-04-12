
package EjemplosTipos;


public class Tipos1 {

    //Método para ver los diferentes tipos de variables por consola
    public static void main(String[] args) {
        
        //Variables
        char a = 'a';
        char b = 'b';
        double x = 3.2d;
        float y = 4.8f;
        int auxiliar = 30;
        long numeroCuentas = 10000000000L;
        boolean verdadero = true;     
        
        //DECLARACIÓN DE UNA VARIABLE CON TIPO DE DATOS BOOLEANO
        /*La declaramos y la inicializamos a la vez. Es decir, a la variable 
          "resultado" de tipo "booleano" le asigno
          el literal "true".
          Los boolean sólo pueden ser "true" o "false"*/
        boolean resultado = true;
        boolean resultado2 = false;
        
        System.out.println("El resultado es " + resultado);
        
        //DECLARACIÓN DE UNA VARIABLE CON TIPO DE DATO CHAR
        char opcion;
        opcion= 'C'; //Asignación de 'C' siempre con comillas simples
        
        System.out.println("El valor de la opcion es " + opcion);
       
        
        //Vamos a realizar un cast
        char opcion2;
        opcion2 = (char) 64;//Obligamos a que interprete un valor int en un char
        System.out.println("El caracter es " + opcion2 );
        //Revisar el resultado en http://www.petefreitag.com/cheatsheets/ascii-codes/
        
        
        
         
    }
    
}
