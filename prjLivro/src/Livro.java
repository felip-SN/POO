/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro(int iden, String titu){
        identificacao = iden;
        titulo = titu;
        situacao = false;
    }
    
    public void setValMultaDiaria(double valor){
        valMultaDiaria = valor;
    }
    
    public int getIdentificacao(){
        return identificacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void emprestar(){
        if(!getSituacao()){
            situacao = true;
        }
    }
    
    public double devolver(int dias){
        situacao = false;
        return valMultaDiaria * dias;
    }
}
