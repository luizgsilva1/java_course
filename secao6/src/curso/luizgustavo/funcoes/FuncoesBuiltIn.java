package curso.luizgustavo.funcoes;

public class FuncoesBuiltIn {
    public static void main(String[] args) {
        //STRING

        String frase = "Estou aprendendo java!";

        System.out.println(frase.length());
        System.out.println(frase.substring(17, 21));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toUpperCase().substring(17,22).length());

        //MATH

        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-10));

    }
}
