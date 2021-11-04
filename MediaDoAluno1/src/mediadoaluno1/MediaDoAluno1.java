/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediadoaluno1;

import java.util.Scanner;

public class MediaDoAluno1 {

    public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
 String aluno;
 double n1, n2, n3, media;
 
        System.out.println("Informe seu nome:");
       aluno = entrada.nextLine();
       
        System.out.println("Digite sua primeira nota:");
        n1 = entrada.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        n2 = entrada.nextDouble();
        
        System.out.println("Digite sua terçeira nota:");
        n3 = entrada.nextDouble();
        
        media = (n1 + n2 + n3) / 3;
        
        System.out.println("A média do aluno " + aluno + " é " + media );
              
 
    }
    
}
