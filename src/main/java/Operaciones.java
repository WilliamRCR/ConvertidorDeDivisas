/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William
 */
public class Operaciones {
    
    double importe, resultado;
    int divisa1, divisa2;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public double getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }
    
    public Operaciones(){
        
    }
    
    public double Convertir(){
            
            if(divisa1 == 0 && divisa2 == 0){
                resultado = importe * 0.13;
                
            }else if(divisa1 == 0 && divisa2 == 1){
                resultado = importe * 0.12;
                
            }else if(divisa1 == 0 && divisa2 == 2){
                resultado = importe;
                
            }else if(divisa1 == 0 && divisa2 == 3){
                resultado = importe * 2.67;
                
            }else if(divisa1 == 1 && divisa2 == 0){
                resultado = importe;
                
            }else if(divisa1 == 1 && divisa2 == 1){
                resultado = importe * 0.95;
                
            }else if(divisa1 == 1 && divisa2 == 2){
                resultado = importe * 7.67;
                
            }else if(divisa1 == 1 && divisa2 == 3){
                resultado = importe * 20.43;
                
            }else if(divisa1 == 2 && divisa2 == 0){
                resultado = importe * 1.05;
                
            }else if(divisa1 == 2 && divisa2 == 1){
                resultado = importe;
                        
            }else if(divisa1 == 2 && divisa2 == 2){
                resultado = importe * 8.07;
                
            }else if(divisa1 == 2 && divisa2 == 3){
                resultado = importe * 21.50;
                        
            }else if(divisa1 == 3 && divisa2 == 0){
                resultado = importe * 0.049;
                
            }else if(divisa1 == 3 && divisa2 == 1){
                resultado = importe * 0.047;
                
            }else if(divisa1 == 3 && divisa2 == 2){
                resultado = importe * 0.38;
                        
            }else if (divisa1 == 3 && divisa2 == 3){
                resultado = importe;
            }
            
            return resultado;
        }
}
