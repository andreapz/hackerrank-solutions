import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SolutionHash {
	
	
	
	public static String[] lista(String[][] itemAssociation, int n) {
		List<Set<String>> items = new ArrayList<>();
		
		for (String[] s : itemAssociation) {
			System.out.println(s);
		}
		
		for (String[] itemAssociationPars : itemAssociation) {
			for (Set<String> itemSet : items) {
				if(itemSet.contains(itemAssociationPars[0])) {
					itemSet.add(itemAssociationPars[1]);
				} else if(itemSet.contains(itemAssociationPars[1])) {
					itemSet.add(itemAssociationPars[0]);
				}
				else {
					Set<String> s = new HashSet<>();
					s.add(itemAssociationPars[0]);
					s.add(itemAssociationPars[1]);
					items.add(s);
				}
			}
		}
		
		int count = 0;
		Set<String> ret = null;
		
		
		for (Set<String> currentSet : items) {
			if(currentSet.size() > count) {
				count = currentSet.size();
				ret = currentSet;
			}
		}
		
		String[] list = new String[count];
		int i = 0;
		if(count > 0) {	
			for (String r : ret) {
				list[i++] = r;
				System.out.println(list[i-1]);
			}
		}
		
		
				
		return list;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String[][] game = new String[n][2];
		for (int i = 0; i < n; i++) {
			game[i][0] = scan.next();
			game[i][1] = scan.next();
		}

		lista(game, n);
		

		scan.close();
	}
}
