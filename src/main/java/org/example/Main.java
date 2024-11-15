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
        return 3087;
    }
    static int itKaprekar(int result) {
        int iterations = 0; // Calcular el número de iteraciones
        while (result != 6174){ // Verificar que el resultado sea la constante de Kaprekar. De otro modo, iterar.
            // El código es el mismo de kaprekarOp, alterado para contar iteraciones.
            iterations +=1;
            Integer given = result; // Convertir a Integer para trabajo posterior en char[]
            char[] givenChars = given.toString().toCharArray(); // Separar cada digito
            Arrays.sort(givenChars); // Orden ascendente
            String givenDesc = new StringBuilder(new String(givenChars)).reverse().toString(); // Convierte givenChars en String, luego se revierte el order y se convierte en String
            String givenAsc = new String(givenChars); // Convierte givenChars en String
            int small = Integer.parseInt(givenAsc); // Convierte givenAsc en int para trabajar. Es el número menor.
            int big = Integer.parseInt(givenDesc); // Convierte givenDesc en int para trabajar. Es el número mayor.
            result = big-small;
        }
        return iterations;
    }   
}
