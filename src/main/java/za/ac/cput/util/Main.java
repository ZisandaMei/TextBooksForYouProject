package za.ac.cput.util;


import za.ac.cput.domain.User;
public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("1234", "john_doe", "password")
                .userType("buyer")
                .build();

        System.out.println(user.toString());
        System.out.println("User ID: " + user.getUserID());
        System.out.println("Username: " + user.getUsername());
        System.out.println("User Type: " + user.getUserType());
        System.out.println("Password: " + user.getPassword());

    }
}
