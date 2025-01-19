package curso.luizgustavo.typecasting;

public class Casting {
    public static void main(String[] args) {

        //IMPLÍCITO

        byte numeroCurto = 12;

        short numeroMaior = numeroCurto;
        float numeroDecimal = numeroCurto;

        System.out.println(numeroMaior);
        System.out.println(numeroDecimal);

        //EXPLÍCITO

        float numDecimal = 12.5f;

        short numMenor = (short) numDecimal;

        System.out.println(numMenor);

    }
}
