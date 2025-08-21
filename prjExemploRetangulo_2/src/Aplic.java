
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double medAlt, medBase;
        int opcao = 0;
        Retangulo objRet;
        Scanner entrada;
        
        entrada = new Scanner(System.in);
        objRet = new Retangulo();
        
        System.out.print("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar diagonal");
            System.out.println("4 - Encerrar");
            System.out.print("\n\t\tDigite a opção: ");
            
            opcao = entrada.nextInt();
            
            if(opcao == 1){
                System.out.println("\nMedida da área: " + objRet.calcArea());
            } else if (opcao == 2){
                System.out.println("\nMedida do perímetro: " + objRet.calcPerimetro());
            } else if (opcao == 3){
                System.out.println("\nMedida da diagonal: " + objRet.calcDiagonal());
            } else if (opcao <= 0 || opcao > 4){
                System.out.println("\nDigite um numero entre 1 e 4!");
            }
        } while(opcao != 4);
    }
    
}