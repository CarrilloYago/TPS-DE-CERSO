package tp2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductDao productDao = new ProductDao();
        Order order = new Order();

        while (true) {
            System.out.println("1. Listar productos");
            System.out.println("2. Agregar producto a la orden de compra");
            System.out.println("3. Ver orden de compra");
            System.out.println("4. Agregar producto");
            System.out.println("5. Actualizar producto");
            System.out.println("6. Eliminar producto");
            System.out.println("7. Salir");
            
            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                List<Product> products = productDao.listAllProducts();
                for (Product product : products) {
                    System.out.println(product);
                }
            } else if (opcion == 2) {
                while (true) {
                    System.out.println("Ingrese ID del producto o 0 para terminar");
                    int id = Integer.parseInt(scanner.nextLine());
                    if (id == 0) {
                        break;
                    }
                    order.addProduct(productDao.findById(id));
                }
            } else if (opcion == 3) {
                order.showOrders();
            } else if (opcion == 4) {
                System.out.println("Ingrese nombre del producto");
                String name = scanner.nextLine();
                System.out.println("Ingrese precio del producto");
                double price = Double.parseDouble(scanner.nextLine());
                productDao.save(new Product(name, price));
            } else if (opcion == 5) {
                System.out.println("Ingrese ID del producto a actualizar");
                int id = Integer.parseInt(scanner.nextLine());
                Product product = productDao.findById(id);
                if (product != null) {
                    System.out.println("Ingrese nuevo nombre del producto");
                    String newName = scanner.nextLine();
                    System.out.println("Ingrese nuevo precio del producto");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    product.setName(newName);
                    product.setPrice(newPrice);
                    productDao.update(product);
                } else {
                    System.out.println("Producto no encontrado con ID: " + id);
                }
            } else if (opcion == 6) {
                System.out.println("Ingrese ID del producto a eliminar");
                Long id = Long.valueOf(scanner.nextLine());
                productDao.delete(id);
            } else if (opcion == 7) {
                break;
            } else {
                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }
    }
}
