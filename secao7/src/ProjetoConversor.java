import java.util.Locale;
import java.util.Scanner;

public class ProjetoConversor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);

        System.out.println("CONVERSOR DE TEMPERATURAS");
        System.out.println("DIGITE A OPÇÃO DESEJADA");
        System.out.println("CELSIUS PARA FAHREHEIT: 1");
        System.out.println("FAHRENHEIT PARA CELSIUS: 2");
        int opcao = scanner.nextInt();
        System.out.println("INSIRA A TEMPERATURA:");
        double temperatura = scanner.nextDouble();

        if (opcao == 1) {
            System.out.println("Temperatura em Fahrenheit: " + cParaF(temperatura) + "ºF");
        } else if (opcao == 2) {
            System.out.println("Temperatura em Celsius: " + fParaC(temperatura) + "ºC");
        } else {
            System.out.println("Insira uma opção válida");
        }

        scanner.close();
    }

    public static double cParaF(double temp) {
        return 1.8 * temp + 32;
    }

    public static double fParaC(double temp) {
        return (temp - 32) / 1.8;
    }
}
