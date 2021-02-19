package com.javaRegularExpression;

import java.util.regex.Pattern;

public class MobileNumberValidation {
    public static void main(String[] args) {
       boolean result = Pattern.matches("(977)?[9][0-9]{9}","9779816129113");
        System.out.println("The input number validation is: "+result);
    }
}
