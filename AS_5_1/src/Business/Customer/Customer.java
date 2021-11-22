/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Person;
import Order.OrderDirectory;

/**
 *
 * @author harold
 */
public class Customer extends Person{
    
    private int id;
    private static int count = 1;
    private OrderDirectory orders;

    public Customer() {
        id = count;
        count++;
        orders = new OrderDirectory();
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


    public static int getCount() {
        return count;
    }

    
    
}
