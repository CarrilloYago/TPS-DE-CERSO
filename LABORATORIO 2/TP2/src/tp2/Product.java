/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author Informatica7
 */
public class Product {
    private Long idProduct;
    private String name;
    private Double price;
    private static Long countProduct;
    
   
    public Product(Long idProduct, String name, Double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }
    
    

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    } 
    public Long getidProduct() {
        return idProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}