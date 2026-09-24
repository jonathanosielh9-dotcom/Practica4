package ejercicio2;

public class Aprobados {
    String[] alumnos;
    double[] calificaciones;
    
    public Aprobados(double[] calificaciones, String[] alumnos){
        this.calificaciones = calificaciones;
        this.alumnos = alumnos;
    }
    
    public void aprobados(){ 
        for(int i = 0; i < 20; i++){ 
            if(calificaciones[i] >= 6){ 
                System.out.println(alumnos[i] + " - " + calificaciones[i]); 
            } 
        } 
    } 
}
