package Regex;

import java.util.regex.Pattern;

public class Regex {
    public void checkPhoneNumber(String number) {
        Pattern pattern = Pattern.compile("[0][0-9]{9}");
        if (!pattern.matcher(number).find()) {
            System.out.println("The phone number should be 10 number with 0 first!");
        }
    }

    public void checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z1-9]{10,20}@[a-z]{1,5}.[a-z]{2,3}$");
        pattern.matcher(email).find();
    }
}
