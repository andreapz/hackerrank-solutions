import java.util.*;
import java.io.*;

// Java 1D Array (Part 1)
// https://www.hackerrank.com/challenges/java-1d-array-easy

class Test11{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

		int n;
		int[] l = new int[t];
		
        for(int i=0; i<t; i++) {
			l[i] = sc.nextInt();	
		}
		
		int count;
		int negative = 0;
		for(int i=0; i<t; i++) {
			count = 0;
			for(int j=i; j<t; j++) {
				count += l[j];
				if(count < 0) {
					//System.out.println("["+i+":"+j+"]");
					negative++;
				}
			}
		}
		System.out.println(negative);
    }
}