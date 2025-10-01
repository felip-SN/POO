/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Felip
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionarios[];
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. de Funcionarios: " + numFunc);
        
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int cont = 0; cont < numFunc; cont++) {
            System.out.print(funcionarios[cont].getRegistro() + "\t\t");
            System.out.println(funcionarios[cont].getNome() + "\t\t");
            System.out.println(funcionarios[cont].getCargo());
        }
    }
}
