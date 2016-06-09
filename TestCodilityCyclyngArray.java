import java.util.Scanner;

//https://codility.com/demo/results/trainingWYMMTX-ZU4/
	
class TestCodilityCyclyngArray {
	public static int[] solution(int[] A, int K) {
		int n = A.length;
		
        int[] r = new int[n];
        
        for(int i=0; i<n; i++) {
        	r[(i+K)%n] = A[i];
        }
        
        return r;
    }
	
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
		
		int[] r = solution(a,k);
		for (int i : r) {
			System.out.print(String.valueOf(i)+ " ");
		}
    }
}