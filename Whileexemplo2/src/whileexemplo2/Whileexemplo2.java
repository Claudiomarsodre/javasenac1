/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileexemplo2;

import java.util.Scanner;

public class Whileexemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int contador1, contador2;
        
        System.out.println("--Contagem de um número até outro--");
        
        System.out.println("O PRIMERIO NUMERO DEVE SER MENOR QUE O SEGUNDO");
        
        System.out.println("Digite o numero inicial");
        contador1= entrada.nextInt();
        
        System.out.println("Digite o numero final");
        contador2 = entrada.nextInt();
        if (contador1 <= contador2 ) {
        while (contador1 <= contador2) {  
            System.out.println("Numero: " + contador1);
            contador1++;
            
            
            
        }
        
    } else
    
    {
        System.out.println("Segundo número menor que o primeiro");
    }
    }
}