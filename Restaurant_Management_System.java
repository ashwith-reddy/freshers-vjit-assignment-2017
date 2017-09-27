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


import java.util.Scanner;



public class Restaurant_Management_System {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args)throws FileNotFoundException,IOException,NoSuchElementException{
         char choice;
        int req_chairs,c;
        float bill;
        String order;
        
         Customer customer1;
        customer1 = new Customer();
        
        Scanner sc = new Scanner(System.in);
    
         System.out.println("\t\t\t\t\t\tDo customer wants to enter??\n\n\n");
         System.out.println("\t\t\t\t...................If yes enter Y/y  else N/n................... \n\n\n");
        choice=sc.next().charAt(0);
        if (choice == 'Y' ||choice == 'y'){
     System.out.println("\t\t\t\t\t...................customer enters restaurant.................\n\n\n\n");
        
               //char choice1 = customer1.enter();
        
                DoorBoy db = new DoorBoy();
                db.entrance_greeting();
        
        
                 Host host1 = new Host();
                 host1.receive();
        
                    Table table1 = new Table();
                    req_chairs = table1.tables();
                    System.out.println("\t\t\t\t\t Host arranges "+ req_chairs + "  chairs and leaves\n\n\n\n" );  
        
        
                         BusBoy b1= new BusBoy();
                         b1.clean_table();
                         b1.lay_cloth();
                         b1.serve_water();
        
                     System.out.println(" \t\t\t\t\tManager Comes to table to take order\n\n\n\n");  
        
        
                     Menu m1 = new Menu(); 
                    m1.display();
       
        
        
                     customer1.look();
        
                 Manager mngr1 = new Manager();
                 mngr1.take_order();
                     mngr1.forward();
        
                     ExecutiveChef ec= new ExecutiveChef();
                     System.out.println("\t\t\t\t\tExectutive chef looks at the order  "+ customer1.order +"\n\n\n\n\n");
                     ec.assign();

                        LineChef lc= new LineChef();
                        lc.prepare();
        
        
                     Server s1 = new Server();
                     s1.serve();
        
                                customer1.eat();
                             mngr1.bill();
                         Bill b=new Bill();
                             bill=b.generate();
        
                                 System.out.println(" \t\t\t\t\t\t\tcustomer pays the bill "+bill+" and leaves the restaurant\n\n\n\n\n" );  

        
        }
                    else
                  System.out.println("\t\t\t\t\t...................customer did not enter restaurant .......................\n\n\n\n\n");

        
      
    
        
       
     
       
    }

    
}






























