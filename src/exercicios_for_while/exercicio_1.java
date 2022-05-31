package exercicios_for_while;

import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {

            System.out.println("Qual a sua nota: ");

            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) { //expressão booleana
                notaValida = true;
                System.out.println("sua Nota e: " + nota);
            } else {
                System.out.println("O valor digitado esta incorreto, digite novamente:");
            }

        } while (!notaValida);
    }

}


