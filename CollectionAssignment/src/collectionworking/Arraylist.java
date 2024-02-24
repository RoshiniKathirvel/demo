package collectionworking;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr1;
		for(int i=0;i<num;i++) {
			arr1=sc.nextInt();
			al.add(arr1);
		}
		System.out.println("Normal add");
		System.out.println(al);
        ArrayList<Integer> all=new ArrayList<>();
       all.add(7);
       all.add(9);
       all.add(4);
       System.out.println("copying the element with specify the index value");
       all.addAll(1,al);
       System.out.print(all);
       System.out.println("Removing element in an array");
       all.remove(4); //depicts the index(remove the index value in the number)
       System.out.println(all);
       System.out.println("Specifying the codition to remove in the list");
       all.removeIf(j->(j%2==0));
       System.out.println(all);
       System.out.println("Remove all compare all and al and print the remaining in all");
       all.removeAll(al);
       System.out.println(all);
       System.out.println("retainall");
       all.add(1);
       all.add(2);
       all.retainAll(al);//compare the elements with all and al and print the common in it
       System.out.println(all);
       System.out.println("Size in the 2 collection");
       System.out.println(all.size());
//       all.clear();
//       System.out.println(all);
       
	}

}
