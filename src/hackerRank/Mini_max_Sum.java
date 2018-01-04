package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Mini_max_Sum {

	    static void miniMaxSum(int[] arr) {
	    long []sum = new long[arr.length];   
	    long total =arr[0]; long min=arr[0];long max=arr[0];
	    for(int t=1;t<arr.length;t++) {
	    	    total = total+arr[t];
		    if(arr[t]<min) {
		    	min = arr[t];
		    }
		    if(arr[t]>max) {
		    	max = arr[t];
		    }
	       }
//	    System.out.println("total"+total);
//	    System.out.println("min"+min);
//	    System.out.println("max"+max);
//	    System.out.println("min sum"+Math.abs(total-min));
//	    System.out.println("max sum"+Math.abs(total-max));
   System.out.println(Math.abs(total-max)+" "+Math.abs(total-min));
	    	
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        miniMaxSum(arr);
	        in.close();
	    }
	}



