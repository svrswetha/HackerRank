package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

	    static int birthdayCakeCandles(int n, int[] ar) {
	        // Complete this function
	    	
	    	int max = 0, count = 0;
	    	for (int i = 0; i < ar.length; i++) {
	    	    int num = ar[i];
	    	    if (num == max) {
	    	        count++;
	    	    } else if (num > max) {
	    	        max = num;
	    	        count = 1;
	    	    }
	    	}

	    return count;
	    }
	    

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);
	    }
	}



