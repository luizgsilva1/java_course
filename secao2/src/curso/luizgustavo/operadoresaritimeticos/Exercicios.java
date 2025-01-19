package curso.luizgustavo.operadoresaritimeticos;

public class Exercicios {
    public static void main(String[] args) {

        //EXERCICIO 1

        byte num = 10;
        byte dobroNum = (byte) (num * 2);
        System.out.println("O número é: " + num + ". E seu dobro é: " + dobroNum + ".");

        //EXERCICIO 2

        char letra = 'B';
        int conversao = (int) letra;
        System.out.println("O código ASCII da letra " + letra + " é: " + conversao);

        //EXERCICIO 3

        double decimal1 = 15.75d;
        double decimal2 = 20.40d;

        double resDecimal = decimal1 + decimal2;

        System.out.println(resDecimal);

        //EXERCICIO 4

        long numGrande = 2_000_000_000L;
        int numMenor = (int) numGrande;

        System.out.println(numMenor);

        //EXERCICIO 5

        String text1 = "Olá, mundo!";
        String text2 = " Bem vindo ao Java.";

        System.out.println(text1 + text2);

    }
}
