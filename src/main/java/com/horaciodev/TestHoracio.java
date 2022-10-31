package com.horaciodev;

import java.util.Arrays;

/**
 *
 * @author Lopez19 > Horacio L.
 */
public class TestHoracio {

    //Ejercicio #1: Determinar el orden de numeros en un arreglo
    private String e1ordenNumeros(int[] numeros) {
        boolean desc = true, asc = true;
        
        for (int i = 1; i < numeros.length && (desc || asc); i++) {
            if (numeros[i - 1] < numeros[i]) {
                desc = false;
            }
            if (numeros[i - 1] > numeros[i]) {
                asc = false;
            }
        }
        
        if (asc || desc) {
            if (asc && desc) {
                return "Todos los numeros del arreglo son iguales";
            }
            return asc ? "ASCENDENTE" : "DESCENDENTE";
        }
        
        return "DESORDENADO";
    }

    //Ejercicio #2: Ordenar arreglo de mayor a menor
    private void e2ordenarArrayMayorMenor(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] < numeros[j]) {
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }
    }

    //Ejercicio #3: Numero perfecto: es un número entero positivo que es igual a la suma de sus divisores positivos.
    private String e3numeroPerfecto(int numero) {
        int suma = 0;
        for (int aux = numero - 1; aux > 0; aux--) {
            if (numero % aux == 0) {
                suma += aux;
            }
        }
        return suma == numero ? "ES PERFECTO" : "COMUN";
    }

    //Ejercicio #4: Palindromo
    private String e4palindromo(String text) {
        for (int i = 0, j = text.length() - 1; j >= 0; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) {
                return "No es palindromo";
            }
        }
        return "Es palindromo";
    }
    
    public static void main(String[] args) {

        //Instanciamos la clase Main
        TestHoracio app = new TestHoracio();

//Variables y arreglos de test
//
//        int[] arr = {1, 1, 1, 1, 1};
//        int[] desordenados = {1, 2, 3, 4, 7, 8, 9, -1, -3, 0, 3334, 6, 76767, 4, 45, 4};
//
//----------------------------------------------
//
//Ejercicio #1 ---------------
//
//        System.out.println("Orden del arreglo: " + app.e1ordenNumeros(arr));
//
//Ejercicio #2 ---------------
//
//        System.out.println("Array desordenado: " + Arrays.toString(desordenados));
//        app.e2ordenarArrayMayorMenor(desordenados);
//        System.out.println("Array ordenado: " + Arrays.toString(desordenados));
//
//Ejercicio #3 ---------------
//
//        int numero = 8128;
//        System.out.println("Numero " + numero + ": " + app.e3numeroPerfecto(numero));
//
//Ejercicio #4 ---------------
//
        String text = "amor a roma";
        System.out.println("El texto = " + text + ": " + app.e4palindromo(text));
    }
}
