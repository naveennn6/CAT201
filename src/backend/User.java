package com.yourpackage;

public class User {
    private String fullName; // New field
    private String email;
    private String password;

    // Constructor
    public User(String fullName, String email, String password) {
        this.fullName = fullName; // Initialize fullName
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getFullName() {
        return fullName; // Getter for fullName
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
