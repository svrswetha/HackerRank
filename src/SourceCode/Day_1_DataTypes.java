import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_1_DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		    Scanner scan = new Scanner(System.in);
       
        int result = scan.nextInt();
        System.out.println(i+result);
        
        double di = scan.nextDouble();
        String s2 = null;
        System.out.println(d + di);
         while(scan.hasNextLine()){
               s2 =scan.nextLine();
         }
        String res = s.concat(s2);
        System.out.println(res);
     
      scan.close();
    }
}
    
 