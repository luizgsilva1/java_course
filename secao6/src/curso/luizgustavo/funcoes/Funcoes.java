package curso.luizgustavo.funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {

        saudacao();
        saudacao();
        pergunta();

        //PARAMENTROS

        soma(4, 2);

        //RETURN

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("Insira um número inteiro: ");
        int verifica = scanner.nextInt();

        System.out.println(verificaPar(verifica));

        scanner.close();
    }

    public static void saudacao() {
        System.out.println("Olá, esta é minha primeira função!");
    }

    public static void pergunta() {
        System.out.println("Como foi seu dia?");
    }

    public static void soma(int a, int b) {
        int res = a + b;
        System.out.println("O resultado da função é:" + res);
    }

    public static String verificaPar(int numeroVer) {
        if (numeroVer % 2 == 0) {
            return "O número " + numeroVer + " é par.";
        } else {
            return "O número " + numeroVer + " é ímpar.";
        }
    }
}
