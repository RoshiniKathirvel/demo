package collectionworking;

import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String str=sc.nextLine();
			hs.add(str);
		}

		System.out.println(hs);
		System.out.println(hs.clone());
		System.out.println(hs.size());
		Iterator<String> is=hs.iterator();
		while(is.hasNext()) {
			String store=is.next();
			System.out.println(store);
		}

	}

}
