package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.*;
public class Diagonal_Difference {
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	            }
	        }
	        int m=n,n1=n,i,sum=0,a1=0;
	        	if(m==n1) {
	        		for(i=0;i<m;++i) {
	        			sum = sum+ a[i][i];
	        			a1= a1+ a[i][m-i-1];
	        		}
	        		System.out.println("The main diagonal sum is"+sum);
	        		System.out.println("The non prime diagonal sum is"+a1);
	        	}
	        //	else {
	        	//	System.out.println("The given is not square matrix");
	        	//}
	       
	       System.out.println(Math.abs(a1-sum));
	        
	}
	
}
	        	
