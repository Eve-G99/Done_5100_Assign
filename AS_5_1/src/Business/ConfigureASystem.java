package Business;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Person employee1 = system.getEmployeeDirectory().createEmployee("Administrator");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("ad", "ad", employee1, new SystemAdminRole());
        Restaurant res1 = system.getRestaurantDirectory().createRestaurant("Restaurant1");
        Person employee2 = res1.getManagers().createManager("Manager1", res1);
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("ma", "ma", employee2, new AdminRole());
        Restaurant res2 = system.getRestaurantDirectory().createRestaurant("Restaurant2");
        Person employee22 = res2.getManagers().createManager("Manager2", res2);
        UserAccount ua22 = system.getUserAccountDirectory().createUserAccount("ma2", "ma2", employee22, new AdminRole());
        DeliveryMan employee3 = system.getDeliveryManDirectory().createDeliveryman("Deliverman");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("de", "de", employee3, new DeliverManRole());
        Customer employee4 = system.getCustomerDirectory().createCustomer("Customer");
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("cu", "cu", employee4, new CustomerRole());
        
        return system;
    }
    
}
