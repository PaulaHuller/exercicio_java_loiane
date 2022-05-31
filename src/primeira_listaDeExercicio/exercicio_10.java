package primeira_listaDeExercicio;

import java.util.Scanner;

public class exercicio_10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a temperatura em Celsius que voce deseja transformar: ");
        double temperaturaParaConverter = scan.nextDouble();
        double temperaturaConvertida = (temperaturaParaConverter * 1.8) + 32;
        System.out.println("A temperatura em Farenheit e " + temperaturaConvertida + "F");
    }


}
