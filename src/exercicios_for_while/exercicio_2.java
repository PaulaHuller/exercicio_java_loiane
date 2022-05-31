package exercicios_for_while;

import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;


        do {

            System.out.print("Digite o seu nome: ");
            String nomeUsuario = scan.next();

            System.out.print("Digite sua senha: ");
            String senha = scan.next();


            if (nomeUsuario.equalsIgnoreCase(senha)) {
                System.out.println("A senha digitada nao pode ser igual ao nome, digite uma nova senha: ");
            } else {
                infoValidas = true;
                System.out.println("Voce pode logar esse programa.");
            }
        }while (!infoValidas);
    }
}
