// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Point pMax = new Point(0,1); 
		Point pi = new  Point(0,1);
		
		for(int i=1; i<A.length; i++) {
			if(A[i] > A[i-1]) {
				pi.count++;
			} else {
				if(pi.count > pMax.count) {
					pMax.update(pi);
				}
				pi.update(i);
			}
			
			System.out.println(pMax.position+","+pMax.count+" "+pi.position+","+pi.count);
		}
		System.out.println(pMax.position);
		return pMax.position;
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