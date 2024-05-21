/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cersotp1;
import java.util.Scanner;
/**
 *
 * @author yagoc
 */
public class CersoTp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto producto1 = new Producto("Remera", 10.3);
        Producto producto2 = new Producto("Camisa", 15.5);
        Producto producto3 = new Producto("Pantalon", 20.7);
        Producto producto4 = new Producto("Jeans", 25.50);
        Producto producto5 = new Producto("Gorro", 40.25);
        Producto producto6 = new Producto("Guantes", 60.33);
        Producto producto7 = new Producto("Campera", 99.99);
        Producto producto8 = new Producto("Medias", 5.2);
        Producto producto9 = new Producto("Botas", 2.5);
        Producto producto10 = new Producto("Traje", 25.3);
        Ordenes orden = new Ordenes();
        
        System.out.println("Seleccione los productos de la lista (ingrese el número correspondiente):");
        System.out.println("1. Remera - $10.3");
        System.out.println("2. Camisa - $15.5");
        System.out.println("3. Pantalón - $20.7");
        System.out.println("4. Jeans - $25.50");
        System.out.println("5. Gorro - $40.25");
        System.out.println("6. Guantes - $60.33");
        System.out.println("7. Campera - $99.99");
        System.out.println("8. Medias - $5.2");
        System.out.println("9. Botas - $2.5");
        System.out.println("10. Traje - $25.3");
        System.out.println("11. Mostrar Orden");
        System.out.println("0. Finalizar orden");
        
        
        while (true) {
            System.out.print("Ingrese el número del producto (0 para finalizar): ");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.out.println("el total es: "+orden.calcularPrecio());
                break;
            } else if (opcion < 1 || opcion > 11) {
                System.out.println("Opción inválida. Por favor, ingrese un número del 0 al 10.");
            }


            switch (opcion) {
                case 1:
                    orden.agregarProducto(producto1);
                    break;
                case 2:
                    orden.agregarProducto(producto2);
                    break;
                case 3:
                    orden.agregarProducto(producto3);
                    break;
                case 4:
                    orden.agregarProducto(producto4);
                    break;
                case 5:
                    orden.agregarProducto(producto5);
                    break;
                case 6:
                    orden.agregarProducto(producto6);
                    break;
                case 7:
                    orden.agregarProducto(producto7);
                    break;
                case 8:
                    orden.agregarProducto(producto8);
                    break;
                case 9:
                    orden.agregarProducto(producto9);
                    break;
                case 10:
                    orden.agregarProducto(producto10);
                    break;
                case 11:
                    orden.mostrarOrden();
                    break;
            }
        
        /*
       
        Producto producto1 = new Producto("manzana",100);
        Producto producto2 = new Producto("banana",200);
        Producto producto3 = new Producto("pera",300);
       
        Ordenes orden = new Ordenes();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        
        orden.mostrarOrden();
        System.out.println("el total es: "+orden.calcularPrecio());
       */
                        
        /*
        Ordenes orden1 = new Ordenes();
        Ordenes orden2 = new Ordenes();
        Ordenes orden3 = new Ordenes();        
        System.out.println(orden1.toString());
        System.out.println(orden2.toString());
        System.out.println(orden3.toString());
        */
        }
    
    }
}
