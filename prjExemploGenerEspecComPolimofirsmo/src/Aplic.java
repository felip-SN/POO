/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author aluno
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FuncionarioHorista funHor = new FuncionarioHorista(1010, "Pedro", "14/05/1995", 15.80, "Programador");
        
        funHor.setQtdeHorTrab(90);
        
        System.out.println("\nRegistro: " + funHor.getRegistro());
        System.out.println("Nome: " + funHor.getNome());
        System.out.println("Data Admissão: " + funHor.getDtAdmissao());
        System.out.println("Cargo: " + funHor.getCargo());
        System.out.println("Sálario Bruto   => " + funHor.calcSalBruto());
        System.out.println("Desconto        => " + funHor.calcDesconto());
        System.out.println("Salário Liquido => " + funHor.calcSalLiquido());
        System.out.println("Gratificação    => " + funHor.calcGratificacao());
        System.out.println("Salário Liquido => " + funHor.calcSalLiquido());
        
        FuncionarioMensalista funMen = new FuncionarioMensalista(1111, "Felipe", "01/07/2025", 1.918, "Analista de Sistemas");
        
        funMen.setNumSalMin(1);
        
        System.out.println("\nRegistro: " + funMen.getRegistro());
        System.out.println("Nome: " + funMen.getNome());
        System.out.println("Data Admissão: " + funMen.getDtAdmissao());
        System.out.println("Cargo: " + funMen.getCargo());
        System.out.println("Sálario Bruto   => " + funMen.calcSalBruto());
        System.out.println("Desconto        => " + funMen.calcDesconto());
        System.out.println("Salário Liquido => " + funMen.calcSalLiquido());
    }
    
}
