package com.example.caixinzhu.testfirebase;

/**
 * Created by caixinzhu on 5/31/17.
 */

public class User {

    private String displayname;
    private String email;
    private String firstname;
    private String lastname;
    private String password;

    public User() {
    }

    public User(String d, String e,String f, String l, String p) {
        displayname = d;
        email = e;
        firstname = f;
        lastname = l;
        password = p;
    }

    public User(String e, String p) {
        email = e;
        password = p;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDisplayname() {
        return displayname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
