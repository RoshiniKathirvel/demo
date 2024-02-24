package collectionworking;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
/*
 * This class PhoneDirectory display the phone number details
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */
public class PhoneDirectory {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
        System.out.println("1.add Phone Number to the Directory");
        System.out.println("2.Update the phone Number in the Directory");
        System.out.println("3.Display the Phone numbers");
        System.out.println("4.Exit");
        System.out.println("Enter your Choice:");
        int num=sc.nextInt();
        switch(num) {
        case 1:
        	System.out.println("Enter your name");
        	String name=sc.next();
        	System.out.println("Enter your mobile number");
        	String phone=sc.next();
        	hm.put(name, phone);
        	break;
        case 2:
        	
        	System.out.println("Enter the name to update the phone number");
        	String mn=sc.next();
        	if(hm.containsKey(mn)) {
        		System.out.println("Enter the mobile number");
        		String newnum=sc.next();
        		hm.put(mn,newnum);
        	}
        	else {
        		System.out.println("Name not present the phone directory");
        	}
        	break;
        case 3:
        	System.out.println("Displaying the details");
        	for(Map.Entry<String,String> me:hm.entrySet()) {
        		System.out.println(me.getKey()+" "+me.getValue());
        	}
        	break;
        	
        case 4:
        	System.out.println("EXIT");
        	System.exit(0);
        }
	}
	}
}
