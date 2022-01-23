package com.company;

public enum UserType {
    ADMIN(0),
    PREMIUM(1),
    AUTHORIZED(2),
    GUEST(3);
    private final int priorityNumber;

    public int getPriorityNumber() {
        return priorityNumber;
    }

    UserType(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }
}

