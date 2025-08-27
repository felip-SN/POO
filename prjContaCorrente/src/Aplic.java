
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        int numeroConta;
        double saldoConta;
        ContaCorrente objConta;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero da sua conta: ");
        numeroConta = scan.nextInt();

        System.out.print("Digite o saldo da sua conta: ");
        saldoConta = scan.nextDouble();

        objConta = new ContaCorrente(numeroConta, saldoConta);

        do {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opção: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\n\t\tNumero: " + objConta.getNumero());

                    System.out.print("\n\t\tDigite o valor que quer depositar: ");
                    objConta.depositar(scan.nextDouble());
                    break;
                case 2:
                    double valor;

                    System.out.print("\n\t\tNumero: " + objConta.getNumero());
                    System.out.print("\n\t\tSaldo anterior: " + objConta.getSaldo());

                    System.out.print("\n\t\tDigite o valor que quer sacar: ");
                    valor = scan.nextDouble();

                    if (objConta.getSaldo() < valor) {
                        System.out.println("\n\t\tSaldo insuficiente!");
                    } else {
                        objConta.sacar(valor);
                    }
                    break;
                case 3:
                    System.out.print("\n\t\tNumero: " + objConta.getNumero());
                    System.out.print("\n\t\tSaldo atual: " + objConta.getSaldo());
                    break;
                case 4:
                    break;
            }
        } while (opcao != 4);
    }

}
