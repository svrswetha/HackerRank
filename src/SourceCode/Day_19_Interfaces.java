import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
  }
class Calculator implements AdvancedArithmetic {
     public int divisorSum(int n) {
			  for(int i=1;i<=n;i++)
        {
          // If remainder is 0 when 'n' is divided by 'i',
            if(n%i==0)
            {
            System.out.print(i+", ");
            }
        }
    
  	    int sum=0;
			  int j=1;
        while(j<=n)
        {
            if(n%j==0)
            sum=sum+j;
            j++;
        }
       return sum;
		 }
   }

class Day_19_Interfaces{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}