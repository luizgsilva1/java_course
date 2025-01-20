package curso.luizgustavo.switchcase;

public class SwitchCase {
    public static void main(String[] args) {

        //VALIDAÇÃO DE DIA DA SEMANA 1 == SEGUNDA, 7 == DOMINGO

        byte dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Dia: Segunda-feira.");
                break;
            case 2:
                System.out.println("Dia: Terça-feira.");
                break;
            case 3:
                System.out.println("Dia: Quarta-feira.");
                break;
            case 4:
                System.out.println("Dia: Quinta-feira.");
                break;
            case 5:
                System.out.println("Dia: Sexta-feira.");
                break;
            case 6:
                System.out.println("Dia: Sábado.");
                break;
            case 7:
                System.out.println("Dia: Domingo.");
                break;
            default:
                System.out.println("Dia não encontrado.");
                break;
        }

    }
}
