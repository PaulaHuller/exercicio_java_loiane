package exercicio_if_else;

import java.util.Scanner;

public class exercicio_1_ifElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite outro numero: ");
        double numero2 = scan.nextDouble();

        if (numero1 > numero2 ) {
            System.out.println("O primeiro numero e maior " + numero1);
        }else {
        System.out.println("O segundo numero e maior " + numero2);
        }

    }
}
