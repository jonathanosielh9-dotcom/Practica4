import java.util.Scanner;
import java.util.Arrays;

public class ObtencionDatos {
    public double[] numeros;
    
    Scanner datos = new Scanner(System.in);
    
    public ObtencionDatos(double[] numeros){
        this.numeros =  numeros;
    }
    
    public void lectura(){  
        for (int i=0; i<10; i++){
            System.out.println("Dato " + (i+1) + ": ");
            
            if(datos.hasNextDouble()){
                numeros[i] = datos.nextDouble();
            }
            else{
                System.out.println("Dato incorrecto. Por favor ingrese un dato entero o decimal");
                datos.next();
                i--;
            }
        }
        
        Arrays.sort(this.numeros);
    }
    
    public double max(){
        return numeros[numeros.length-1];
    }
    
    public double min(){
        return numeros[0];
    }
}
