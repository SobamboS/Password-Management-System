package com.passwordmanagement.User.validator;

public class PasswordValidator{

    static boolean isValidEmail(String email){
        return email.contains("@");
    }

    public  static boolean isValidPassword(String password){
        return  password.matches("[a-zA-Z0-9(@#$!_)]{12,20}");
    }
}
