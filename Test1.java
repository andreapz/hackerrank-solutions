import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");

			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int x3 = sc.nextInt();

			boolean b = false;
			if(x1 == x2 && x2 == x3) {
				b = true;
			}
			System.out.println(b);          
            System.out.println("================================");

    }
}
