package fatec.poo.model;

/**
 *
 * @author felip
 */
public class Instrutor extends Pessoa {
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int id, String n, String t){
        super(n,t);
        
        identificacao = id;
    }
    
    public void setAreaAtuacao(String atuacao){
        areaAtuacao = atuacao;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
}
