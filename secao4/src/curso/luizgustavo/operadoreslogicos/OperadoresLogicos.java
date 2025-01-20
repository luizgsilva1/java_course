package curso.luizgustavo.operadoreslogicos;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA AUTO ESCOLA");
        System.out.print("INSIRA SUA IDADE: ");
        byte idade = scanner.nextByte();

        System.out.print("POSSUI CARTEIRA DE MOTORISTA? 1 - SIM / 2 - NÃO: ");
        byte carteira = scanner.nextByte();

        if (carteira != 0 && carteira != 1) {
            System.out.println("ERRO: INSIRA UMA OPÇÃO VÁLIDA PARA CARTEIRA");
        } else if (idade < 18) {
            System.out.println("VOCÊ NÃO PODE TER CARTEIRA DE MOTORISTA");
        } else if (idade >= 18 && carteira == 1) {
            System.out.println("VOCÊ POSSUI CARTEIRA DE MOTORISTA");
        } else {
            System.out.println("VOCÊ NÃO POSSUI CARTEIRA DE MOTORISTA, MAS JA TEM A IDADE SUFICIENTE");
        }


    }
}
