package restaurant_management_system;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;


public class Menu extends Restaurant_Management_System { static HashMap<String,String> map1 =new HashMap<String,String>();
       BufferedReader br = null;
     BufferedReader br1 = null;
     BufferedReader br2 = null;
     BufferedReader br3 = null;
    void display()throws FileNotFoundException,IOException,NoSuchElementException {
        
       
     
        StringTokenizer token;
        String t,token1 = "",token2 = "";
        Menu c = new Menu();
     
        System.out.println("\t\t\t\t manager shows the menu and asks , Do you want to order now sir.\n\n\n" ); 
        System.out.println("\t\t\t\t\t If Yes press Y \n\n" ); 

    
           int choice;
           Scanner sc = new Scanner(System.in);
           choice=sc.next().charAt(0); 
         
             if(choice == 'Y' ||choice == 'y'){
       
                    System.out.println("\t\t\t\t\t Menu ");
                    System.out.println("\t\t STARTERS ");
                    br = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\starter.txt"));
                            while((t=br.readLine())!=null){
                                 token = new StringTokenizer(t," ");
                                  while(token.hasMoreTokens()){
                                        token1 = token.nextToken();
                                         token2 = token.nextToken();
                                        System.out.println("\nItem :" + token1 +"\t" + "Rate :" + token2);
                                             }
                                             map1.put(token1,token2);
                            }
        
           
                    System.out.println("\n\n\t\t MAIN COURSE ");

                    br1 = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\Main.txt"));
                      while((t=br1.readLine())!=null){
                        token = new StringTokenizer(t," ");
                            while(token.hasMoreTokens()){
                                 token1 = token.nextToken();
                                    token2 = token.nextToken();
                                    System.out.println("\nItem :" + token1 +"\t" + "Rate :" + token2);
                 
                            }
                        map1.put(token1,token2);
                        }
        
        
                    System.out.println("\n\n\t\t DESSERTS ");
                    br2 = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\desserts.txt"));
            
                        while((t=br2.readLine())!=null){
                            token = new StringTokenizer(t," ");
                            while(token.hasMoreTokens()){
                                 token1 = token.nextToken();
                                 token2 = token.nextToken();
                                 System.out.println("\nItem :" + token1 +"\t" + "Rate :" + token2);
                 
                             }
                            map1.put(token1,token2);
                        }
        
           
                    System.out.println("\n\n\t\t BEVERAGES ");
                    br3 = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\beverages.txt"));
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
      
                    else{
                        System.out.println("\t\t\t\tmanager comes after some time or when customer calls him\n\n\n");
                        display();
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

