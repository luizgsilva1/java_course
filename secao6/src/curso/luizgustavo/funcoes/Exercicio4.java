package curso.luizgustavo.funcoes;

public class Exercicio4 {
    public static void main(String[] args) {

        //VERIFICADOR DE NOTA COM SWITCH CASE

        System.out.println(verificaNota(11));

    }

    public static String verificaNota(int nota) {

        return switch (nota) {
            case 9, 10 -> "Sua nota: A";
            case 7, 8 -> "Sua nota: B";
            case 5, 6 -> "Sua nota: C";
            case 3, 4 -> "Sua nota: D";
            case 0, 1, 2 -> "Sua nota: E";
            default -> "Insira uma nota válida";
        };
    }
}
