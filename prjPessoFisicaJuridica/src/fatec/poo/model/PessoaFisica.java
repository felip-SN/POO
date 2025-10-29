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
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;

    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    
    public double calcBonus(){
        return super.getTotalCompras() * (base/100);
    }

    public double getBase() {
        return base;
    }

    public String getCpf() {
        return cpf;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
