package com.javaRegularExpression;

import java.util.regex.Pattern;

public class RegexMetacharacters {
    public static void main(String[] args) {
        System.out.println("Metacharacters d:  d means digit ----");
        System.out.println(Pattern.matches("\\d","abc"));//false(non-digit)
        System.out.println(Pattern.matches("\\d","1"));//true(digit and comes once)
        System.out.println(Pattern.matches("\\d","4242"));//false(digit but comes more than once)
        System.out.println(Pattern.matches("\\d","123abc"));//false(digit and non digit comes)

        System.out.println("Metacharacters D: D means non-digit ---------------");
        System.out.println(Pattern.matches("\\D","a"));//true(non digit and comes once)
        System.out.println(Pattern.matches("\\D","1"));//false(comes once but digit)
        System.out.println(Pattern.matches("\\D","abc"));//false(non digit but comes more than once)
        System.out.println(Pattern.matches("\\D","123abc"));//false(non-digit and digits)

        System.out.println("Metacharacters D with Quantifiers-------------");
        System.out.println(Pattern.matches("\\D*","mak"));//true(non digit and may come 0 or more times)
        System.out.println(Pattern.matches("\\d*","123456"));//true(digit and may come 0 or more times)
    }
}
