package curso.loops;

public class Loops {
    public static void main(String[] args) {
        //LOOPS

        for (int i = 5; i >= 0; i--) {
            System.out.println("Contagem " + i);
        }

        String palavra = "Ellen";

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println((i + 1) + "º Letra: " + palavra.charAt(i));
        }
    }
}
