import java.util.*;
import java.io.*;

// Java 1D Array (Part 2)
// https://www.hackerrank.com/challenges/java-1d-array

class Test12{

	public static boolean check(int size, int n, int m, int[] l) {
		if(n==1) {
			return l[0] == 0;
		}
		
		if(l[n-1] == 1) {
			return check(size,n-1,m,l);
		}
		
		for(int i=n-1; i<n; i++) {
			
		}
	}

    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();	
			int[] l = new int[n];		
			
			for(int i=0; i<n; i++) {
				l[i] = sc.nextInt();	
			}
			
			System.out.println( check(n,n,m,l) ? "YES" : "NO");
			
		}
    }
}