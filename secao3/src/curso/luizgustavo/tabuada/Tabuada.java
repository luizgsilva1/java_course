package curso.luizgustavo.tabuada;

//CRIAR UM PROGRAMA QUE LEIA O NÚMERO QUE O USUÁRIO INSERIR E MOSTRE SUA TABUADA

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TABUADA");
        System.out.println("INSIRA UM NÚMERO PARA VER SUA TABUADA: ");

        int num = input.nextInt();

        System.out.println("A TABUADA DO NÚMERO " + num + " É:");
        System.out.println(num + " x 1 = " + (num * 1));
        System.out.println(num + " x 2 = " + (num * 2));
        System.out.println(num + " x 3 = " + (num * 3));
        System.out.println(num + " x 4 = " + (num * 4));
        System.out.println(num + " x 5 = " + (num * 5));
        System.out.println(num + " x 6 = " + (num * 6));
        System.out.println(num + " x 7 = " + (num * 7));
        System.out.println(num + " x 8 = " + (num * 8));
        System.out.println(num + " x 9 = " + (num * 9));
        System.out.println(num + " x 10 = " + (num * 10));

        input.close();
    }
}
