import java.io.*;
import java.util.Scanner;

public class TestC3 {

	public static String solution(String S) {
       String phone = S.trim().replace(" ", "").replace("-", "");
       
       int tailCount = 0;
       
       switch (phone.length() % 3) {
       	case 1:
       		tailCount = 4;
		break;
       	case 2:
       		tailCount = 2;
       	default:
       		break;
       }
       
       String head = phone.substring(0, phone.length()-tailCount);
       String tail = phone.substring(phone.length()-tailCount);
       
//       System.out.println(head);
//       System.out.println(tail);
       
       String formatted = "";
       for(int i=0; i<head.length(); ) {
    	   if(i > 0) {
    		   formatted += "-";
    	   }
    	   formatted += head.subSequence(i, i+3);
    	   i+=3;
       }
       
       if(tail.length() > 0) {
    	   if(formatted.length() > 0) {
    		   formatted += "-";
    	   }
    	   for(int i=0; i<tail.length(); ) {
        	   if(i > 0) {
        		   formatted += "-";
        	   }
        	   formatted += tail.subSequence(i, i+2);
        	   i+=2;
           }
       }
       
       return formatted;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        System.out.println(solution(s));
    }
    
    
}

//004-448-555-583-61 -> 004-448-555-583-61
//0 - 22 1985---324 -> 022-198-53-24
//555372654 -> 555-372-654