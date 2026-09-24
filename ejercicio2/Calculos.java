package ejercicio2;

import java.util.Arrays;

public class Calculos {
    public double[] calificaciones = new double[20];
    
    public Calculos(double[] calificaciones){
        this.calificaciones = calificaciones;
    }
    
    public double promedio(){
        double suma=0;
        
        for(int i=0; i<calificaciones.length; i++){
            suma += calificaciones[i];
        }
        
        return suma/(calificaciones.length);
    }
    
    public double min(){
        double calMin = calificaciones[0];
        
        for(int i=1; i<20; i++){
            if(calificaciones[i]>=calMin){
            }
            else{
                calMin=calificaciones[i];
            }
        }
        
        return calMin;
    }
    
    public double max(){
        double calMax=calificaciones[0];
        
        for(int i=1; i<20; i++){
            if(calificaciones[i]<=calMax){
            }
            else{
                calMax=calificaciones[i];
            }
        }
        
        return calMax;
    }
}
