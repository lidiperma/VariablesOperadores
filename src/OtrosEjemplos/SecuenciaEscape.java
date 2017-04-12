
package OtrosEjemplos;


public class SecuenciaEscape {

    
    public static void main(String[] args) {
        
        char opcionComilla = '\'';//Al ser un carácter reservado utilizamos \
        System.out.println("Este es un ejemplo\nde \nSecuencias de Escape");
        System.out.println("\tTexto tabulado");
        System.out.println("Esto no se lee \rEs retorno de carro");
        System.out.println("G\b Retroceso"); 
        System.out.println("Esta es la comilla: " + opcionComilla );
        
    }
    
}
