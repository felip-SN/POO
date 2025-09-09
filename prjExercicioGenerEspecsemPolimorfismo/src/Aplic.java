
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;

/**
 *
 * @author felip
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instrutor objInstrutor = new Instrutor(1020, "Felipe Santos", "13981081838");
        
        objInstrutor.setAreaAtuacao("Banco de Dados");
        System.out.println("Identificação: " + objInstrutor.getIdentificacao());
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("Atuação: " + objInstrutor.getAreaAtuacao());
        
        System.out.print("\n");
        
        Cliente objCliente = new Cliente("45784512635", "Breno", "13984523658");
        
        objCliente.setAltura(1.78);
        objCliente.setPeso(90);
        System.out.println("CPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Altura: " + objCliente.getAltura());
    }
    
}
