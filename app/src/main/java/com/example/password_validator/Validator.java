package com.example.password_validator;

public class Validator {
    private String password;

    public void setPassword(String p) {
        password = p;
    }

    public String getPassword() {
        return password;
    }

    public int check(String password) {
        int validate = 0;
        if (!password.equalsIgnoreCase("password")) {
            validate++;
        }
        if (password.length() >= 8) {
            validate++;
        }
        return validate;
    }
}
