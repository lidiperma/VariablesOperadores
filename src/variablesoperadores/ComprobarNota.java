
package variablesoperadores;


public class ComprobarNota {
    
     public static void main(String[] args) {
        int[] calificacion = new int[2];
        String[] alumno = new String[2];
        String[] notaPalabra = new String[2];
        EntradaDeTeclado entrada = new EntradaDeTeclado();
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Agregar nombre del alumno: ");
            entrada.Agregar();
            alumno[i] = entrada.getEntrada();

        }

        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("Agregar calificacion del 0 al 10: ");
            int agregar = Integer.parseInt(entrada.Agregar());
            if (agregar > 10) {
                System.out.println("Calificacion debe entar entre 0 y 10 vuelve a cargar");
                agregar = Integer.parseInt(entrada.Agregar());
            } else {
                calificacion[i] = Integer.parseInt(entrada.getEntrada());

            }

            if (calificacion[i] <= 4.99) {
                notaPalabra[i] = "Suspenso";
            } else if ((calificacion[i] > 4.99) && (calificacion[i] <= 6.99)) {
                notaPalabra[i] = "Bien";
            } else if ((calificacion[i] > 6.99) && (calificacion[i] <= 8.99)) {
                notaPalabra[i] = "Notable";
            } else {
                notaPalabra[i] = "Sobresaliente";
            }
        }

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("NOMBRE: " + alumno[i]);
            System.out.println("CALIFICACION: " + calificacion[i]);
            System.out.println("NOTA: " + notaPalabra[i]);
            System.out.println("\n");
        }

    }
    
}
