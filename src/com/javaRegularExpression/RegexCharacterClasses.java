package com.javaRegularExpression;

import java.util.regex.Pattern;

public class RegexCharacterClasses {
    public static void main(String[] args) {
        System.out.println("Regex character class example: -----------------------");
        System.out.println(Pattern.matches("[amn]","a"));//true
        System.out.println(Pattern.matches("[amn]","amn"));//false, a or m or n
        System.out.println(Pattern.matches("[amn]","b"));//false
    }
}
