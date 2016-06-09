import java.util.Scanner;
import java.lang.Integer;

//

class TestCodilityNumberSolitaire {
    
    public static int solution(int N, int[] A) {
	    int[] max_val = new int[N];
	    max_val[0] = A[0];
	    
	    for (int i = 1; i < N; i++){
			max_val[i] = Integer.MIN_VALUE;
	    }    

	    for (int pos = 0; pos < N - 1; pos++){
        
        	//throw the dice (1-6)
	        for (int j = 1; j <= 6; j++){
    	        //if out of range, neglect.
        	    int jump_pos = pos + j;
            
            	//not to jump out of the range.
	            if (jump_pos >= N){
    	            continue;
        	    }
            
            	//update each cell's max value.
	            int tmp = A[pos + j] + max_val[pos];
    	        max_val[jump_pos] = max_val[jump_pos] < tmp ? tmp : max_val[jump_pos];

    	        System.out.print("["+pos+","+jump_pos+"] ");
				for (int i : max_val) {
					System.out.print(String.valueOf(i)+ " ");
				}
				System.out.println(" ");
        	}
    	}
    
	    return max_val[N - 1];
    
    }
    
    public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
		
		System.out.print(solution(n,a));
    }
}