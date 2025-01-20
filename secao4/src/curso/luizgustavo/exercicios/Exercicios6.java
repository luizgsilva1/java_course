package curso.luizgustavo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {

        /*
        > Exercício 6: Classificação de Letra
        Peça ao usuário para inserir uma letra.
        Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. Exiba "Vogal" ou "Consoante" de acordo com a entrada.
        Considere tanto letras maiúsculas quanto minúsculas.*/

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("VERIFICADOR DE VOGAL E CONSOANTE");
        System.out.println("INSIRA UMA LETRA: ");

        String letra = scanner.nextLine().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }
        scanner.close();
    }
}
