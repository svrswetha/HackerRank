import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  public Difference(int []elements) {
  	  this.elements=elements;
  	}
  	public int computeDifference() {
  	 // int maximumDifference=-1;
  	 int max1=0;
  	 int diff=0;
     maximumDifference = -2;
  	 int n1= elements.length;
  	  for(int i=0;i<n1-1;i++) {
  	    for(int j=i+1;j<n1;j++) {
  	        diff = elements[i] - elements[j] ;
  	        max1=Math.abs(diff);
  	        if(maximumDifference < max1) {
  	            maximumDifference = max1;
  	        }
  	  }
  	}
  	return maximumDifference;
}
} // End of Difference class

public class Day_14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}