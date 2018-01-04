import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day_9_Recursion {

public static int factorial(int number) {
    int fact =0;
    if(number ==1){
      return 1;
    }
    else{
     fact =  number * factorial(number - 1);
   
    }
     return fact;
}
    
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int f = factorial(N);
        System.out.println(f);
    }
}