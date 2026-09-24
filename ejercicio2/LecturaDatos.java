package ejercicio2;

import java.util.Scanner;

public class LecturaDatos {
    Scanner datos = new Scanner(System.in);
    double[] calificaciones = new double[20];
    String[] alumnos = new String[20];
    
    public LecturaDatos(){
    
    }
    
    public double[] lecturaCal(){
        for(int i=0; i<20; i++){
            System.out.println("Calificacion " + (i+1) + ": ");
            
            if(datos.hasNextDouble()){
                calificaciones[i] = datos.nextDouble();
            }
            else{
                System.out.println("Tipo de dato incorrecto");
                datos.next();
                i--;
                continue;
            }
            
            if(calificaciones[i]<0 || calificaciones[i]>10){
                System.out.println("Calificacion fuera de rango, verifique el numero");
                i--;
            }
        }
        return calificaciones;
    }
    
    public String[] lecturaNom(){
        for(int i=0; i<20; i++){
            System.out.println("Nombre del alumno " + (i+1) + ": ");
            alumnos[i] = datos.nextLine();
        }
        
        return alumnos;
    }
}
