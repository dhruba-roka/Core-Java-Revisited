package com.javaRegularExpression;

/*Create a regular expression that accepts 10 digit numeric characters
 starting with 7, 8 or 9 only.*/

import java.util.regex.Pattern;

public class RegexQuestion2 {
    public static void main(String[] args) {
        System.out.println("By character classes and Quantifiers---------------");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9816129113"));//true,10 digits & starts from 7 or 8 or 9
        System.out.println(Pattern.matches("[789][0-9]{9}","9846043454"));//true
        System.out.println(Pattern.matches("[789][0-9]{9}","98460434540"));//false, 11 digits
        System.out.println(Pattern.matches("[789][0-9]{9}","1234567890"));//false, starting not from 7 or 8 or 9

        System.out.println("By meta-characters--------------------");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","9846043454"));//true, starting from 7/8/9 and
        System.out.println(Pattern.matches("[789]\\d{9}","9846043454"));//true , same as above
        System.out.println(Pattern.matches("[789]\\d{9}}","1234567890"));//false, starting not from 7.8.9
    }

}
