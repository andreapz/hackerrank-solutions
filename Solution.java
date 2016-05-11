import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            // System.out.println("12345678901234567890");					
            for(int i=0;i<1; i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                String s;
               
                for(int j=0; j<15; j++) {
					if(s1.length() == j + 1) {
						s = s1.substring(j);
					} else if(s1.length() > j + 1) {
						s = s1.substring(j, j+1);
					} else {
						s = " ";
					}
					
					System.out.print(s);
                }
					
					System.out.printf("%3d\n",x);          

            }
            System.out.println("================================");

    }
}
