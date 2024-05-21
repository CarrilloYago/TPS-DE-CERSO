/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cersotp1;

/**
 *
 * @author yagoc
 */
public class Ordenes {
    int idOrden;
    private Producto lista[];
    private int cuentaProducto=0;//indice
    private static int contador=0;
    


    public Ordenes() {
        
        this.idOrden=this.contador;
        this.contador++;
        lista = new Producto[10];
    }
    
    public void agregarProducto(Producto producto){
            if(cuentaProducto<lista.length){
                lista[cuentaProducto] = producto;
                cuentaProducto++;
            }
        }
    
    public double calcularPrecio(){
        double total=0;
        for (int i = 0; i<cuentaProducto; i++) {
            /*Producto productoAuxiliar=lista[i];
            total=total+productoAuxiliar.getPrecio();
            */
            total=total+lista[i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        for (int i = 0; i<cuentaProducto; i++) {
            System.out.println(lista[i].toString());
        }
    }
 }
