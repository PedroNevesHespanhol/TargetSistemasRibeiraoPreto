package exercicios.target;

/*
 * 5) Escreva um programa que inverta os caracteres de um string.
 * 
 *  IMPORTANTE:
 *   a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 *   b) Evite usar funções prontas, como, por exemplo, reverse;
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");

        String string = leitorScanner.nextLine();
        leitorScanner.close();

        String stringInvertida = "";

        for(int i = string.length() - 1; i >= 0; i--){
            stringInvertida += string.charAt(i);
        }

        System.out.println("A string invertida é: " + stringInvertida);
    }
}
