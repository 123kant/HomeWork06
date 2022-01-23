package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("user1", "qwerty123", UserType.GUEST);
        User user2 = new User("user2", "qwerty123", UserType.AUTHORIZED);
        User user3 = new User("user3", "qwerty123", UserType.PREMIUM);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.getType().getPriorityNumber());
        //System.out.println(UserType.ADMIN.getPriorityNumber());
    }
}
