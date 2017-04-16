import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
    int numOfWords = s.nextInt();
    String[] str = new String[numOfWords];
    
    for (int i = 0; i < numOfWords; i++) {
      String even = "";
      String odd = "";
      str[i] = s.next();
      for(int j = 0; j <  str[i].length(); j++) {
       if(j%2 == 0) {
          even = even + str[i].charAt(j);
       }
       else {
          odd = odd + str[i].charAt(j);
       }
      }
      str[i] = even + " " + odd;
    }
    for(int i = 0; i < numOfWords; i++) {
      System.out.println(str[i]);
    }
    }
}