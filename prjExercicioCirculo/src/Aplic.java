
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
        double raio;
        int opcao = 0;
        Circulo objCir;
        Scanner scan;
        
        objCir = new Circulo();
        scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio: ");
        raio = scan.nextDouble();
        
        objCir.setRaio(raio);
        
        do{
            System.out.println("\n1 - Consultar a area");
            System.out.println("2 - Consultar o perimetro");
            System.out.println("3 - Consultar o diametro");
            System.out.println("4 - Encerrar");
            System.out.print("\n\t\tDigite a opção: ");
            
            opcao = scan.nextInt();
            
            if(opcao == 1){
                System.out.println("O valor da area: " + objCir.calcArea());
            } else if (opcao == 2) {
                System.out.println("O valor do perimetro: " + objCir.calcPerimetro());
            } else if (opcao == 3) {
                System.out.println("O valor do diametro: " + objCir.calcDiametro());
            } else if (opcao <= 0 || opcao > 4){
                System.out.println("Digite valores entre 1 e 4!");
            }
        } while(opcao != 4);
        
    }
    
}
