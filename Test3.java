import java.math.BigDecimal;
import java.util.*;

public class Test3{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }
		
		Arrays.sort(s, new Comparator<String>() {
        @Override
        public int compare(String a, String b) {
            BigDecimal b1 = new BigDecimal(a);
    			BigDecimal b2 = new BigDecimal(b);
    			return b2.compareTo(b1);
        }
    	});
    
		
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

}


}
