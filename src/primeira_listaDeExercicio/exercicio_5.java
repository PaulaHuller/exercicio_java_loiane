package primeira_listaDeExercicio;

import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos metros voce quer converter para centimetros: ");
        double metro = scan.nextDouble();
        double resultado = metro * 100;
        System.out.println("A sua conversao e de: " + resultado + "cm");
    }
}
