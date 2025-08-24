
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        Aluno objAluno;
        Scanner scan;
        
        objAluno = new Aluno();
        scan = new Scanner(System.in);
        
        System.out.print("Digite o seu RA: ");
        objAluno.setRA(scan.nextInt());
        
        System.out.print("Digite a nota da prova 1: ");
        objAluno.setNtPrv1(scan.nextDouble());
        
        System.out.print("Digite a nota da prova 2: ");
        objAluno.setNtPrv2(scan.nextDouble());
        
        System.out.print("Digite a nota do trabalho 1: ");
        objAluno.setNtTrab1(scan.nextDouble());
        
        System.out.print("Digite a nota do trabalho 2: ");
        objAluno.setNtTrab2(scan.nextDouble());
        
        do{
            System.out.println("\n1 - Exibir nota das provas/trabalhos");
            System.out.println("2 - Exibir média dos trabalhos/provas");
            System.out.println("3 - Exibir média final");
            System.out.println("4 - Sair");
            System.out.print("\n\t\t Digite a opção: ");
            
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("RA: " + objAluno.getRA());
                    System.out.println("\tProva 1: " + objAluno.getNtPrv1());
                    System.out.println("\tProva 2: " + objAluno.getNtPrv2());
                    System.out.println("\tTrabalho 1: " + objAluno.getNtTrab1());
                    System.out.println("\tTrabalho 2: " + objAluno.getNtPrv2());
                break;
                case 2:
                    System.out.println("RA: " + objAluno.getRA());
                    System.out.println("\tMédia das notas dos trabalhos: " + objAluno.calcMediaTrab());
                    System.out.println("\tMédia das notas das provas: " + objAluno.calcMediaProva());
                break;
                case 3:
                    System.out.println("RA: " + objAluno.getRA());
                    System.out.println("\tMédia dos final: " + objAluno.calcMediaFinal());
                break;
            }
        } while(opcao != 4);
    }
    
}
