
package restaurant_management_system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;




public class Restaurant_Management_System {

   
    public void AllocateChairsForCustomers(int req_chairs,Customer customer1) throws IOException, InterruptedException {
        BufferedReader br;
        String t;
        float b1;
                      System.out.println("HOST ARRANGES "+ req_chairs + "  CHAIRS AND LEAVES\n\n\n\n" );  
                         Thread.sleep(2000);
                      BusBoy bb= new BusBoy();
                       bb.clean_table();
                       Thread.sleep(2000);
                       bb.lay_cloth();
                       Thread.sleep(2000);
                       bb.serve_water();
                       Thread.sleep(2000);
       
                     System.out.println(" Manager Comes to table to take order");  
        
        
                     Menu m1 = new Menu(); 
                    m1.display();
       
        
        
                     customer1.look();
                     br = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\order.txt"));
                                    while((t=br.readLine())!=null){
                                                                System.out.println( t +"\n"  );
                                                                  }
                 Manager mngr1 = new Manager();
                 mngr1.take_order();
                 Thread.sleep(2000);
                     mngr1.forward();
                     Thread.sleep(2000);
        
                     ExecutiveChef ec= new ExecutiveChef();
                     ec.assign();
                        Thread.sleep(2000);
                        
                        LineChef lc= new LineChef();
                        lc.prepare();
                        Thread.sleep(2000);
        
        
                     Server s1 = new Server();
                     s1.serve();
                     Thread.sleep(2000);
        
                                customer1.eat();
                                Thread.sleep(2000);
                                Thread.sleep(2000);
                                
                                
                             mngr1.bill();
                             
                             
                         Bill b=new Bill();
                             b1=b.generate();
                            
                                 System.out.println(" \n\nManager gives the bill of :"+b1 );  

                                 System.out.println("\n\ncustomer pays the bill "+b1+" and leaves the table" );  
                                 Thread.sleep(2000);
                                 bb.clean_table();
                                 Thread.sleep(2000);
                               Register r = new Register();
                               r.counter_register();
                                 new DoorBoy().exit_greeting();
                                 
    }
   
    public static void main(String[] args)throws FileNotFoundException,IOException,NoSuchElementException, InterruptedException{
         char choice;
        int req_chairs,c,m,ac;
        float b1,cr;
        String order,or,t;
        
         Customer customer1;
        customer1 = new Customer();
               BufferedReader br = null;

        Scanner sc = new Scanner(System.in);
        Restaurant_Management_System rms = new Restaurant_Management_System();
         System.out.println("\n\n\t\t\t\t\t\t IS THE TIME BETWEEN 10am-10pm?\n ");
         System.out.println("IF YES ENTER Y/y  ELSE N/n  \n");
        choice=sc.next().charAt(0);
        if (choice == 'Y' ||choice == 'y'){
                                  Thread.sleep(2000);
                  System.out.println("\n CUSTOMER ENTERS THE RESTAURANT");
                              Thread.sleep(2000);
                DoorBoy db = new DoorBoy();
                db.entrance_greeting();
                              Thread.sleep(2000);
                 Host host1 = new Host();
                 host1.receive();
                  
                    Table table1 = new Table();
                    req_chairs = table1.tables();
                    ac = table1.available();
                    
                    if(ac>req_chairs){
                          rms.AllocateChairsForCustomers(req_chairs,customer1);
                    }
                 
                    else{
                        Thread.sleep(2000);
                         System.out.println("\n PLEASE WAIT FOR SOME TIME IN WAITING AREA SIR");  
                         Thread.sleep(2000);
                      System.out.println("WHEN TABLE IS AVAILABLE");
             
                      rms.AllocateChairsForCustomers(req_chairs, customer1);
                   
                    }
        }
                    else
                  System.out.println("RESTAURANT IS CLOSE");

       
   


    
}
}






























