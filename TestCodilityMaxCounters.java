import java.util.Scanner;

//https://codility.com/demo/results/trainingCFJ5MW-26E/

class TestCodilityMaxCounters {
    
    public static int[] solution(int N, int[] A) {
	    int[] r = new int[N];
	    int counter = 0;
	    
	    for (int i : A) {
	    	if((i-1) < N) {
	    		r[(i-1)]++;
	    		counter = Math.max(counter, r[(i-1)]);
	    	} else {
	    		for (int j = 0; j<N; j++) {
	    			r[j] = counter;
	    		}
	    	}
	    	
	    	/*for (int s : r) {
				System.out.print(String.valueOf(s)+ " ");
			}
	    	System.out.println("["+counter+"]");*/
		}
	    
	    return r;
    }
    
    public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[t];
        
        for(int i=0; i<t; i++) {
            a[i] = sc.nextInt();
        }
		
		int[] r = solution(n,a);
		for (int i : r) {
			System.out.print(String.valueOf(i)+ " ");
		}
    }
}