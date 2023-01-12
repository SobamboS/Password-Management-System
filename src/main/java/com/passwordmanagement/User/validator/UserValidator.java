package com.passwordmanagement.User.validator;

public class UserValidator{

    static boolean isValidEmail(String email){
        return email.matches("^[a-zA-Z\\d_+&*-] + (?:\\\\.[a-zA-Z\\d_+&*-] " +
                "+ )*@(?:[a-zA-Z\\d-]+\\\\.) + [a-zA-Z]{2,7}");

        //return email.contains("@");
    }


    public static boolean isValidPassword(String password){
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*_?&])[A-Za-z\\d@$!%*_?&]{8,20}$");
    }
}
