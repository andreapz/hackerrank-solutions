

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TestC1 {

	public static int solution(int[] A) {
        static Point pMax = new Point(0,1); 
		static Point pi = new  Point(0,1);
		
		for(int i=1; i<A.length; i++) {
			if(A[i] > A[i-1]) {
				pi.count++;
			} else {
				if(pi.count > pMax.count) {
					pMax.update(pi);
					pi.update(i);
				}
			}
		}
		
		return pMax.position;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
		
        for(int i=0; i < n; i++){
			a[i] = in.nextInt();
        }

        System.out.println(solution(a));
    }
    
    class Point {
    	int position;
    	int count;
    	
    	Point(int positon, int count) {
    		this.position = positon;
    		this.count = count;
    	}
    	
    	public void update(Point p) {
    		this.position = p.position;
    		this.count = p.count;
    	}
    	
    	public void update(int position) {
    		this.position = position;
    		this.count = 1;
    	}
    }
}






