package collectionworking;

import java.util.TreeSet; 
import java.util.Scanner;
import java.util.Iterator;
/*
 * This class MenuDriven display the 
 * some menus are given user get the values of it
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */
public class MenuDriven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<>();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add names");
            System.out.println("2. Display names in natural order");
            System.out.println("3. Display names ending with 's'");
            System.out.println("4. Display names in reverse order");
            System.out.println("5. Remove names ending with 's'");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of names to add: ");
                    int num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        ts.add(name);
                    }
                    System.out.println("Names added successfully.");
                    break;

                case 2:
                    System.out.println("Displaying names in order:");
                    if (ts.isEmpty()) {
                        System.out.println("No names to display. List is empty.");
                    } else {
                        for (String name : ts) {
                            System.out.println(name);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Displaying names ending with 's':");
                    for (String name : ts) {
                        if (name.endsWith("s")) {
                            System.out.println(name);
                           
                        }
                    }
                    
                    break;

                case 4:
                    System.out.println("Displaying names in reverse order:");
                        for (String name:ts.descendingSet()) {
                            System.out.println(name);
                        }
                  
                    break;

                case 5:
                    System.out.println("Removing names ending with 's':");
                    Iterator<String> it = ts.iterator();
                    while (it.hasNext()) {
                        String name = it.next();
                        if (name.endsWith("s")) {
                            it.remove();
                            System.out.println("Removed: " + name);
                        }
                    }
                    if (ts.isEmpty()) {
                        System.out.println("No names remaining after removal.");
                    } else {
                        System.out.println("Updated list:");
                        displayNames(ts);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);
    }

    private static void displayNames(TreeSet<String> ts) {
        for (String name : ts) {
            System.out.println(name);
        }
    }
}
