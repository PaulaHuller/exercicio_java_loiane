package primeira_listaDeExercicio;

import java.util.Scanner;

public class exercicio_9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a temperatura em Farenheit que voce deseja transformar para Celsius: ");
        double temperaturaParaConverter = scan.nextDouble();
        double temperaturaConvertida = (5 * (temperaturaParaConverter - 32)/9 );
        System.out.println("A temperatura em Celsius e " + temperaturaConvertida + "C");

    }
}
