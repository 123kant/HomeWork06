package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user01 = new User("ouser01", "qwerty123", UserType.ADMIN);
        User user02 = new User("auser02", "qwerty123", UserType.AUTHORIZED);
        User user03 = new User("buser03", "qwerty123", UserType.PREMIUM);
        User user04 = new User("kuser04", "qwerty123", UserType.AUTHORIZED);
        User user05 = new User("auser05", "qwerty123", UserType.AUTHORIZED);
        User user06 = new User("nuser06", "qwerty123", UserType.AUTHORIZED);
        User user07 = new User("cuser07", "qwerty123", UserType.PREMIUM);
        User user08 = new User("xuser08", "qwerty123", UserType.GUEST);
        User user09 = new User("huser09", "qwerty123", UserType.GUEST);
        User user10 = new User("duser10", "qwerty123", UserType.GUEST);


        System.out.println("Homework #6");
        System.out.println(user01.equals(user02));
        System.out.println(user02.equals(user03));

        System.out.println(user01.hashCode());
        System.out.println(user02.hashCode());
        System.out.println(user01.getType().getPriorityNumber());
        //System.out.println(UserType.ADMIN.getPriorityNumber());

        System.out.println("Homework #7");
        System.out.println("ArrayList из 10 объектов Users и hashcode этих объектов");

        List<User> users = new ArrayList<>();
        users.add(user01);
        users.add(user02);
        users.add(user03);
        users.add(user04);
        users.add(user05);
        users.add(user06);
        users.add(user07);
        users.add(user08);
        users.add(user09);
        users.add(user10);

        for (User user : users) {
            System.out.println("hashCode: " + user.hashCode() + " for login: " + user.getLogin());
        }

        System.out.println("Отсортированные по priority и login в порядке возрастания");

        Comparator<User> userComparator = (user1, user2) -> {
            int thisPriorityNumber = user1.getType().getPriorityNumber();
            int priorityNumber = user2.getType().getPriorityNumber();

            if (thisPriorityNumber < priorityNumber) {
                return -1;
            }
            if (thisPriorityNumber > priorityNumber) {
                return 1;
            }

            return user1.getLogin().compareTo(user2.getLogin());
        };

        Set<User> userSet1 = new TreeSet<>(userComparator);
        userSet1.addAll(users);
        for (User user : userSet1) {
            System.out.println("login: " + user.getLogin() + " type: " + user.getType());
        }
    }
}
