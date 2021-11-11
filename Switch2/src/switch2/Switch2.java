/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch2;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);     
            
       int time;
       
        System.out.println("--Times-- ");
        System.out.println("1 - Internacional");
        System.out.println("2 - Grêmio");
        System.out.println("Digite o número do seu time e veja qual é o ídolo do clube: ");
        
        time= entrada.nextInt();
        
        switch (time) {
           
            case 1:
                System.out.println("Fernandão");
                break;
            case 2 :
                System.out.println("Renato gaucho");
                break;
            default:
                System.out.println("Número inválido");
        }
        
          
                
        
        
        
        
        
        
       
       
       
    
       
        
    }
    
}
