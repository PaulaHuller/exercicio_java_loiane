package exercicio_if_else;

import java.util.Scanner;

public class exercicio_2_ifElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para saber se e positivo ou negativo: ");
        double valorPositivoOuNegativo = scan.nextDouble();

        if (valorPositivoOuNegativo > 0 ) {
            System.out.println("O valor digitado e positivo");
        } else {
            System.out.println("O valor digitado e negativo");
        }
    }
}
