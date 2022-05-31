package primeira_listaDeExercicio;

import java.util.Scanner;

public class exercicio_8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto voce recebe por hora trabalhada: ");
        double valorHora = scan.nextDouble();
        System.out.print("Quantas horas voce trabalha por dia: ");
        double horasPorDia = scan.nextDouble();
        System.out.print("Quantos dias voce trabalha no mes: ");
        int diasTrabalhados = scan.nextInt();

        double salario = valorHora * horasPorDia * diasTrabalhados;

        System.out.println("O seu salario e de " + salario + " reais");



    }
}
