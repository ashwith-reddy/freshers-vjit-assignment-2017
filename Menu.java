package restaurant_management_system;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;



public class Menu { static HashMap<String,String> map1 =new HashMap<String,String>();
    void display()throws FileNotFoundException,IOException,NoSuchElementException {
  System.out.println(" manager shows the menu" );  

     int choice;
       BufferedReader br = null;
       System.out.println("Enter Your Choice:\n1.Starters\t2.Main\t3.Desserts");
       Scanner sc = new Scanner(System.in);
       choice = sc.nextInt();
       switch(choice){
           case 1:   br = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\starter.txt"));
           break;
            case 2:    br = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\Main.txt"));
           break;
           case 3:  br = new BufferedReader(new FileReader("C:\\Users\\Ashwith\\Documents\\NetBeansProjects\\Restaurant_Management_System\\src\\restaurant_management_system\\desserts.txt"));
           break;
          }
       
         StringTokenizer token;
        String t,token1 = "",token2 = "";
        Menu c = new Menu();
       
        while((t=br.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                token1 = token.nextToken();
                token2 = token.nextToken();
                System.out.println("\nToken1 :" + token1 +"\t" + "Token2 :" + token2);
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

