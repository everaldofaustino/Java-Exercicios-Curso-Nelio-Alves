package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private  double price;

    private List<Product> products = new ArrayList<>();

    public OrderItem(){

    }

    public OrderItem(Integer quantity,double price){
        this.quantity = quantity;
        this.price = price;
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

}
