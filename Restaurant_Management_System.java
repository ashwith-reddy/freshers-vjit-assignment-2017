/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_management_system;

/**
 *
 * @author Ashwith
 */


import java.util.Scanner;
import java.lang.Object;




public class Restaurant_Management_System {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        //char choice1;
        int req_chairs,c;
        
        
         Customer customer1;
        customer1 = new Customer();
        char choice1 = customer1.enter();
        
        DoorBoy db = new DoorBoy();
        db.wish = choice1;
        db.greeting();
        
        
        Host host1 = new Host();
        host1.receive();
        
        Table table1 = new Table();
        req_chairs = table1.tables();
        System.out.println(" Host arranges "+ req_chairs + "  chairs" );  

        

        
      
    
        
       
     
       
    }

    
}






























