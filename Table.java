
package restaurant_management_system;



import java.util.Scanner; 


public class Table extends Restaurant_Management_System {
    int chairs;
    int tables(){
        
         Scanner sc=new Scanner(System.in);  
     
          System.out.println("\t\t Now Customer will reply the no of people");  
          chairs =sc.nextInt();
   
        return chairs;
    }
    
}
