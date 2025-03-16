package curso.luizgustavo.funcoes;

public class Exercicio5 {
    public static void main(String[] args) {

        //FUNCAO COM SYSTEM.EXIT PARA VERIFICAR IDADE

        verificaIdade(12);

        System.out.println("Bem vindo ao Software");

    }

    public static void verificaIdade(int idade) {
        if (idade < 18) {
            System.out.println("Acesso negado: idade insuficiente");
            System.exit(0);
        } else {
            System.out.println("Acesso liberado");
        }

    }
}
