
package OtrosEjemplos;


public class Casting {

    
    public static void main(String[] args) {
        
        //Aquí hace falta un casting explícito:
        //short tiene menor rango que int
        int num1 = 100;
        short num2 = (short) num1;       
        /*En este ejemplo, si se sustituye la primera línea int num1=100 
        por int num1=1000000, el código compilaría bien, pero habría pérdida de  
        datos, pues el 1000000 se sale del rango de short, que comprende desde 
        -32768 a 32767. Al mostrar por consola el valor se obtendría un 
        resultado incongruente*/
        
        double num3 = 25.5;
        float num4 = (float) num1;
        float num5 = 17.25;
        /*En este ejemplo se hace un casting explícito en la segunda línea 
        porque float es de menor rango que double. En la tercera línea el 
        compilador avisaría de que hay un error: cuando escribimos directamente
        un número en decimal (como aquí el 17.25), Java lo interpreta siempre 
        como un double; por eso sería necesario un casting explícito 
        para que compilase*/
        
        //Casting entre una variable primitiva char y 
        //una variable primitiva que almacene enteros
        int num6 = 163;
        char letra = (char) num6;
        System.out.println(letra);
        System.out.println((char) 163);
        
    }
    
}
