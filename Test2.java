import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test2 {
	public static final Scanner sc=new Scanner(System.in);
    public static int B = getValue();
    public static int H = getValue();
    public static boolean flag = getFlag();

    private static int getValue() {
        return sc.nextInt();
    }
    
    private static boolean getFlag(){
    	if(B <= 0 || H <= 0){ 
    		System.out.print("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
	    return flag;
    }
    
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

