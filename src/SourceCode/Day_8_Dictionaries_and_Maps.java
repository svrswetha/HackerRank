import java.util.*;
import java.io.*;
import java.util.HashMap;

public class Day_8_Dictionaries_and_Maps{
    public static void main(String []args){
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> PhoneBook = new HashMap<String,Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            PhoneBook.put(name,phone);
            }
        
         while(in.hasNext()){
            String s = in.next();
            if(!PhoneBook.containsKey(s)) {
              System.out.println("Not found");
             
            }
            else {
              System.out.println(s+ "="+ PhoneBook.get(s)); 
            }
            
         } 
        
        in.close();
    }
      
}
