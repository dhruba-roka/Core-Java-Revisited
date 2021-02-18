package com.javaRegularExpression;

import java.util.regex.Pattern;
// . represents single character:
public class RegexExample2 {
    public static void main(String[] args) {

        System.out.println(Pattern.matches(".s","as"));//true
        System.out.println(Pattern.matches(".s","mk"));//false
        System.out.println(Pattern.matches("..s","mas"));//true
        System.out.println(Pattern.matches("...s","sars"));//true
        System.out.println(Pattern.matches("...s","maaskl"));//false
    }
}
