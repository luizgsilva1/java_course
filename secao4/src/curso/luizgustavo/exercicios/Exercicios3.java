package curso.luizgustavo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {

        /*> Exercício 3: Identificação de Paridade com Strings
        Peça ao usuário para inserir um número.
        Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar".
        Use uma string para armazenar o resultado e exibi-la.*/

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("INSIRA UM NÚMERO INTEIRO QUALQUER");
        int num = scanner.nextInt();

        String res;

        if (num % 2 == 0) {
            res = "par";
        } else {
            res = "ímpar";
        }

        System.out.println("O número inserido é: " + res);

        scanner.close();
    }
}
