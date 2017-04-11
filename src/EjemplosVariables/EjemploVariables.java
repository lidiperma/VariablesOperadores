
package EjemplosVariables;


public class EjemploVariables {

    //Método para ver los diferentes tipos de variables por consola
    public static void main(String[] args) {
        
        //DECLARACIÓN DE UNA VARIABLE CON TIPO DE DATOS BOOLEANO
        //La declaramos y la inicializamos a la vez.
        //Es decir, a la variable "resultado" de tipo "booleano" le asigno
        //el literal "true"
        //Los boolean sólo pueden ser "true" o "false"
        boolean resultado = true;
        boolean resultado2 = false;
        //Imprimimos por pantalla concatenando
        System.out.println("El resultado es " + resultado);
        
        //DECLARACIÓN DE UNA VARIABLE CON TIPO DE DATO CHAR
        char opcion;
        opcion= 'C'; //Asignación de 'C' siempre con comillas simples
        
        System.out.println("El valor de la opcion es " + opcion);
        
        char opcion1;
        opcion1 = '\t'; //Se trata de un carácter especial NO IMPRIMIBLE con función TABULADORA
        // \indica un salto(backslash o barra inversa) 
        
        System.out.println("Sin tabulador es " + opcion );
        System.out.println("Con tabulador es " + opcion1 + opcion );
        
        char opcionComilla = '\'';//Al ser un carácter reservado utilizamos \ 
        System.out.println("Esta es la comilla: " + opcionComilla );
        
        //Vamos a realizar un cast
        char opcion2;
        opcion2 = (char) 64;//Obligamos a que interprete un valor int en un char
        System.out.println("El caracter es " + opcion2 );
        //Revisar el resultado en http://www.petefreitag.com/cheatsheets/ascii-codes/
        
         
    }
    
}
