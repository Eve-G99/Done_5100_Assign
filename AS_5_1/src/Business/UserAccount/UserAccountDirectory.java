/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.Employee.Employee;
import Business.Person;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private Map<Integer,UserAccount> userAccountList;
    private int count;
    public UserAccountDirectory() {
        userAccountList = new HashMap<Integer,UserAccount>();
        count = 0;
    }

    public Map<Integer, UserAccount> getUserAccountList() {
        return userAccountList;
    }