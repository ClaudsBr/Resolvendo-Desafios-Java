package desafiosuri;

import java.util.Scanner;

public class ParesImparesPositivosNegativos {

    public static void main(String[] args) {
        /* Pares, Impares, Positivos e Negativos
        
        Leia 5 valores Inteiros. A seguir mostre quantos valores digitados 
        foram pares, quantos valores digitados foram ímpares, 
        quantos valores digitados foram positivos e quantos valores digitados 
        foram negativos.
        
        Entrada
        
        O arquivo de entrada contém 5 valores inteiros quaisquer.
        
        Saída
        
        Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, 
         não esquecendo o final de linha após cada uma.
        */
        
        //setup
        Scanner entrada = new Scanner(System.in);
        
        //variaveis
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        
        //entrada e procedimento
        for  (int i= 0; i < 5; i++){
            int num = entrada.nextInt();
            if (num > 0){
                positivo ++;
            } else if (num < 0) {
                negativo++;
            }
            if (num % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        
        //saida
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(positivo+" valor(es) positivo(s)");
        System.out.println(negativo+" valor(es) negativo(s)");
        
        
        //fechamento
        entrada.close();
    }
    
}
