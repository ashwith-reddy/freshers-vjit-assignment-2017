/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_management_system;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

/**
 *
 * @author Ashwith
 */






public class Restaurant_Management_System {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args)throws FileNotFoundException,IOException,NoSuchElementException{
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
        System.out.println(" Host arranges "+ req_chairs + "  chairs and leaves" );  
        
        
        BusBoy b1= new BusBoy();
        b1.clean_table();
        b1.lay_cloth();
        b1.serve_water();
        
        System.out.println(" Manager Comes to table to take order" );  
        
        
        Menu m1 = new Menu(); 
       m1.display();
       
        
        
        customer1.look();
        
        Manager mngr1 = new Manager();
        mngr1.take_order();
        mngr1.forward();
        
        ExecutiveChef ec= new ExecutiveChef();
        ec.assign();

        LineChef lc= new LineChef();
        lc.prepare();
        
        
        Server s1 = new Server();
        s1.serve();
        
        customer1.eat();
        mngr1.bill();
        customer1.pay();

        
      
    
        
       
     
       
    }

    
}






























