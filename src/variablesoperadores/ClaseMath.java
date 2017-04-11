
package variablesoperadores;


public class ClaseMath {

    
    public static void main(String[] args){
        EntradaDeTeclado entrada = new EntradaDeTeclado();
        String continuar;
        do {
            System.out.println("Introduzca valor de segundos: ");
            entrada.Agregar();
            double segundos = Double.valueOf(entrada.getEntrada());
            double z = (segundos + 1) / 60;
            double minutos = Math.ceil(z);
            int x = (int) (minutos);
            if (segundos < 5400) {
                System.out.println("El minuto es el " + x);

            } else if (segundos == 5400) {
                x = x - 1;
                System.out.println("El minuto es el " + x);

            } else {
                System.out.println("Segundo no es valido ya supera el rango. ");
            }
            System.out.println("¿Otro valor (s/n)? ");
            entrada.Agregar();
            continuar = entrada.getEntrada();
        } while (continuar.equalsIgnoreCase("s"));
    }
    
}
