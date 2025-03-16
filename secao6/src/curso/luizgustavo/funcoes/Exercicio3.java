package curso.luizgustavo.funcoes;

public class Exercicio3 {
    public static void main(String[] args) {

        //VERIFICADOR DE PARIDADE

        System.out.println(verificaPar(542362));

    }

    public static String verificaPar(int num) {
        if (num % 2 == 0) {
            return "O número " + num + " é par.";
        } else {
            return "O número " + num + " é ímpar.";
        }
    }
}
