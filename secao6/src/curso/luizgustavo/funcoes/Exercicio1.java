package curso.luizgustavo.funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        //EXERCICIO 1: RECEBER O VALOR EM CELCIUS E CONVERTER PARA FAHRENHEIT

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ROOT);

        System.out.print("Insira a temperatura em Celsius: ");
        double tempCelsius = input.nextDouble();
        double temperaturaConvertida = conversor(tempCelsius);
        System.out.println("A temperatura convertida é de: " + temperaturaConvertida + "ºF");


        input.close();
    }

    public static double conversor(double celsius) {
        return 1.8 * celsius + 32;
    }
}
