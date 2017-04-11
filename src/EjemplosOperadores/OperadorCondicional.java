
package EjemplosOperadores;

public class OperadorCondicional {
    
    public static void main(String[] args) {
        
    int prioridadEdad = 40;
    String pref = (prioridadEdad < 30) ? "jovencito"
                    : "madurito";
    System.out.println("Prefiero un " + pref);

    }
    
}
