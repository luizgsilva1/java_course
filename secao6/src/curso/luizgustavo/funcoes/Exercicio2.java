package curso.luizgustavo.funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        //EXERCICIO 2: CALCULAR FATORIAL DE UM NUMERO

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.print("Insira um número para calcular o fatorial: ");
        int num = scanner.nextInt();

        System.out.println("O fatorial do número " + num + " é: " + fatorial(num));

        scanner.close();
    }

    public static int fatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }
}
