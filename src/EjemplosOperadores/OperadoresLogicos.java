
package EjemplosOperadores;


public class OperadoresLogicos {

    
    public static void main(String[] args) {
        
        boolean a = true;  
        boolean b = false;
        
        // & sirve para evaluar dos expresiones de modo que si ambas son
        //ciertas, el resultado será true sino el resultado será false
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
        
        
        //USO DEL OPERADOR "!" (NO) 
        boolean mayorDeEdad, menorDeEdad;
        int edad = 21;
        
        System.out.println("¿Eres mayor de edad?: " + (mayorDeEdad = edad>= 18));
        System.out.println("¿Eres menor de edad?: " + (menorDeEdad = !mayorDeEdad));
        
        //USO DEL OPERADOR "&&" (Y)
        boolean carnetDeConducir = true;
        int edadConductor = 19;
        boolean puedeConducir = (edadConductor >= 18) && carnetDeConducir;
        
        System.out.println("¿Puedes conducir?: " + puedeConducir);
        
        //USO DEL OPERADOR "||" (O)
        boolean nieva = true;
        boolean llueve = false;
        boolean graniza = false;
        boolean malTiempo = nieva || llueve || graniza;
        
        System.out.println("¿Hace mal tiempo?: " + malTiempo);
        
        
        
        
        
        
        
        
    }
    
}
