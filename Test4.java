import java.util.*;

public class Test4 {   

   public static boolean stack(List<String> s) {		
   	 for(int i=1; i<s.size(); i++) {
     	 
   	 	String a = s.get(i-1);
   	 	String b = s.get(i);
   	 	//System.out.println(a+"-"+b);
   	 	   	 	
		if((a.equals("{")  && b.equals("}"))
			|| (a.equals("[")  && b.equals("]"))
			|| (a.equals("(")  && b.equals(")"))) {
			s.remove(i);
			s.remove(i-1);			
			//System.out.println(a+"-"+b+" OK");
			return true;
		}
	}
	
	return false;
   }

   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
	      
      while (sc.hasNext()) {
        String input=sc.next();
		List<String> s = new ArrayList<>();
		
		for(int i=0; i<input.length(); i++) {
			s.add(String.valueOf(input.charAt(i)));
		}
		
		boolean status = true;
		
		while(s.size()>0 && status) {
			/*for(int i=0; i<s.size(); i++) {
			System.out.print(s.get(i));
			 }
			 System.out.println("");
			 */
			 			
			status = stack(s);
		}
		
		System.out.println(status);


      }
      
   }
}

