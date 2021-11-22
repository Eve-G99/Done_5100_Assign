/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    Map<Integer,DeliveryMan> delivermen;

    public DeliveryManDirectory() {
        delivermen = new HashMap<Integer,DeliveryMan>();
    }

    public Map<Integer, DeliveryMan> getDelivermen() {
        return delivermen;
    }
    //还差半拉