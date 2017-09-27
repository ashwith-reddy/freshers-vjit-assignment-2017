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
    
    
     /*public char enter(){
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
     */
     void look(){
         System.out.println(" \t\t\tCustomer gives the order\n\n" ); 
       System.out.println(" \t\t\tnumber of items to order by customer:" );
      Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(i=0;i<=n;i++)
       {
          
         order=order+"  "+sc.nextLine();
         
          
       }
      System.out.println("\torder is :"+order );
       //o(order);
         
         

     }
     
    /* String o(String s)
     {
              System.out.println("test:" );

              return order;
     }
     */
     void eat(){
                         System.out.println("\t\t\t\t\tcustomer eats the food\n\n\n\n" );  

     }
     
    
}
