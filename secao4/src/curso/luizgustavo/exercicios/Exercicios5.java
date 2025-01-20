package curso.luizgustavo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios5 {
    public static void main(String[] args) {

        /*
        > Exercício 5: Verificação de Intervalo com AND
        Peça ao usuário para inserir um número.
        Verifique se o número está no intervalo de 10 a 20, inclusive.
        Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".*/

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("VERIFICAÇÃO DE INTERVALO");
        System.out.println("INSIRA UM NÚMERO INTEIRO ALEATÓRIO");

        int num = scanner.nextInt();

        if (num >= 10 && num <= 20) {
            System.out.println("DENTRO DO INTERVALO");
        } else {
            System.out.println("FORA DO INTERVALO");
        }

        scanner.close();
    }
}
