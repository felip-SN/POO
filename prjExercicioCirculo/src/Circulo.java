/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felipe
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double r){
        raio = r;
    }
    
    public double getRaio()
    {
        return raio;
    }
    
    public double calcArea(){
        return Math.pow(raio * 3.1416, 2);
    }
    
    public double calcPerimetro(){
        return 2 * 3.1416 * raio;
    }
    
    public double calcDiametro(){
        return 2 * raio;
    }
    
}
