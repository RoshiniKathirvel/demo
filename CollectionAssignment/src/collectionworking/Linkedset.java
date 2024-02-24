package collectionworking;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
import java.util.Scanner;
public class Linkedset {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<>();
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

