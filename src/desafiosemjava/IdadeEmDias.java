/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiosemjava;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class IdadeEmDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias = entrada.nextInt();        
        int mes = 0;
        int ano = 0;
        
        
        do{
            dias -=365;
            ano++;
            
        } while(dias >= 365);
        
        do {
            dias -=30;
            mes++;
            
        }while(dias >=30);
        
        System.out.println("Ano(s) = "+ano+"\nMes(es) = "+mes+ "\nDia(s) = "+dias);
    }
    
}
