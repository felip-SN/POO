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
public class Professor extends Pessoa {
    private int regFuncional;
    private double salario;
    
    public Professor(int re, String n, String dn){
        super(n, dn);
        
        regFuncional = re;
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
    public int getRegFuncional(){
        return regFuncional;
    }
    
    public double getSalario(){
        return salario;
    }
}
