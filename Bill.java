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
public class Bill {
   char choice;
   int c;
   float b=0;
    float generate(){
    System.out.println("Manager starts calculates the Bill");
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("starters ordered? Y/N");
    choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y'){
            c = sc.nextInt();
            if(c == 1|| c == 2|| c== 3)
            {
                b=b+100;
            }
          else if ( c == 4 || c==5 || c==6){
                b=b+130;
               }
        else
           System.out.println("No starters selected");
            
            
            
            System.out.println("main dishes ordered? Y/N");
            choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y'){
            c = sc.nextInt();
            if(c == 1)
            {
                b=b+100;
            }
          else if ( c == 2 || c==3){
                b=b+120;
               }
          else if ( c == 4){
                b=b+150;
               }
        else
           System.out.println("No main dish selected");
            
            
            
            System.out.println("desserts  ordered? Y/N");
            choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y'){
            c = sc.nextInt();
            
         if ( c == 2 || c==1){
                b=b+80;
               }
        else
           System.out.println("No desserts selected");
         
         
          System.out.println("beverages  ordered? Y/N");
            choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y'){
            c = sc.nextInt();
            
         if ( c == 2 || c==1|| c == 3 || c==4){
                b=b+80;
               }
        else
           System.out.println("No beverages selected");
             
         
         
         
          System.out.println("Bill is "+b);

       
    }
    
}
}
}
    return b; }
}