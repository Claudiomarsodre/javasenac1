/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhileteste;

import java.util.Scanner;

public class DoWhileTeste {

    public static void main(String[] args) {
      boolean continuar= true;
      int opcao;
      Scanner entrada =new Scanner (System.in);
      do
      {
          System.out.println("\t\tMenu de opções do curso Tecnico em informatica :");
          System.out.println("\t1. Ver o menu");
          System.out.println("\t2. Ler o menu");
          System.out.println("\t3. Repetir o menu");
          System.out.println("\t4 Tudo de novo");
          System.out.println("\t5. Não li, pode repetir?");
          System.out.println("\t0. Sair");
          
          System.out.println("Insira sua opção: ");
          opcao = entrada.nextInt();
          
          if (opcao ==0) {
              continuar = false ;
              System.out.println("Programa finalizado.");
          }
          else { 
              System.out.println("\n\n\n\n\n\n\n\n");
              
          }
              
          }  while ( continuar ) ;
      
    }

}
