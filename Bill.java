
package restaurant_management_system;
import java.util.Scanner;


public class Bill
{
  char choice;
  int c;
  float b=0;
  float generate(){
  System.out.println("\t\t\t\tManager starts calculating the Bill\n");
  Scanner sc = new Scanner(System.in);
    
    
    System.out.println("starters ordered? Y/N");
    choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y')
        {
              System.out.println("Enter the code of ordered dish 1.Chilli_paneer 2.Gobi_manchuria 3.Veg_manchuria 4.Chicken_manchuria 5.Chilli_chicken 6.Chicken_65\n");

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
        }
            
            
    System.out.println("main dishes ordered? Y/N");
    choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y')
        {
       System.out.println("Enter the code of ordered dish 7.vegetabe_biryani 8.mushroom_biryani 9.chicken_biryani 10.mutton_biryani\n");

            c = sc.nextInt();
            if(c == 7)
            {
                b=b+100;
            }
          else if ( c == 8 || c==9){
                b=b+120;
               }
          else if ( c == 10){
                b=b+150;
               }
        else
           System.out.println("No main dish selected");
            
        }
            
    System.out.println("desserts  ordered? Y/N");
    choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y')
        {
    System.out.println("Enter the code of ordered dish  11.Double_ka_meetha 12.Kurbani_ka_meetha \n");
            c = sc.nextInt();
            
         if ( c == 11 || c==12){
                b=b+80;
               }
        else
           System.out.println("No desserts selected");
         
        }
        
    System.out.println("beverages  ordered? Y/N");
    choice=sc.next().charAt(0);
        if(choice == 'Y' ||choice == 'y')
        {
   System.out.println("Enter the code of ordered dish 13.Coke 14.Thumps_up 15.Sprite 16.Maaza 60  \n");
            c = sc.nextInt();
            
         if ( c == 13 || c==14 || c == 15 || c==16){
                b=b+80;
               }
        else
           System.out.println("No beverages selected");
             
        }
         
          System.out.println("\n\n\nBill is "+b);

    return b;
  }
}