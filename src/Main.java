
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<Conta>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = teclado.nextLine();
        Cliente  cliente = new Cliente();
        cliente.setNome(nome);

        Conta contac = new ContaCorrente(cliente);
        Conta contap = new ContaPoupanca(cliente);
        contas.add(contac);
        contas.add(contap);

        System.out.println("Digite o valor para deposito na Conta Corrente: ");
        Double valorDeposito = teclado.nextDouble();

        System.out.println("Digite o valor para transferir para Conta Poupança: ");
        Double valorTransfer = teclado.nextDouble();

        System.out.println("Digite o valor para sacar da Conta Corrente: ");
        Double valorSaque = teclado.nextDouble();


        contac.depositar(valorDeposito);
        contac.transferir(valorTransfer, contap);
        contac.sacar(valorSaque);

        contac.imprimirExtrato();
        contap.imprimirExtrato();

        System.out.println("Lista de clientes: ");
            for (Conta conta : contas) {
                System.out.println("Agência: " + conta.getAgencia() + " -----   Nome do cliente: " + nome);
            }
    }
}

