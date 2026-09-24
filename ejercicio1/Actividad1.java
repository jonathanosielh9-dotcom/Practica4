public class Actividad1 {

    public static void main(String[] args) {
        double[] numeros = new double[10];
        
        ObtencionDatos datos = new ObtencionDatos(numeros);
        
        System.out.println("Por favor proporcioname 10 numeros (pueden ser enteros o decimales)");
        datos.lectura();
        
        System.out.print("Numero mayor: " + datos.max());
        System.out.println("Numero menor: " + datos.min());
        
    }
}
