package collectionworking;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.Iterator;
/*
 * This class ArrayLength display the name
 * whose length is less than 5 can be removed
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */
public class ArrayLength {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			//String str=sc.next();
			al.add(sc.next());
		}
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			String ele=it.next();
			if(ele.length()<=5) {
				it.remove();
			}
		}
		for(String st:al) {
			System.out.println(st);
		}
	}

}
