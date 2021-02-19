package com.javaRegularExpression;

import java.util.regex.Pattern;

public class EmailValidaton {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\." +
                                           "[a-zA-Z0-9_+&*-]+)*@"  +
                                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                                           "A-Z]{2,7}$"
                        ,"dhruba.roka123@geeksforgeeks.org"));
    }
}
