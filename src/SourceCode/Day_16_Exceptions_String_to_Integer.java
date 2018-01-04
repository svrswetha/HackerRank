import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_16_Exceptions_String_to_Integer{
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
        int number = Integer.parseInt(S);   
        System.out.print(number);
         }
        catch(NumberFormatException e) {
          
         System.out.print("Bad String");
        }
     
}
}