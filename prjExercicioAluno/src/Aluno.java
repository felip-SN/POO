/**
 *
 * @author Felipe
 */
public class Aluno {
    private int RA;
    private double ntPrv1;
    private double ntPrv2;
    private double ntTrab1;
    private double ntTrab2;
    
    public void setRA(int ra){
        RA = ra;
    }
    
    public int getRA(){
        return RA;
    }
    
    public void setNtPrv1(double nt){
        ntPrv1 = nt;
    }
    
    public double getNtPrv1(){
        return ntPrv1;
    }
    
    public void setNtPrv2(double nt){
        ntPrv2 = nt;
    }
    
    public double getNtPrv2(){
        return ntPrv2;
    }
    
    public void setNtTrab1(double nt){
        ntTrab1 = nt;
    }
    
    public double getNtTrab1(){
        return ntTrab1;
    }
    
    public void setNtTrab2(double nt){
        ntTrab2 = nt;
    }
    
    public double getNtTrab2(){
        return ntTrab2;
    }
    
    public double calcMediaProva(){
        return 0.75 * ((ntPrv1 + 2 * ntPrv2)/3);
    }
    
    public double calcMediaTrab(){
        return 0.25 * ((ntTrab1 + ntTrab2)/2);
    }
    
    public double calcMediaFinal(){
        return calcMediaProva() + calcMediaTrab();
    }
    
    public boolean isApproved(){
//        if(calcMediaFinal() >= 5.0){
//            return(true);
//        } else {
//            return(false);
//        }

        return (calcMediaFinal() >= 5.0);
    }
}
