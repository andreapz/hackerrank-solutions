import java.io.*;
import java.util.*;

// Java String Token
// https://www.hackerrank.com/challenges/java-string-token

public class Test10 {
      
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        String regex = "[ !,?.\\\\_'@]+"; 
        s = s.replace("\\","\\\\");
        int count = 0;
        int step = 0;
        String[] splitted = s.split(regex);
        count = splitted.length;
        if(splitted.length > 0 && splitted[0].length() == 0) {
            count--;
            step++;
        }
        System.out.println(count);
        for(int i=step; i<count+step; i++) {
            System.out.println(splitted[i]);
        }            
    }
}
