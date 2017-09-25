/**
 * 
 */
package restaurant.demo;

/**
 *The menu categories and items of the menu are explored here
 *Further it will be updated
 */



import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;
 
public class Menu {
     static HashMap<String,String> map1 =new HashMap<String,String>();
    public static void main(String args[])throws FileNotFoundException,IOException,NoSuchElementException {
       int choice;
       BufferedReader br = null;
       System.out.println("Enter Your Choice:\n1.Starters\t2.Main\t3.Desserts\t4.Beverages");
       Scanner sc = new Scanner(System.in);
       choice = sc.nextInt();
       switch(choice){
           case 1:  br = new BufferedReader(new FileReader("starters.txt"));
          break;
            case 2:    br = new BufferedReader(new FileReader("main.txt"));
           break;
           case 3:  br = new BufferedReader(new FileReader("desserts.txt"));
           break;
           case 4:  br = new BufferedReader(new FileReader("beverages.txt"));
           break;
       }
       
         StringTokenizer token;
        String t,item = "",rate = "";
        Menu c = new Menu();
       
        while((t=br.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                item = token.nextToken();
                rate = token.nextToken();
                System.out.println("\nITEM :" + item +"\t" + "RATE:" + rate);
            }
        map1.put(item,rate);
    }


    }
    public String getCode(String s){
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



    


