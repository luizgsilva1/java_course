package curso.luizgustavo.variaveis;

public class Variaveis {
    public static void main(String[] args) {

        String nome = "Luiz Gustavo";
        System.out.println(nome);

        // STRINGS

        String firstName = "Luiz";
        String lastName = "Gustavo";

        System.out.println("Meu nome é: " + firstName + " " + lastName);

        //CHAR

        char letra = 'A';
        char simbol = '^';

        System.out.println(letra);
        System.out.println(simbol);

        //INT

        int num1 = 35;
        int num2 = 5;

        System.out.println(num1 + num2);

        //LONG

        long numGrande = 234_978_548_120L;

        System.out.println(numGrande);

        //DOUBLE

        double preco = 19.99D;

        System.out.println("Preço do produto: R$" + preco);

        //CONSTANTES

        final short DIAS_DA_SEMANA = 7;

        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);
    }
}
