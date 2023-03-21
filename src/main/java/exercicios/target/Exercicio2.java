package exercicios.target;

/*
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será 
 * a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um 
 * programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci 
 * e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        int n = 30; // número de elementos da sequência Fibonacci
        Integer[] fib = new Integer[n];

        List<Integer> lista = Arrays.asList(fib);

        fib[0] = 0; // primeiro elemento da sequência
        fib[1] = 1; // segundo elemento da sequência

        for (int i = 2; i < n; i++) {
            // o próximo número é a soma dos dois anteriores
            fib[i] = fib[i-1] + fib[i-2];
        }

        // caso queira imprimir o array para verificar a sequência
        // for (int i = 0; i < n; i++) {
        //     System.out.print(fib[i] + " ");
        // }
        
        System.out.println("Digite um número para verificar se o mesmo pertence a sequência Fibonacci: ");
        Scanner leitorScanner = new Scanner(System.in);
        int num = leitorScanner.nextInt();
        leitorScanner.close();
        
        if(lista.contains(num) == true){
            System.out.println("O número " + num + " pertence a sequência Fibonacci!");
        }else{
            System.out.println("O número " + num + " não pertence a sequência Fibonacci!");
        }
    }
}
