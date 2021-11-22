/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee
        

import java.util.HashMap;
import java.util.Map;
public class Restaurant {
    private ManagerDirectory managers;
    
    private OrderDirectory orders;
    private Map<Integer,Item> menu;
    private String name;
    private int id;
    private int menuid;
    private static int count = 1;
    String add;
    String tele;
    public Restaurant(String name) {
        managers = new ManagerDirectory();
        menu = new HashMap<Integer,Item>();
        orders = new OrderDirectory();
        menuid = 3;
        this.name = name;
        add = String.valueOf(id) + ", A Street, Boston";
        tele = String.valueOf(id).repeat(10);
        for (int i = 0; i < 3; i++){
            String content = this.name + " " + "item" + String.valueOf(i);
            Item item = new Item(i*5+1,content);
            menu.put(i, item);
        }
        id = count;
        count++;   
    }