/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesoperadores;

 import java.util.Arrays;

//Test comparar arrays relación de igualdad aprenderaprogramar.com

public class TestCompararArrays {

    public static void main (String [ ] Args) {

        int [ ] miArray1 = {2, -4, 3, -7};

        for (int i=0; i<miArray1.length; i++) {

            System.out.print ("miArray1[" + i +"]= " + miArray1[i]+"; ");}

        System.out.println ("");   

        int [ ] otroArray = {2, -4, 3, -7};

        for (int i=0; i<otroArray.length; i++) {

            System.out.print ("otroArray[" + i +"]= " + otroArray[i]+"; ");}

        System.out.println ("¿Son el mismo objeto? ... " + (miArray1==otroArray) );

        System.out.println ("¿Tienen el mismo contenido (relación de igualdad)? ... " + Arrays.equals(miArray1, otroArray) );

        otroArray = miArray1;   //otroArray pasa a ser el mismo objeto que miArray1

        for (int i=0; i<otroArray.length; i++) {   System.out.print ("otroArray[" + i +"]= " + otroArray[i]+"; ");  }

        System.out.println ("¿Son el mismo objeto? ... " + (miArray1==otroArray) );

        System.out.println ("¿Tienen el mismo contenido (relación de igualdad)? ... " + Arrays.equals(miArray1, otroArray) );

    } //Cierre del main

} //Cierre de la clase
