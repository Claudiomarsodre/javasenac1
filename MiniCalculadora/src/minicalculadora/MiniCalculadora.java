/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minicalculadora;

import java.util.Scanner;

public class MiniCalculadora {
 
    public static void main(String[] args) {
       //Declarando as váriaveis
       double n1, n2;
       double soma, subt, multi,divi;
       
       //Biblioteca que ira permitir a interação do úsuario
       Scanner entrada = new Scanner(System.in);
       //solicitar ao usuario os dois numeros
        System.out.println("--Mini Calculadora--");
        System.out.println("Digite um número:");
        n1 = entrada.nextDouble();
        System.out.println("Digite outro número:");
         n2 = entrada.nextDouble();
         
         //espercificar o que cada variavel faz
         soma = n1 + n2;
         subt= n1 - n2;
         multi= n1 * n2;
         divi= n1 / n2;
         
         // imprimir (mostrar) na tela os resultados
         System.out.println("A soma dos numeros " + n1 + " e " + n2 + " é: " + soma);
         System.out.println("A subtração dos números " + n1 + " e " + n2 + " é: " + subt);
         System.out.println("A multiplicação dos números "+ n1 + " e " + n2 + " é: " +multi);
         System.out.println("A divisão dos números" + n1 + " e " + n2 + " é: " +divi);
         
         
         
                
        
       
    }
    
}
