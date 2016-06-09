import java.util.Scanner;

class TestCodility {
    
    public static int solution(int[] A) {
	    int n = A.length;
	    boolean status = false;
		long count = 0;
		for(int i=0; i<n; i++) {
			count += A[i];
		}
    	long leftCount = 0;
    	
        for(int i=0; i<n; i++) {
        	if(i > 0) {
	    		leftCount += A[i-1];
    		}
    		count -= A[i];
    		
    		if(i==n-1) {
    			count = 0;
    		}
        
        	//System.out.println(String.valueOf(i)+" "+leftCount+" "+count);
        	
        	if(count == leftCount) {
	        	status = true;
//     			System.out.println(String.valueOf(i));
    			return i;
        	}
        }
        
    //	if(!status) {
    		System.out.println("-1");
    		return -1;
    //	}
    	
    //	return 0;
    }
    
    public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
		
		System.out.println(solution(a));
    }
}