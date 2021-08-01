/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiosuri;

import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class TesteDeSeleção {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Teste de Seleção        

        Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C 
        e se D for maior do que A, e a soma de C com D for maior que a soma de 
        A e B e se C e D, ambos, forem positivos e se a variável A for par 
        escrever a mensagem "Valores aceitos", senão escrever "Valores nao 
        aceitos".
        
        Entrada

        Quatro números inteiros A, B, C e D.
        
        Saída

        Mostre a respectiva mensagem após a validação dos valores.

        */
        
        //setup
        Scanner entrada = new Scanner(System.in);
        
        //variaveis
        int A, B, C, D;
        
        // entrada
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        
        // procedimento e saida
        
        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }       
        
        // fechamento
        entrada.close();
    }
    
}
