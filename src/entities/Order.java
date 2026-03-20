package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {


    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();


    public Order(){

    }

    public Order(Date moment, OrderStatus status, Client client ) {
        this.moment = moment;
        this.status = status;
        this.client = client;

    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);

    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem item : items){
            sum = sum + item.subTotal();
        }
        return sum;

    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append(sdf.format(moment) +"\n");
        sb.append(status +"\n");
        sb.append(client +"\n");
        for(OrderItem item : items){
            sb.append(item +"\n");
        }
        sb.append()


    }




}
