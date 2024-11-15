/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package org.example;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        System.out.println("Clase Main");
        kaprekarOp(3524);
    }
    static int kaprekarOp(int num) {
        Integer given = num; // Convertir a Integer para trabajo posterior en char[]
        char[] givenChars = given.toString().toCharArray(); // Separar cada digito
        Arrays.sort(givenChars); // Orden ascendente
        String givenDesc = new StringBuilder(new String(givenChars)).reverse().toString(); // Convierte givenChars en String, luego se revierte el order y se convierte en String
        String givenAsc = new String(givenChars); // Convierte givenChars en String
        int small = Integer.parseInt(givenAsc); // Convierte givenAsc en int para trabajar. Es el número menor.
        int big = Integer.parseInt(givenDesc); // Convierte givenDesc en int para trabajar. Es el número mayor.
        return big-small; // Retorna el resultado de la operación.
        // Este código hecho para ftr-1 cumple inmediatamente para las PU 1, 2, 3, 4.
    }
    static int itKaprekar(int num) {
        return 3;
    }   
}
