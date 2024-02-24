package collectionworking;

import java.util.HashMap;


import java.util.Scanner;
/*
 * This class UserPassCheck checks the 
 * username and password 
 * 
 * @author Roshini Kathirvel(Expleo)
 * @Since 04 FEB 2024
 */

class Invalid extends Exception {
    public Invalid(String msg) {
        super(msg);
    }
}
class User {
    private String fullname;
    private String password;

    User(String fullname, String password) {
        this.fullname = fullname;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class UserPassCheck {

    public static void main(String[] args) {
        HashMap<String, User> hs = new HashMap<>();
        hs.put("icrane", new User("Ichabod Crane", "Qwerty123"));
        hs.put("bbones", new User("Brom Bones", "Pass456!"));
        hs.put("epokeman", new User("Emboar Pokeman", "Password123"));
        hs.put("rpokemon", new User("Rayquazza Pokeman", "Drow456"));
        hs.put("cdude", new User("Cool Dude", "Dh456!32"));
        Scanner sc = new Scanner(System.in);
        try {
            for (int i=0;i<3;i++) {
                System.out.println("Enter your Login: ");
                String user = sc.next();
                if (hs.containsKey(user)) {
                    User us = hs.get(user);
                    System.out.println("Enter your Password: ");
                    String password = sc.next();
                    if(us.getPassword().equalsIgnoreCase(password)) {
                        System.out.println("Login Successful!!");
                        System.out.println("Welcome " + us.getFullname());
                        break;
                    } else {
                        throw new Invalid("Wrong password");
                    }
                } else {
                    throw new Invalid("Wrong Username");
                }
            }
        } catch (Invalid e) {
            System.out.println(e.getMessage());
        } 
    }
}
