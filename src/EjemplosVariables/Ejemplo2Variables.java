
package EjemplosVariables;


public class Ejemplo2Variables {

    
    public static void main(String[] args) {
        
        //DECLARACIÓN DE LA VARIABLE CON TIPO DE DATOS INT Y EL OPERADOR =ASIGNACION
        
        int cantidadPersonas = 20;
        int valorHora = 23456 * 500 * cantidadPersonas; //Añadir más 0 OPERADOR *MULTIPLICACIÓN
        
        System.out.println("¿Cuantas personas?: " + valorHora);
        
        //Como se asigna un literal hexadecimal a una variable Int
        int hexa = 0xAF;//0x seguido de los dígitos AF (hexadecimal)
        System.out.println("El valor de AF en decimal es " + hexa); 
        
        int octa = 012654;//0 indica operará con octal
        System.out.println("El valor de 12654 en decimal es " + octa);
        
        //DECLARACIÓN DE UNA VARIABLE CON TIPO DE DATOS DOUBLE Y ASIGNACIÓN
        
        double grados = 50.6505;//valor decimal o flotante
        System.out.println("Número con decimales o en coma flotante: " + grados);
        
        //CASTING A INT
  
        int parteEntera = (int) grados; //Definimos un entero llamado "parteEntera" y le asignamos la varible "grados" definida como double
        //Obtendremos así la parte entera de los "grados"
        System.out.println("Ejemplo de casting a entero: " + parteEntera);
        
        //otro casting con el operador multiplicación
        
        int porDias = (int) grados * 7; //La variable de "grados" que es de tipo double tendría decimales al *7
        System.out.println("Ejemplo de casting a entero: " + porDias);
        
        float porDiasFloat = (float) grados * (float) 7.0;//El literal double 7.0 
        System.out.println(porDias);
           
        
    }
    
}
