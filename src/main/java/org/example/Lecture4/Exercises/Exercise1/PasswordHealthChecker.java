package org.example.Lecture4.Exercises.Exercise1;

import java.util.ArrayList;

public class PasswordHealthChecker {

    String password;

    PasswordHealthChecker(String password){
        this.password = password;
    }

    public boolean hasUpper()
    {
        for (int i=0; i<this.password.length(); i++)
        {
            String singleLetter = String.valueOf(this.password.charAt(i));

            if (isNumber(singleLetter)){
                continue;
            }

            if (isSpecialSymbol(singleLetter)){
                continue;
            }

            String upperCaseLetter = singleLetter.toUpperCase();

            if (singleLetter.equals(upperCaseLetter)){
                return true;
            }
        }
        return false;
    }
    public boolean hasLower()
    {
        for (int i=0; i<this.password.length(); i++)
        {
            String singleLetter = String.valueOf(this.password.charAt(i));

            if (isNumber(singleLetter) || isSpecialSymbol(singleLetter)){
                continue;
            }

            String lowerCaseLetter = singleLetter.toLowerCase();

            if (singleLetter.equals(lowerCaseLetter)){
                return true;
            }
        }
        return false;
    }
    public boolean hasDigit()
    {
        for (int i=0; i<this.password.length(); i++)
        {
            String singleLetter = String.valueOf(this.password.charAt(i));

            if (isNumber(singleLetter)){
                return true;
            }
        }
        return false;
    }
    public boolean hasSpecial()
    {
        for (int i=0; i<this.password.length(); i++)
        {
            String singleLetter = String.valueOf(this.password.charAt(i));

            if (isSpecialSymbol(singleLetter)){
                return true;
            }
        }
        return false;
    }

    public boolean isBiggerThan8(){
        if (this.password.length()>=8){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isNumber(String singleLetter){
        switch (singleLetter){
            case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9":
                return true;
            default:
                return false;
        }
    }

    public boolean isSpecialSymbol(String singleLetter){
        switch (singleLetter){
            case "!", "@", "#", "$", "%":
            case "^", "&", "*", "(", ")":
            case "_", "-", "=", "+", ".":
            case "?", "/", ">", "<", ",":
            case "[", "]", "{", "}", "|":
                return true;
            default:
                return false;
        }
    }
}
