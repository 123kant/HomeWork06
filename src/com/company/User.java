package com.company;

//public class User implements Comparable<User> {
public class User {
    private final String login;
    private final String password;
    private final UserType type;

    public User(String login, String password, UserType type) {
        this.login = login;
        this.password = password;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        return type == user.type;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }

    public String getLogin() { return login; }

    public String getPassword() {
        return password;
    }

    public UserType getType() {
        return type;
    }
}


