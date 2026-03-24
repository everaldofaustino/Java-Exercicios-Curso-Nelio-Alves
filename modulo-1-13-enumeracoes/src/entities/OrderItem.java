package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private  double price;

    private Product product;

    private List<Product> products = new ArrayList<>();

    public OrderItem(){

    }

    public OrderItem(Integer quantity,double price,Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }




    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public List<Product> getProducts() {
        return products;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal(){
        return quantity*price;

    }

    public  String toString(){

        return product.getName()+"," + String.format("%.2f",price) +","+ "Quantity: " +quantity+", " + "Subtotal: " + subTotal();
    }

}
