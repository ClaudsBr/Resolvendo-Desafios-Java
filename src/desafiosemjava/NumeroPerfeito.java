package desafiosemjava;

import java.util.Scanner;

public class NumeroPerfeito {

    public static void main(String[] args) {
        /* Numeros Perfeitos
        
        Na matemática, um número perfeito é um número inteiro para o qual a soma
        de todos os seus divisores positivos próprios (excluindo ele mesmo) é 
        igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 
        é igual a 6. Sua tarefa é escrever um programa que imprima se um 
        determinado número é perfeito ou não.

        Entrada

        A entrada contém vários casos de teste. A primeira linha da entrada 
        contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste 
        da entrada. Cada uma das N linhas seguintes contém um valor inteiro X 
        (1 ≤ X ≤ 10^8), que pode ser ou não, um número perfeito.
                
       Saída

        Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” 
        ou “X nao eh perfeito”, de acordo com a especificação fornecida.

        */
        
        //Setup
        Scanner entrada = new Scanner(System.in);
        
        //variaveis
        int N, X, somaDivisores;
        
        // Entrada e Procedimentos
        N = entrada.nextInt();
        for (int i=1; i <= N;i++){
            X = entrada.nextInt();
            somaDivisores=0;
            for (int divisor = 1; divisor < X; divisor++){
                if (X % divisor == 0){
                    somaDivisores = somaDivisores + divisor;
                }
            }      
        
            if (somaDivisores == X){
                System.out.println("numero perfeito");
            }else{
                System.out.println("não é perfeito");
            }
        }
        
        //fechamento
        entrada.close();
        
    }
    
}
