package ejercicio3;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario(5);

        inventario.agregarProducto("Gansito", 15.0, 10);
        inventario.agregarProducto("Chips_fuego", 22.0, 50);  
        inventario.agregarProducto("Boing_manzana", 20.0, 25);
        inventario.agregarProducto("Pepsi", 20.0, 70);
        inventario.agregarProducto("Takis_fuego", 25.0, 30); // Este producto no se agregará ya que el inventario está lleno

        inventario.mostrarInventario();
        System.out.println("----------------------------------");      

        String productoABuscar = "Chips_fuego";
        System.out.println("Se quiere buscar el producto: " + productoABuscar);

        int buscar = inventario.buscarProducto(productoABuscar);
        if(buscar != -1) {
            System.out.println("Producto encontrado en el inventario: " + buscar);
        } else {
            System.out.println("No se encontro el producto:" + productoABuscar);
        }

        inventario.actualizarExistencia("Boing_manzana", 80);
        inventario.actualizarPrecio("Gansito", -10.0);

        inventario.mostrarInventario();


        double total = inventario.calcularValorTotalInventario();
        System.out.println("El valor total del inventario es de " + total);
    }
    
}
