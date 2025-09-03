
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int identificacao;
        int opcao = 0;
        String titulo;
        boolean situacao;
        Scanner scan = new Scanner(System.in);
        Livro objLivro;
        
        System.out.print("\nDigite a identificação do livro: ");
        identificacao = scan.nextInt();
        
        System.out.print("\nDigite o titulo do livro: ");
        titulo = scan.next();
        
        objLivro = new Livro(identificacao, titulo);
        
        System.out.print("\nDigite o valor de multa: ");
        objLivro.setValMultaDiaria(scan.nextDouble());
        
        do{
            System.out.println("\n1 - Consultar Livro");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opção: ");
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Identificação: " + objLivro.getIdentificacao());
                    System.out.println("Titulo: " + objLivro.getTitulo());
                        
                    if(!objLivro.getSituacao()){
                        System.out.println("Disponivel");
                    } else {
                        System.out.println("Emprestado");
                    }
                break;
                case 2:
                    if(!objLivro.getSituacao()){
                        objLivro.emprestar();
                        
                        System.out.println("Operação de empréstimo realizada com sucesso!");
                    } else {
                        System.out.println("O livro está emprestado");
                    }
                break;
                case 3:  
                    if(!objLivro.getSituacao()){
                        System.out.println("O livro já está disponivel");
                    } else {
                        int dias;
                        System.out.print("\n\t\tDigite os dias em atraso: ");
                        dias = scan.nextInt();
                        
                        
                        System.out.println("\n\t\tO valor da multa é de: R$ " + objLivro.devolver(dias));
                        System.out.println("Operação de devolução realizada com sucesso!");
                    }
                break;
                case 4: break;
            }
            
        } while(opcao != 4);
    }
    
}
