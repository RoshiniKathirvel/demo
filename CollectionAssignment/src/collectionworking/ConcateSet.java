package collectionworking;
import java.util.Set; 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
/*
 * This class ConcatSet display the and
 * store the whole string
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */
public class ConcateSet {

	public static void main(String[] args) {
		Set<String> st=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			String s=sc.next();
			st.add(s);
		}
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
        StringBuilder sb=new StringBuilder();
        for(String sto:st) {
        	sb.append(sto);
        }
        System.out.println(sb.toString());
	}

}
