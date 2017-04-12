
package EjemplosOperadores;


public class OperadoresAsignacion {

   
    public static void main(String[] args) {
        
        int x = 5, y = 5;
        int z;
        
        
        //OPERADOR INCREMENTO
        System.out.println("z = " + (z=x++));// z vale 5, x vale 6 >>>> z=x ; (x=x+1)
        System.out.println("z = " + (z=++y));// z vale 6, y vale 6 >>>> (y=y+1) ; z=y
        
        //OPERADOR DECREMENTO
        //System.out.println("z = " + (z=x--));// z vale 5, x vale 4 >>>>> z=y ; (y=y-1)
        //System.out.println("z = " + (z=--y));// z vale 4, y vale 4 >>>>> (y=y-1) ; z=y
        
        
        
    }
    
}
