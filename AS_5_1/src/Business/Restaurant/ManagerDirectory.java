/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Restaurant;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cjz
 */
public class ManagerDirectory {
    Map<Integer,Manager> mlist;

    public ManagerDirectory() {
        mlist = new HashMap<Integer,Manager>();
    }

    public Map<Integer, Manager> getMlist() {
        return mlist;
    }

    public void setMlist(Map<Integer, Manager> mlist) {
        this.mlist = mlist;
    }
    
    public Manager createManager(String name, Restaurant res){
        Manager m = new Manager();
        m.setName(name);
        m.setRes(res);
        mlist.put(m.getId(), m);
        return m;
    }
    
    
}
