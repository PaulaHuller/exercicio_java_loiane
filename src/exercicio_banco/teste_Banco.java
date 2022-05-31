package exercicio_banco;

public class teste_Banco {

    public static void main(String[] args) {

        System.out.println("*** Teste Conta Bancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumeroConta("11111");

        contaSimples.depositar(100);
        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste Conta Poupanca ***");

        ContaPoupança contaPoupanca = new ContaPoupança();
        contaPoupanca.setNomeCliente("Cliente Conta poupanca");
        contaPoupanca.setNumeroConta("22222");
        contaPoupanca.setDiaRendimento(30);

        contaPoupanca.depositar(100);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo e de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje nao e dia de rendimento");
        }
        System.out.println(contaPoupanca);

        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumeroConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);
        System.out.println(contaEspecial);
        }


        private static void realizarSaque (ContaBancaria conta, double valor){
            if (conta.sacar(valor)) {
                System.out.println("Saque efetuado com sucesso, novo saldo: R$" + conta.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para saque de R$" + valor + "; saldo de R$" + conta.getSaldo());
            }

        }

    }

