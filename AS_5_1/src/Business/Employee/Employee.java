/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person;
import Business.Restaurant.Restaurant;

/**
 *
 * @author raunak
 */
public class Employee extends Person {
    
    
    private int id;
    private static int count = 1;
    
    public Employee() {
        id = count;
        count++;
    }
    //