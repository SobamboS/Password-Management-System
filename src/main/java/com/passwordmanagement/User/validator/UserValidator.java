package com.passwordmanagement.User.validator;

public class UserValidator{

   public static boolean isValidEmail(String email){
        return email.matches("^(?=.{1,64}@)[\\\\p{L}\\d_-]+(\\\\.[\\\\p{L}\\d_-]+)*@[^-][\\\\p{L}\\d-]+(\\\\.[\\\\p{L}\\d-]+)*(\\\\.[\\\\p{L}]{2,})$")
                || email.matches("^[a-zA-Z\\d_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z\\d.-]+$");

    }


    public static boolean isValidPassword(String password){
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*_?&])[A-Za-z\\d@$!%*_?&]{8,20}$");
    }
}
