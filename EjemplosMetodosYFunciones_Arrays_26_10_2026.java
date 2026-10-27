/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAYS;

import java.util.Scanner;

public class EjemplosMetodosYFunciones_Arrays_26_10_2026 {

    public static void main(String[] args) {
      /* int a = 5;
       int b = 4;      
       int y = sumar(a, b);
        System.out.println("resultado " + y * 4); // esto es igual a (4+5) * 4 
           
    }
    private static int sumar(int a, int b) { //al poner las variables p y q, estas sustituyen a a y b 
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        int y = a + b;
        return y; // cuando necesite que el resultado venga devuelta
    }*/
      
      
     
       /* System.out.println("Introduce un numero del que quieras saber su tabla de multiplicar");
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        tablaMultiplicar(numero);
           
    }

    private static void tablaMultiplicar(int numero) {
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }*/
       
    /*   Scanner sc = new Scanner (System.in);
        System.out.println("INTRODUCE LA BASE");
        int base = sc.nextInt();
        
        System.out.println("INTRODUCE UN EXPONENTE");
        int exponente = sc.nextInt();
        double metodo = potencia(base, exponente);
        System.out.println("EL RESSULTADO ES: " + resultado);
    }

    private static double potencia(int base, int exponente) {
       
        double resultado = 0 ;
        metodo = resultado
        return resultado;
    }
       */
    
     /*Scanner sc = new Scanner (System.in);
     System.out.println("INTRODUCE UNA LETRA Y EL PROGRAMA COMPROBARA SI ES UNA VOCLA O UNA CONSONANTE");
     char letra = sc.next().charAt(0);
     
     if (esVocal(letra)){
         System.out.println("ES UNA VOCAL");
         
     }else{
         
         System.out.println("NO ES UNA VOCAL, ES UNA CONSONANTE");
     }
     
  }

    private static boolean esVocal(char letra) {
      
        if (letra == 'a' || letra == 'e' ||letra == 'o' || letra == 'i' || letra == 'u'  ){
           
            return true;
            
        }else
            return false;*/
     
     Scanner sc = new Scanner (System.in);
     System.out.println("INTRODUCE UN NUMERO PARA CALCULAR SU FACTORIAL");
     int numero = sc.nextInt();
     
     int resultado = factorial(numero);
     System.out.println("EL RESULTADO DEL FACTORIAL DEL NUMERO ELEGIDO ES: " +resultado);
    }

    private static int factorial(int numero) {
        int resultado = 1;
        for (int i = numero; i>0; i--) {
            resultado = resultado * i;
        }
        return resultado;
    }

    

    
   
}
