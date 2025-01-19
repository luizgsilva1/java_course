package curso.luizgustavo.input;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        byte idade = scanner.nextByte();

        scanner.close();

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");

    }
}
