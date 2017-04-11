
package EjemplosOperadores;

public class VariablesOperadores {

    
    public static void main(String[] args) {
        // Variables

    char a = 'a';
    char b = 'b';
    double x = 3.2d;
    float y = 4.8f;
    int auxiliar = 30;
    long numeroCuentas = 10000000000L;
    boolean verdadero = true;       

    // Constantes

    final double NUMERO_PI = Math.PI; // 3.14
    final int CERO = 0;


    // Operadores

    System.out.println("Resultado de x+y: "+(x + y));
    System.out.println("Resultado de x-y: "+(x - y));
    System.out.println("Resultado de x*y: "+(x * y));
    System.out.println("Resultado de x/y: "+(x / y));
    System.out.println("Resultado de x+y: "+(x % y));

    System.out.println(); 

    System.out.println(numeroCuentas += 1);
    System.out.println(numeroCuentas++);
    System.out.println(++numeroCuentas);

    System.out.println();

    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x == y);
    System.out.println(x != y);
  
  }

}