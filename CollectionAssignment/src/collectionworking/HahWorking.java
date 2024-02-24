package collectionworking;
import java.util.Iterator; 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
/*
 * This class HahWorking display the 
 * mark greater than 75
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */

public class HahWorking {

	public static void main(String[] args) {
		LinkedHashMap<String,Double> marks = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			String name = sc.next();
			double mark = sc.nextDouble();
			marks.put(name, mark);
		}
		
		pushingOperation(marks);
	}
	
	public static void pushingOperation(LinkedHashMap mark) {
		
		Stack<String> arr = new Stack<>();
		Iterator<Map.Entry<String,Double>> it =mark.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,Double> itr = it.next();
			
			if((itr.getValue())>75) {
				arr.push(itr.getKey());
			}
		}
		
		display(arr);
	}
	
	public static void display(Stack arr) {
		
		Iterator<String> iter = arr.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		while(iter.hasNext()) {
			iter.next();
			arr.pop();
		}
		
	}

}