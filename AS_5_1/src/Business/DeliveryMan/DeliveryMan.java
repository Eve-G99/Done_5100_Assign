/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Person;
import Order.Order;
import Order.OrderDirectory;
import java.util.Map;

/**
 *
 * @author harold
 */
public class DeliveryMan extends Person {
    
    private int id;
    private static int count = 1;
    private OrderDirectory orders;
    public DeliveryMan() {
        orders = new OrderDirectory();
        id = count;
        count++;
    }
    
    public int unfinished(){
        int count = 0;
        for (Map.Entry<Integer,Order> entry : orders.getOlist().entrySet()){
            Order or = entry.getValue();
            if (or.getStatus().equals("Delivering"))
                count++;
        }
        return count;
    }
    public OrderDirectory getOrders() {
        return orders;
    }

    public void setOrders(OrderDirectory orders) {
        this.orders = orders;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DeliveryMan.count = count;
    }
    
    
}
