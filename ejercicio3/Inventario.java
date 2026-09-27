package ejercicio3;

public class Inventario {
    private double [] precios;
    private int [] existencias;
    private String [] nombres;
    int contador;


//Constructor
    public Inventario(int cantidad){
        precios = new double[cantidad];
        existencias = new int[cantidad];
        nombres = new String[cantidad];
        contador = 0;
    }
    
    public void agregarProducto(String nombre, double precio, int existencia){
        if(contador < precios.length){
            nombres[contador] = nombre;
            precios[contador] = precio;
            existencias[contador] = existencia;
            contador++;
        }else{
            System.out.println("Ya se lleno el inventario, no se pueden agregar mas productos.");
        }
    }
    
    public void mostrarInventario(){
        for(int indice=0; indice<contador; indice++){
            System.out.println("Producto: " + nombres[indice] + ", Precio: " + precios[indice] + ", Existencia: " + existencias[indice]);
        }
    }

    public int buscarProducto(String nombre){
        for(int indice=0; indice<contador; indice++){
            if(nombres[indice].equals(nombre)){
                return indice;
            }
        }
        return -1;
    }
    public void actualizarExistencia(String nombre, int nuevaExistencia){
        int indice = buscarProducto(nombre);
        if(indice != -1){
            existencias[indice] = nuevaExistencia;
        }else{
            System.out.println("No se existe el producto: " + nombre +  " " + "no se puede actualizar la existencia");
        }
    }

    public void actualizarPrecio(String nombre, double nuevoPrecio){
        int indice = buscarProducto(nombre);
        if (nuevoPrecio < 0) {
            System.out.println("No se puede regalar el producto");
            return;
        } 
        else {
            
        if(indice != -1){
            precios[indice] = nuevoPrecio;
        }else{
            System.out.println("No se encontro el producto: " + nombre + " " + "no se puede actualizar el precio");
        }
        
        }
    }

    public double calcularValorTotalInventario(){
        double valorTotal = 0;
        for(int indice=0; indice<contador; indice++){
            valorTotal += precios[indice] * existencias[indice];
        }
        return valorTotal;
    }
}
