/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuariomaiordeidade;

import java.util.Scanner;

public class UsuarioMaiorDeIdade {

    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      
      int idade;
      
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
        
        if (idade>=18)
        { 
            System.out.println("Voçê é maior de idade");
        }
        else {
            System.out.println("Voçê é menor de idade");
           
        }
        
        
        
    }
    
}
