import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test6 {

	public static boolean value(int[] a, int n, int r) {
		int l = 0;
	
		r -= a[0];

		for(int i=1; i<n - 1; i++) {
			r -= a[i];
			l += a[i-1];
			
			if(l == r) {
            	return true;
            }        
        }
        return false;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            int[] a = new int[n];
			int r = 0;
			
            for(int i=0; i < n; i++){
    			a[i] = in.nextInt();
    			r += a[i];
            }

            boolean status = (n == 1) ? true : value(a,n,r);
            
            if(status){
                System.out.println("YES");
            } else {
                System.out.println("NO");                
            }
        }
    }
}



