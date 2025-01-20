package curso.luizgustavo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {

        /*> Exercício 2: Validação de Login

        Peça ao usuário para inserir um nome de usuário e uma senha.
        Verifique se o nome de usuário é "admin" e a senha é "1234".
        Se ambos forem corretos, exiba "Acesso permitido".
        Caso contrário, exiba "Acesso negado".*/

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("VALIDAÇÃO DE LOGIN");
        System.out.println("INSIRA O NOME DE USUÁRIO: ");
        String nome = scanner.nextLine();
        System.out.println("INSIRA A SENHA: ");
        String senha = scanner.nextLine();

        if (nome.equals("Admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}
