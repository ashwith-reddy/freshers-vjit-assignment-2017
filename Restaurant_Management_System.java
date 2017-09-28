
package restaurant_management_system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;




public class Restaurant_Management_System {

   
    
    
    
    public static void main(String[] args)throws FileNotFoundException,IOException,NoSuchElementException{
         char choice;
        int req_chairs,c,m,ac;
        float b1,cr;
        String order,or,t;
        
         Customer customer1;
        customer1 = new Customer();
               BufferedReader br = null;

        Scanner sc = new Scanner(System.in);
    
         System.out.println("\t\t\t\t\t\tDo customer wants to enter??\n\n\n");
         System.out.println("\t\t\t\t...................If yes enter Y/y  else N/n................... \n\n\n");
        choice=sc.next().charAt(0);
        if (choice == 'Y' ||choice == 'y'){
     System.out.println("\t\t\t\t\t...................customer enters restaurant.................\n\n\n\n");
        
                DoorBoy db = new DoorBoy();
                db.entrance_greeting();
        
        
                 Host host1 = new Host();
                 host1.receive();
                 
                    Table table1 = new Table();
                    req_chairs = table1.tables();
                    ac = table1.available();
                    
                    if(ac>req_chairs){
                    System.out.println("\t\t\t\t\t Host arranges "+ req_chairs + "  chairs and leaves\n\n\n\n" );  
        
        
                         BusBoy bb= new BusBoy();
                         bb.clean_table();
                         bb.lay_cloth();
                         bb.serve_water();
        
                     System.out.println(" \t\t\t\t\tManager Comes to table to take order\n\n\n\n");  
        
        
                     Menu m1 = new Menu(); 
                    m1.display();
       
        
        
                     customer1.look();
                     br = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\order.txt"));
                     while((t=br.readLine())!=null){
                        System.out.println( t +"\n"  );
                                             }
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
                         Bill b=new Bill();
                             b1=b.generate();
                                 System.out.println(" \t\t\t\t\t\t\t bill is :"+b1 );  

                                 System.out.println(" \t\t\t\t\t\t\tcustomer pays the bill "+b1+" and leaves the restaurant\n\n\n\n\n" );  

                                 db.exit_greeting();
                    }
                 
                    else{
                         System.out.println("Host asks the customere to wait for some time in waiting area");  
                
                    
                    }
        }
                    else
                  System.out.println("\t\t\t\t\t...................customer did not enter restaurant .......................\n\n\n\n\n");

       
   


    
}
}






























