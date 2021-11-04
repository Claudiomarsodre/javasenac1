/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package km.percorrido;

import java.util.Scanner;


public class KmPercorrido {
  
    public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
 double kminicial, kmfinal, kmtotal;
 double litros, consumo;
 
        System.out.println("Digite a kilometragem inicial:");
        kminicial = entrada.nextDouble();
        
        System.out.println("Digite a quilometragem final:");
        kmfinal = entrada.nextDouble();
        
        kmtotal = kmfinal - kminicial;
        
        System.out.println("Voçê percorreu o total de " + kmtotal + "KM");
        
                

       
    }
    
}
