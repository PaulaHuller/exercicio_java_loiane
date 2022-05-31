package exercicio_if_else;

import java.util.Scanner;

public class exercicio_4_ifElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.next();

        // usando o switch
        //switch(letra) {
        //case "a": //precisa fazer para cada um maiusculo também.
        //case "e":
        //case "i":
        //case "o":
        //case "u": System.out.println("vogal"); break;
        //default: System.out.println("consoante");

        if (letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase ("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("Esta letra e uma vogal ");
        } else {
            System.out.println("Esta letra e uma consoante ");
        }
    }
}
