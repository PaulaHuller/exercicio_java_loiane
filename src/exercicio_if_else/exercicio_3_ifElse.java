package exercicio_if_else;

import java.util.Scanner;

public class exercicio_3_ifElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o seu sexo (Digite apenas F ou M): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("Voce e uma garotinha princesa ");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("Voce e do sexo masculino ");
        } else {
            System.out.println("Sexo invalido ");
        }
    }
}
