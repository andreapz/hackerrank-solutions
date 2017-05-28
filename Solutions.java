import java.util.Scanner;

public class Solutions {
	public static boolean isInteger(String s) {
        if(s==null || s.length() == 0) {
            return false;
        }
        
        
        for(int i=0; i<s.length(); i++) {
        	
            if(i==0 && s.charAt(i) == '-' ) {
                if(s.length() == 1) {
                    return false;
                }
                else {
                    continue;
                }
            }
            
            System.out.println("i:"+s.charAt(i));
            
            if(s.charAt(i) >= '0' && s.charAt(i) <= 9) {
            	System.out.println(":"+s.charAt(i));
                continue;   
            }
            return false;
        }
        return true;
    }
    
    
	public static int totalScore(String[] blocks, int n)
    {
		int currentScore = 0;
        int total = 0;
        int[] score = new int[n];
        
        for(int i=0; i<n; i++) {
            String s = blocks[i];
            System.out.println(s);
            
            boolean isInt = false;
            try {
            	Integer.parseInt(s);
            	isInt = true;
            } catch (Exception e) {
				// TODO: handle exception
			}
            
            if(isInt) {
            	
                currentScore = Integer.parseInt(s);
                
                total += currentScore;
                score[i] = currentScore;
            } else if (s.equals("X")) {
                if(i>0) {
                    currentScore = score[i-1] * 2;
                } else {
                    currentScore = 0;
                }
                total += currentScore;
                score[i] = currentScore;
            } else if(s.equals("+")) {
                if(i>1)  {
                    currentScore = score[i-1] + score[i-2] ;
                } else {
                    currentScore = 0;
                }
                total += currentScore;
                score[i] = currentScore;
            } else if(s.equals("Z")) {
                if(i>1)  {
                    currentScore = -1 * score[i-1];
                    total += currentScore;
                    System.out.println("Z t:"+total+ " c:"+currentScore);
                    score[i-1] = score[i-2];
                    score[i] = score[i-1];
                } else {
                    currentScore = 0;
                }
            }
            
            System.out.println("t:"+total+ " c:"+currentScore);
            
        }
        
        
        return total;
        
        
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			int n = scan.nextInt();
			
			String[] game = new String[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.next();
			}

			System.out.println(totalScore(game, n));
		
		scan.close();
	}
}
