
package restaurant_management_system;



import java.util.Scanner; 


public class Table extends Restaurant_Management_System {
    int chairs;
             Scanner sc=new Scanner(System.in);  

    int tables(){
        
     
          System.out.println(" \n CUSTOMER: ");  
          chairs =sc.nextInt();
        return this.chairs;
    }
    int available(){
                      
              System.out.println("HOST : OK SIR ,CURRENTLY WE CAN SERVE");  
          chairs =sc.nextInt();
        return this.chairs;        
        }
}
