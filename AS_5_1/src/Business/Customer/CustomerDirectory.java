/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    Map<Integer,Customer> customerlist;

    public CustomerDirectory() {
        this.customerlist = new HashMap<>();
    }

    public Map<Integer, Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(Map<Integer, Customer> customerlist) {
        this.customerlist = customerlist;
    }

    
    
    public Customer createCustomer(String name){
        Customer customer = new Customer();
        customer.setName(name);
        customerlist.put(customer.getId(),customer);
        return customer;
    }
}
