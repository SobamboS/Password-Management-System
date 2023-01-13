package com.passwordmanagement.User.validator;

public class UserValidator{

   public static boolean isValidEmail(String email){
        return email.contains("@");

        //return email.contains("@");
    }


    public static boolean isValidPassword(String password){
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*_?&])[A-Za-z\\d@$!%*_?&]{8,20}$");
    }
}
