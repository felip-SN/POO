
import fatec.poo.model.PedidoCompra;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author felip
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#,##0.00");

        Scanner scan = new Scanner(System.in);
        int escolha = 0;

        PessoaFisica penFis = new PessoaFisica("45370703825", "Felipe", 2025);
        PessoaJuridica penJur = new PessoaJuridica("123456", "Breno", 2025);

        penFis.setBase(15);
        penJur.setTaxaIncentivo(10);

        ArrayList<PedidoCompra> comprasPF = new ArrayList<PedidoCompra>();
        ArrayList<PedidoCompra> comprasPJ = new ArrayList<PedidoCompra>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite 1 - Pessoa Fisica \nDigite 2 - Pesso Juridica");
            System.out.print("\n\t\tDigite: ");
            escolha = scan.nextInt();

            System.out.print("\nDigite o valor do " + i + "º pedido: ");
            double valor = scan.nextDouble();

            PedidoCompra pedido = new PedidoCompra(i);

            if (escolha == 1) {
                penFis.addCompras(valor);
                comprasPF.add(pedido);
            } else {
                penJur.addCompras(valor);
                comprasPJ.add(pedido);
            }
        }

        System.out.println("\nPessoa Física:");
        System.out.println("CPF: " + penFis.getCpf());
        System.out.println("Nome: " + penFis.getNome());
        System.out.println("Total Compras: R$ " + df.format(penFis.getTotalCompras()));
        System.out.println("Bônus: R$ " + df.format(penFis.calcBonus()));

        System.out.println("\nPessoa Juridica:");
        System.out.println("CGC: " + penJur.getCgc());
        System.out.println("Nome: " + penJur.getNome());
        System.out.println("Total Compras: R$ " + df.format(penJur.getTotalCompras()));
        System.out.println("Bônus: R$ " + df.format(penJur.calcBonus()));
    }

}
