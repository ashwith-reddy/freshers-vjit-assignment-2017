
package restaurant_management_system;
import java.util.Scanner;


public class Bill
{
 
  int c,c1;
  float b1;
  float generate() throws InterruptedException{

  Scanner sc = new Scanner(System.in);
               System.out.println("enter the item code ");

       c = sc.nextInt();
       if(c>0 && c<17)
       {
          
            if(c == 1|| c == 2|| c== 3)
            {
                b1=b1+100;
            }
          else if ( c == 4 || c==5 || c==6){
                b1=b1+130;
               }
          else if(c == 7)
            {
                b1=b1+100;
            }
          else if ( c == 8 || c==9){
                b1=b1+120;
               }
          else if ( c == 10){
                b1=b1+150;
               }
           else  if ( c == 11 || c==12){
                b1=b1+80;
               }
           else if( c == 13 || c==14 || c == 15 || c==16 )
            {
                b1=b1+80;
               }  
                System.out.println("  enter  0 if more were ordered else enter any other " );

                  c1 = sc.next().charAt(0); 
                  if(c1=='0'){
                   this.generate();
                  }
                  else{
                   System.out.println(" End of Order" );  
                   Thread.sleep(2000);
                  }
                                 
        
       }
       else{
          System.out.println("you entered a wrong key" );
          generate();
       }
     return b1;
  }
}