package primeira_listaDeExercicio;

import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = scan.nextDouble();
        System.out.println("A soma dos numeros é: " + (numero1 + numero2));
    }
}
