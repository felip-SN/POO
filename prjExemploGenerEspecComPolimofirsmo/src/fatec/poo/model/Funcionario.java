/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Felipe
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    
    public Funcionario(int r, String n, String dtadm, String c){
        registro = r;
        nome = n;
        dtAdmissao = dtadm;
        cargo = c;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return 0.10 * calcSalBruto();
    }
    
    public double calcSalLiquido(){
        return calcSalBruto() - calcDesconto();
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getRegistro(){
        return registro;
    }
    
    public String getDtAdmissao(){
        return dtAdmissao;
    }
    
    public String getCargo(){
        return cargo;
    }
}
