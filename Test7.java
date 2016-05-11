import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Java Loops
//https://www.hackerrank.com/challenges/java-loops
public class Test7 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int ti = 0; ti < t; ti++){
	        int a = in.nextInt();
	        int b = in.nextInt();	        
            int n = in.nextInt();
			
			int res = a + b;
			System.out.print(res);  
			
			int npow = 1;
			for(int i=1; i < n; i++){
				npow *= 2;
				res += npow * b;
				System.out.print(" "+res);  	    
            }
			System.out.println("");  	    
        }
    }
}



