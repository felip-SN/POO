/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author felip
 */
public class Cliente extends Pessoa {
    
    private String cpf;
    private double peso;
    private double altura;
    
    public Cliente(String cp, String n, String tl) {
        super(n, tl);
        
        cpf = cp;
    }
    
    public void setPeso(double p){
        peso = p;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double getAltura(){
        return altura;
    }
    
}
