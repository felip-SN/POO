/**
 *
 * @author Felipe
 */
public class Retangulo {
    private double altura;
    private double base;
    private double diagonal;
    
    public void setAltura(double a){
        altura = a;
    }
    
    
    //retorna o conteudo do atributo altura
    public double getAltura(){
        return(altura);
    }
    
    public void setBase(double b){
        base = b;
    }
    
    //retorna o conteudo do atributo base
    public double getBase(){
        return(base);
    }
    
    public void setDiagonal(double d){
        diagonal = d;
    }
    
    public double getDiagonal(){
        return(diagonal);
    }
    
    public double calcArea(){
        return(altura * base);
    }
    
    public double calcPerimetro(){
        return(2 * (altura + base));
    }
    
    public double calcDiagonal(){
//        double diagonal;
//        diagonal = Math.pow(altura, 2) + Math.pow(base, 2);
        
        return(Math.sqrt(Math.pow(altura,2) + Math.pow(base, 2)));
    }
}
