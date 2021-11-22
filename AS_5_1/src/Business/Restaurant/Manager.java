/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Restaurant;

import Business.Person;

/**
 *
 * @author cjz
 */
public class Manager extends Person{
    private Restaurant res;
    private int id;
    private static int count = 1;

    public Manager() {
        id = count;
        count++;
    }

    public Restaurant getRes() {
        return res;
    }

    public void setRes(Restaurant res) {
        this.res = res;
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
        Manager.count = count;
    }
    
    
    
}
