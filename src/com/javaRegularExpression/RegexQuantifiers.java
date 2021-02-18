package com.javaRegularExpression;

import java.util.regex.Pattern;

public class RegexQuantifiers {
    public static void main(String[] args) {
        System.out.println("? Regex Quantifiers: x occurs once or not at all----------");
        System.out.println(Pattern.matches("[amn]?","a"));//true
        System.out.println(Pattern.matches("[amn]?","aaa"));//false
        System.out.println(Pattern.matches("[amn]?","aammmnn"));//false
        System.out.println(Pattern.matches("[amn]?","b"));//false
        System.out.println(Pattern.matches("[amn]?","amn"));//false

        System.out.println("+ Regex Quantifiers: x occurs once or more times-----------");
        System.out.println(Pattern.matches("[amn]+","a"));//true
        System.out.println(Pattern.matches("[amn]+","aaa"));//true
        System.out.println(Pattern.matches("[amn]+","aammmnn"));//true
        System.out.println(Pattern.matches("[amn]+","b"));//false
        System.out.println(Pattern.matches("[amn]+","amn"));//true

        System.out.println("* Regex Quantifiers: x occurs zero or more times-----------");
        System.out.println(Pattern.matches("[amn]*","a"));//true
        System.out.println(Pattern.matches("[amn]*","aaa"));//true
        System.out.println(Pattern.matches("[amn]*","aammmnn"));//true
        System.out.println(Pattern.matches("[amn]*","b"));//false
        System.out.println(Pattern.matches("[amn]*","amn"));//true
        System.out.println(Pattern.matches("[amn]*","aaaammmmmmmmmmmmm"));//true
    }
}
