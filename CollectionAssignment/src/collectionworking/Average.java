package collectionworking;
import java.util.TreeSet;
import java.util.Scanner;
/*
 * This class Average display the average 
 * highest number and lowest number
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */
public class Average {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		int sum=0,avg=0,high=0,low=0;
		boolean fg=true;
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			int num=sc.nextInt();
			ts.add(num);
		}
		for(int sto:ts) {
			sum+=sto;
			if(sto>high) {
				high=sto;
			}
			if(fg||sto<low) {
				low=sto;
				fg=false;
			}
		}
		avg=sum/size;
		System.out.println("Average is"+avg);
		System.out.println("Highest number is"+high);
		System.out.println("Lowest Number is "+low);
        for(int even:ts) {
        	if(even%2==0) {
        		System.out.println(even);
        	}
        }
	}

}
