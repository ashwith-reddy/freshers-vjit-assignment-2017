
package restaurant_management_system;



import java.util.Scanner; 


public class Table extends Restaurant_Management_System {
    int chairs;
             Scanner sc=new Scanner(System.in);  

    int tables(){
        
     
          System.out.println("\t\t Now Customer will reply the no of people");  
          chairs =sc.nextInt();
        return this.chairs;
    }
    int available(){
                      
              System.out.println("\t\t Host looks at the available Table and chairs");  
          chairs =sc.nextInt();
        return this.chairs;        
        }
}
