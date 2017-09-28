
package restaurant_management_system;

public class Customer extends Restaurant_Management_System {
    char choice;
    int c,c1,n,i;
    float b=0;
    String order=" ";
 
     void look() throws InterruptedException{
         System.out.println(" \n\n\n\nCustomer gives the order:\n\n" ); 
         Thread.sleep(2000);
     }
     void eat(){
                         System.out.println("\n customer eats the food" );  

     }
     
    
}
