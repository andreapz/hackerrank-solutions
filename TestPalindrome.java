public class TestPalindrome {
    public static boolean isPalindrome(String word) {
        
        for(int h = 0, t = word.length() -1; t > h; h++, t--) {
	        //System.out.println(word.toUpperCase().charAt(h)+"-"+word.toUpperCase().charAt(t));
        	if(word.toUpperCase().charAt(h) != word.toUpperCase().charAt(t)) {
	        	return false;
    	    }
    	}
        
        return true;
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    
    public static void main(String[] args) {
        System.out.println(TestPalindrome.isPalindrome("Deleveled"));
    }
}

