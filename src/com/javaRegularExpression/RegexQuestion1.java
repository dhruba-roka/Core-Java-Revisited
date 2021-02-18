package com.javaRegularExpression;

import java.util.regex.Pattern;

/*Create a regular expression that accepts alphanumeric characters only.
Its length must be six characters long only.*/

public class RegexQuestion1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));//true, having 6 char & alphanumeric characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arunima123"));//false, char more than 6
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","apple1"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{8}","apple123"));//true
    }
}
