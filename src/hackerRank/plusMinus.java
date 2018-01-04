package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class plusMinus {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        double a=0,b=0,c=0;
	        for(int arr_i=0; arr_i < n; arr_i++){
	            if(arr[arr_i]>0) {
	            	a++;
	            }
	            else if(arr[arr_i]<0) {
	            	b++;
	            }
	            else if(arr[arr_i]==0) {
	            	c++;
	            }
	        }
	        System.out.printf("%.6f\n",a/n);
	        System.out.printf("%.6f\n",b/n);
	        System.out.printf("%.6f\n",c/n);
	    
	    }
}



