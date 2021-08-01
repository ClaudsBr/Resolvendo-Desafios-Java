package desafiosuriemjava;

import java.util.Scanner;

public class AbaixoDaDiagonalPrincipal {

    public static void main(String[] args) {
        /*
        Leia um caractere maiúsculo, que indica uma operação que deve ser 
        realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma 
        ou a média considerando somente aqueles elementos que estão abaixo da 
        diagonal principal da matriz.
        
        Entrada

        A primeira linha de entrada contem um único caractere Maiúsculo O 
        ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser 
        realizada com os elementos da matriz. Seguem os 144 valores de ponto 
        flutuante que compõem a matriz.

        Saída

        Imprima o resultado solicitado (a soma ou média), com 1 casa após o 
        ponto decimal.

        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        // Variaveis
        char O;
        float M[][] = new float[12][12];
        float soma, contador;
        
        //Entrada e Processamento
        O = entrada.nextLine().charAt(0);
        
        for(int l = 0; l < 12; l++){
            for(int c = 0;c < 12; c++){                
                M[l][c] = entrada.nextFloat();
            }
        }
        
        soma = 0;
        contador =0;
        for (int l = 0; l< 12;l++){ // Pegando elementos abaixo da diagonal principal
            for(int c = 0;c < 12;c++){
                if(l>c){
                    soma+=M[l][c];
                    contador++;
                }
            }
        }
        
        //Saida
        if(O == 'S'){
            System.out.printf("Soma: %.1f\n",soma);
        } else if (O == 'M'){
            System.out.printf("Média: %1.f \n",soma/contador);
        }
        
        
        //Encerramento
        entrada.close();
    }
    
}
