import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Java End-of-file
// https://www.hackerrank.com/challenges/java-end-of-file

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String s = "";
        while(sc.hasNextLine()) {
            s = sc.nextLine();
            System.out.println((i++)+" "+s);
        }
    }
}