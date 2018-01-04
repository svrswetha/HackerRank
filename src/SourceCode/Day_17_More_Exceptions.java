import java.util.*;
import java.io.*;
import java.math.*;

class Calculator {
        public int power(int num, int pow1) {
          int result=0;
         if(num == 0 && pow1 == 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
          }
          
          else if(pow1 == 0 && num > 0) {
            return result = 1;
          }
          else if(num == 0 && pow1 > 0) {
            return result = 0;
          }
          
          else if( num > 0 && pow1 > 0) {
           result  = (int)Math.pow(num,pow1);
           }
        else if(num < 0 && pow1 < 0){
               throw new IllegalArgumentException("n and p should be non-negative");
        }  
        else if((num < 0 && pow1 > 0) || (num >0 && pow1 <= 0)) {
            throw new IllegalArgumentException("n and p should be non-negative");
         }
        
     return result;
    }
  }

class Day_17_More_Exceptions{
public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int t = in.nextInt();
       while (t-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
              }
          }
        in.close();
    }
}
