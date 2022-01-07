package Regex;

import java.util.regex.Pattern;

public class Regex {
    public boolean checkPhoneNumber(String phone) {
        Pattern pattern = Pattern.compile("[0][0-9]{9}");
        boolean checkPhone = false;
        if (pattern.matcher(phone).find()) {
            checkPhone = true;
        } else {
            System.out.println("    ☢ The phone number should be included 10 numbers with 0 first!");
        }
        return checkPhone;
    }

    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z1-9]{1,20}@[a-z]{1,5}.[a-z]{2,3}$");
        boolean checkEmail = false;
        if (pattern.matcher(email).find()) {
            checkEmail = true;
        } else {
            System.out.println("    ☢ Email is wrong!");
            System.out.println("    ☢ Example: abc@abc.acb, abc123@abc.abc");
        }
        return checkEmail;
    }

    public void checkAge (int age) {
        if (age < 18 || age > 60) {
            System.out.println("    ☢ You are out of Working-Age (18 - 60)");
            System.exit(0);
        }
    }
}
