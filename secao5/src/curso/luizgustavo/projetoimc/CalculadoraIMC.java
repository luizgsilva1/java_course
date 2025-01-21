package curso.luizgustavo.projetoimc;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("CALCULADORA DE IMC");
        System.out.print("INSIRA SEU PESO EM KG: ");
        double peso = scanner.nextDouble();
        System.out.print("INSIRA SUA ALTURA EM METROS: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

    System.out.printf("O seu IMC é: %.2f" + ". Sua classificação é: " + classificacao + ".", imc);
    }
}
