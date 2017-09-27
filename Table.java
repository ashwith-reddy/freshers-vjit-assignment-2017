/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_management_system;



import java.util.Scanner; 

/**
 *
 * @author Ashwith
 */
public class Table extends Restaurant_Management_System {
    int chairs;
    int tables(){
        
         Scanner sc=new Scanner(System.in);  
     
          System.out.println("\t\t Now Customer will reply the no of people");  
          chairs =sc.nextInt();
   
        return chairs;
    }
    
}
