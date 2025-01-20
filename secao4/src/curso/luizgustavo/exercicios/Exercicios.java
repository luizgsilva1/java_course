package curso.luizgustavo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {


        /*> Exercício 1: Verificação de Categoria de Preço
        Peça ao usuário para inserir o preço de um produto.
        Se o preço for menor que 50, categorize-o como "Barato".
        Se estiver entre 50 e 100, categorize como "Médio".
        Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.*/

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("VERIFICAÇÃO DE CATEGORIA DE PREÇO");
        System.out.print("INSIRA O PREÇO DO PRODUTO: ");

        double preco = scanner.nextDouble();

        if (preco < 50.0) {
            System.out.println("CATEGORIA: Barato");
        } else if (preco >= 50.0 && preco < 100.0) {
            System.out.println("CATEGORIA: Médio");
        } else {
            System.out.println("CATEGORIA: Caro");
        }

        scanner.close();
    }
}
