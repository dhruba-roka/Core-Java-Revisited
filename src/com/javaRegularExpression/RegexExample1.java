package com.javaRegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Three ways to write the REGEX:
public class RegexExample1 {
    public static void main(String[] args) {
        //1st way
        Pattern pattern = Pattern.compile(".s");//. represents single character
        Matcher m = pattern.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        //2nd way:
        boolean b2 = Pattern.compile(".s").matcher("sa").matches();
        System.out.println(b2);

        //3rd way:
        boolean b3 = Pattern.matches(".s", "dfjd");
        System.out.println(b3);


    }
}
