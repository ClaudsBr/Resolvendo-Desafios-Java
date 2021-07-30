package desafiosemjava;

import java.util.Scanner;


public class IdadeEmDias {

    
    public static void main(String[] args) {
        
        /*
        
        Leia um valor inteiro correspondente à idade de uma pessoa em dias e 
        informe-a em anos, meses e dias.
        Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias 
        e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação 
        que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas 
        um exercício com objetivo de testar raciocínio matemático simples.
        
        Entrada
        O arquivo de entrada contém um valor inteiro.
        
        Saída
        Imprima a saída conforme exemplo fornecido.
        
        */
        
        //setup
        Scanner entrada = new Scanner(System.in);
        int dias;      
        int mes = 0;
        int ano = 0;
        
        // entrada
        dias = entrada.nextInt();
        
        //preocessamento
        do{
            dias -=365;
            ano++;
            
        } while(dias >= 365);
        
        do {
            dias -=30;
            mes++;
            
        }while(dias >=30);
        
        //saida
        System.out.println(ano+" ano(s)");
        System.out.println(mes+" mes(es)");
        System.out.println(dias+" dia(s)");
        
        //fechamento
        entrada.close();
    }
    
}
