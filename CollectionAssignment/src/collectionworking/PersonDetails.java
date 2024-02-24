package collectionworking;

import java.util.PriorityQueue;

import java.util.Scanner;
import java.util.Comparator;
/*
 * This class PersonDetails display the 
 * details of the person sorted with the 
 * first name
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */
class Person {
    private String firstname;
    private String lastname;

    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String toString() {
        return "First Name: " + firstname + "\n Last Name: " + lastname;
    }
}

class FirstName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getFirstName().compareTo(p2.getFirstName());
    }
}

public class PersonDetails {

    public static void main(String[] args) {
        PriorityQueue<Person> pq = new PriorityQueue<>(new FirstName());
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            String firstname = sc.next();
            String lastname = sc.next();
            pq.add(new Person(firstname, lastname));
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
