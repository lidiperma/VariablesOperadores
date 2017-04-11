
package OtrosEjemplos;


public class ClaseMath {

    
    public static void main(String[] args){
        
         //APROXIMACIÓN DE UN NÚMERO: métodos round y floor
        double x = 72.8543;
        double y = 0.3498;
        
        System.out.println("APROXIMACIÓN DE UN NÚMERO DECIMAL: ");
        
        System.out.println("Con round "+ x + " es aprox. " + Math.round(x));
        System.out.println("Con round "+ y + " es aprox. " + Math.round(y));
        
        System.out.println("Con floor "+ x + " es aprox. " + Math.floor(x));
        System.out.println("Con floor "+ y + " es aprox. " + Math.floor(y));
        
         
         //HAYA EL MAYOR Y MENOR DE DOS NÚMEROS: métodos min y max
        int i = 7;
        int j = -9;
        
        System.out.println("EL MAYOR Y MENOR DE DOS NÚMEROS: ");
        // para hallar el mayor de dos número
        System.out.println("max(" + i + "," + j + ") es " + Math.max(i,j));
        // Para hallar el menor de dos números
        System.out.println("min(" + x + "," + y + ") es " + Math.min(x,y));
        
        //GENERAR NÚMEROS ALEATORIOS: método random
        System.out.println("GENERAMOS NÚMEROS ALEATORIOS: ");
        System.out.println("Número aleatorio: " + Math.random());
        System.out.println("Otro número aleatorio: " + Math.random());
        
        
        
        
    }
    
}
