package restaurant_management_system;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;



public class Menu extends Restaurant_Management_System { static HashMap<String,String> map1 =new HashMap<String,String>();
   
    void display()throws FileNotFoundException,IOException,NoSuchElementException {
    System.out.println(" manager shows the menu and asks , Do you want to order now" ); 
    
    
         int choice;
     BufferedReader br = null;
     BufferedReader br1 = null;
     BufferedReader br2 = null;
     BufferedReader br3 = null;
         Scanner sc = new Scanner(System.in);
         choice=sc.next().charAt(0); 
         
      if(choice == 'Y' ||choice == 'y'){
       System.out.println("Enter only 1 :\n1.Starters\t2.Main\t3.Desserts\t4.Beverages");
       choice = sc.nextInt();
       switch(choice){
           case 1:   br = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\starter.txt"));
           
            case 2:    br1 = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\Main.txt"));
           
           case 3:  br2 = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\desserts.txt"));
          
           case 4:  br3 = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\beverages.txt"));
           
           default:
           System.out.println("Entered a wrong choice");

          // default:
            //System.out.println("You Entered wrong Choice");
            //display();
            
  
          }
       
      }
       
      else{
      System.out.println("manager comes after some time or when customer calls him");
          display();
      }
       
       
         StringTokenizer token;
        String t,token1 = "",token2 = "";
        Menu c = new Menu();
       
        while((t=br.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                token1 = token.nextToken();
                token2 = token.nextToken();
                System.out.println("\nItem :" + token1 +"\t" + "Rate :" + token2);
                 
            }
        map1.put(token1,token2);
           

    }
        while((t=br1.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                token1 = token.nextToken();
                token2 = token.nextToken();
                System.out.println("\nItem :" + token1 +"\t" + "Rate :" + token2);
                 
            }
        map1.put(token1,token2);
           

    }
        while((t=br2.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                token1 = token.nextToken();
                token2 = token.nextToken();
                System.out.println("\nItem :" + token1 +"\t" + "Rate :" + token2);
                 
            }
        map1.put(token1,token2);
           

    }
        while((t=br3.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                token1 = token.nextToken();
                token2 = token.nextToken();
                System.out.println("\nItem :" + token1 +"\t" + "Rate :" + token2);
                 
            }
        map1.put(token1,token2);
           

    }
   
    }
    
                  String getCode(String s){
                   if(map1.containsValue(s)){
                      for(Map.Entry<String,String>entry:map1.entrySet()){
                        if(s.equals(entry.getValue())){
                    return entry.getKey();
                         }
                      }        
                       }
                        return null;
                       }

}

