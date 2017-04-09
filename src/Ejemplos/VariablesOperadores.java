
package Ejemplos;

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
    String perro = "perro";
    String gato = "gato";    

    // Constantes

    final double NUMERO_PI = Math.PI; // 3.14
    final int CERO = 0;

    // Arrays o Vectores

    String[] paises = {"España", "Italia", "Portugal"};
    String[] animales = new String[] {"perro", "vaca", "gato", "mono"};
    String[] objetos = new String[3]; 

    // Operadores

    objetos[0] = "pelota";
    objetos[1] = "caja";
    objetos[2] = "zapato";

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

    System.out.println();

    System.out.println(String.valueOf(b) + String.valueOf(a));
    System.out.println("El " + perro + " persigue al " + gato);
    System.out.println("El " + animales[0] + " persigue al " + animales[2]);
    System.out.println("perro".equals(animales[0]));
    System.out.println(paises[1].replace('a', '9'));
    System.out.println(paises[1].substring(CERO, 5));
    System.out.println(paises[1]);    
  }

}