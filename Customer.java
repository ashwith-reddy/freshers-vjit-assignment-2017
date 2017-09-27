/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_management_system;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Ashwith
 */
public class Customer extends Restaurant_Management_System {
    char choice;
    int n,i;
    String order=" ";
  
     void look(){
         System.out.println(" \t\t\tCustomer gives the order\n\n" ); 
       System.out.println(" \t\t\tnumber of items along with names respectively" );
      Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(i=0;i<=n;i++)
       {
          
         order=order+"  "+sc.nextLine();
         
          
       }
      System.out.println("\torder is :"+order );
     }
     void eat(){
                         System.out.println("\t\t\t\t\tcustomer eats the food\n\n\n\n" );  

     }
     
    
}
