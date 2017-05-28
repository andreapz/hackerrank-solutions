import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SolutionHash {

	public static String[] lista(String[][] itemAssociation, int n) {
		List<Set<String>> items = new ArrayList<>();

		for (String[] itemAssociationPars : itemAssociation) {
			
//			System.out.println(itemAssociationPars[0] + " " + itemAssociationPars[1]);

			boolean b = false;
			for (Set<String> itemSet : items) {
				if (itemSet.contains(itemAssociationPars[0])) {
					itemSet.add(itemAssociationPars[1]);
//					System.out.println("+ " + itemAssociationPars[1]);
					b = true;
				} else if (itemSet.contains(itemAssociationPars[1])) {
					itemSet.add(itemAssociationPars[0]);
//					System.out.println("+ " + itemAssociationPars[0]);
					b = true;
				}
			}
			if (!b) {
				Set<String> s = new HashSet<>();
				s.add(itemAssociationPars[0]);
				s.add(itemAssociationPars[1]);
				items.add(s);
//				System.out.println("+ " + itemAssociationPars[0] + "," + itemAssociationPars[1]);
			}
		}

		int count = 0;
		Set<String> ret = null;

		for (Set<String> currentSet : items) {
			if (currentSet.size() > count) {
				count = currentSet.size();
				ret = currentSet;
			}
		}

		String[] list = new String[count];
		
		if (count > 0) {
			int i = 0;	
			for (String r : ret) {
				list[i++] = r;
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

		String[] l = lista(game, n);
		if (l != null) {
			for (int i = 0; i < l.length; i++) {
				System.out.print(l[i] + ", ");
			}
		} else {
			System.out.print("-");
		}
		System.out.println("");
		scan.close();
	}
}
