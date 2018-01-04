import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_10_Binary_Numbers {
  
  private static void BinaryForm(int number) {
     int binary[] = new int[40];
     //int res[]=new int[40];
     int count=0;
     int index = 0;
     while(number > 0){
       binary[index++] = number%2;
       number = number/2;
     }
      int cnt = 0,max=0;
      for(int i=0;i<binary.length;i++){
          cnt=0;
      while(i<binary.length&&binary[i]==1){
            cnt++;
            i++;
           }
   if(cnt>max) 
   max=cnt;
   }
   System.out.println(max);
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BinaryForm(n);
     
    }
}
