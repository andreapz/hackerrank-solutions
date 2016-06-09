import java.io.*;
import java.util.*;

public class TestC2 {
// 7 3 6 1 3 1 4 2 5
// 3 3 6 1 3 1 4 2 5
// 4 3 6 1 3 1 4 2 5
	
	public static int solution(int[] A, int X, int D) {
        int pi=0;
        int t=0;
        
        if(D >= X) {
        	return t;
        }
		
		for(int k=0; k<A.length; k++) {
			if((A[k] > pi) && (A[k] - pi <= D)) {
				pi = A[k];
				t = k;
			}
			
			if(X - pi <= D) {
				return t;
			}
		}
		
		return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();

        int[] a = new int[n];
		
        for(int i=0; i < n; i++){
			a[i] = in.nextInt();
        }

        System.out.println(solution(a, x, d));
    }
}






