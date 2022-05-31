package primeira_listaDeExercicio;

import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("Terceira nota: ");
        double nota3 = scan.nextDouble();
        System.out.print("Quarta nota: ");
        double nota4 = scan.nextDouble();

        double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("A media do aluno é: " + resultado );

    }
}
