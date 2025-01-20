package curso.luizgustavo.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {

        /*> Exercício 4: Identificação de Dia Útil
        Peça ao usuário para inserir um número de 1 a 7,
        representando os dias da semana (1 para domingo, 2 para segunda, etc.).
        Use switch para verificar se o dia é um dia útil (segunda a sexta)
        ou final de semana (sábado e domingo).
        Exiba uma mensagem correspondente.*/

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("IDENTIFICADOR DE DIA ÚTIL");
        System.out.println("INSIRA UM NÚMERO DE 1 (DOMINGO) A 7 (SÁBADO):");

        int num = scanner.nextInt();

        switch (num) {
            case 1, 7:
                System.out.println("DIA NÃO ÚTIL");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("DIA ÚTIL");
                break;
            default:
                System.out.println("VALOR INVÁLIDO");
                break;
        }

        scanner.close();
    }
}
