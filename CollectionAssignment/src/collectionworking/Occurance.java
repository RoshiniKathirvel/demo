package collectionworking;

import java.util.LinkedHashMap; 
import java.util.Scanner;
/*
 * This class Occurance display the 
 * occurance of letter and print the count
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */
public class Occurance {

	public static void main(String[] args) {
		LinkedHashMap<Character,Integer> lhs=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int counta=0,countc=0,counto=0,counts=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				counta++;
				lhs.put('a',counta);
			}
			else if(str.charAt(i)=='c') {
			  countc++;
			  lhs.put('c',countc);
			}
			else if(str.charAt(i)=='o') {
				counto++;
				lhs.put('o',counto);
			}
			else if(str.charAt(i)=='s') {
				counts++;
				lhs.put('s',counts);
			}
		}
		System.out.println(lhs);

	}

}
