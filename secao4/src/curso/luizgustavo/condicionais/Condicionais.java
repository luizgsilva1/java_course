package curso.luizgustavo.condicionais;

public class Condicionais {
    public static void main(String[] args) {

        //COMPARAÇÃO

        int x = 10;

        System.out.println(x == 10);
        System.out.println(x == 9);
        System.out.println(x != 8);
        System.out.println(x >= 9);

        //COMPARAÇÃO DE STRINGS

        String txt1 = "Java";
        String txt2 = new String("Java");
        String txt3 = "java";

        System.out.println(txt1 == txt2);
        System.out.println(txt1.equals(txt2));
        System.out.println(txt1.equals(txt3));
        System.out.println(txt1.equalsIgnoreCase(txt3));

        // ELSE IF E ELSE IF

        double nota = 7.5;

        if (nota == 10) {
            System.out.println("Parabéns, você atingiu a nota máxima!");
        } else if (nota >= 7) {
            System.out.println("Nota acima da média.");
        } else if (nota == 7) {
            System.out.println("Nota na média.");
        } else {
            System.out.println("Nota abaixo da média.");
        }

    }
}
