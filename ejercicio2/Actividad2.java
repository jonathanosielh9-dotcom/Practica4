package ejercicio2;

public class Actividad2 {

    public static void main(String[] args) {
        double[] calificaciones;
        String[] alumnos;
        
        LecturaDatos lectura = new LecturaDatos();
        
        System.out.println("Por favor escriba en orden el nombre de los alumnos ");
        alumnos = lectura.lecturaNom();
        
        System.out.println("Ahora escriba las calificaciones de cada uno en el mismo orden");
        calificaciones = lectura.lecturaCal();
        
        Calculos calculos = new Calculos(calificaciones);
        Aprobados aprobados = new Aprobados(calificaciones, alumnos);
        
        System.out.println("El promedio de calificaciones es de: " + calculos.promedio());
        System.out.println("La calificacion maxima obtenida fue: " + calculos.max());
        System.out.println("La calificacion minima obtenida fue: " + calculos.min());
        
        aprobados.aprobados();
    }
}
