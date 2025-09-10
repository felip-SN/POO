/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author aluno
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht, String c){
        super(r, n, dtAdm, c);
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    public double calcSalBruto(){
        return valHorTrab * qtdeHorTrab;
    }
    
    public double calcGratificacao(){
        return 0.75 * calcSalBruto();
    }
    
    public double calcSalLiquido(){
        return calcSalBruto() + calcGratificacao() - calcDesconto();
    }
}
