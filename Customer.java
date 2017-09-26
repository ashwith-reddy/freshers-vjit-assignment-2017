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
public class Customer {
    char choice;
     public char enter(){
         System.out.println("...................Do customer wants to enter??.................");
         System.out.println("...................If yes enter Y/y  else N/n.................");
        
           
         
         Scanner sc = new Scanner(System.in);
   
    choice=sc.next().charAt(0);
   
      if(choice == 'N' ||choice == 'n'){
      System.out.println("...................customer did not enter restaurant ................");
      choice = 'N' ;
     
      }
     
         
      else if (choice == 'Y' ||choice == 'y'){
     System.out.println("...................customers enters restaurant.................");
     choice = 'Y' ;
     }
    
     
     else
     {
            System.out.println("...................invalid option select correct option.................");
           enter();
          
     }
      return choice ;

 }
    
}
