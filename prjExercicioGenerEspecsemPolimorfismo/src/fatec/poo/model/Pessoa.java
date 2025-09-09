package fatec.poo.model;

/**
 *
 * @author felip
 */
public class Pessoa {
    private String nome;
    private String telefone;
    
    public Pessoa(String n, String tl){
        nome = n;
        telefone = tl;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
}
