package collectionworking;
import java.util.*;
public class Oprations {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> all=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("First collection: "+al);
		all.add(5);
		all.add(6);
		all.add(3);
		all.add(7);
		System.out.println("Second Collection:"+all);
		all.set(3,15); //used to replace with 3rd index of 15
		System.out.println("Using set is: "+all);
	    System.out.println("Contains method ");
		if(al.contains(2)) { //it chceks with only one element
			System.out.println("contains that");
		}
		else {
			System.out.println("Not contains it");
		}
		System.out.println("Contains all method");
		if(al.containsAll(all)) { //all elements should be there in the al then prints true
			System.out.println(all);
		}
		else {
			System.out.println("not present in the 2 collections");
		}
	}

}
