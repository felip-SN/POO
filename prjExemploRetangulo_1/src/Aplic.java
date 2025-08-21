/**
 *
 * @author Felipe
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo objRet; //definição do ponteiro
        
        // Instanciação(alocação) de um objeto da classe retangulo
        objRet = new Retangulo();
        
        //Implementando o caso de uso retangulo
        //Geométrica Retângulo
        objRet.setAltura(5.0); //Passando mensagens/valor para o objeto
        objRet.setBase(8.0); //Passando mensagens/valor para o objeto
        
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        
        //Implementação do caso de uso retangulo
        //Geométrica Retangulo
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perimetro: " + objRet.calcPerimetro());
        
        System.out.println("Calculo da diagonal do retangulo: " + objRet.calcDiagonal());
    }
    
}
