import java.util.Scanner;

//https://codility.com/demo/results/trainingYK64YV-NFM/
	
class TestCodilityFrogJmp {
	public static int solution(int X, int Y, int D) {
		int range = Y - X;
		int count = (range / D) + ((range%D > 0) ? 1 : 0); 
		return count;
    }
	
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.print(solution(x, y, d));
    }
}
