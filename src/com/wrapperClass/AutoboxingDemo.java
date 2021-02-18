package com.wrapperClass;

//Autoboxing
//Autoboxing is used to convert primitive data types into corresponding objects.
public class AutoboxingDemo {
    public static void main(String[] args) {
        int num = 10;
        double longNum = 11.12;
        boolean booleanValue = true;

        //Autoboxing: converting pritive to object types
        Integer obj = Integer.valueOf(num);//creating a wrapper class object

        Integer integerObj= num;//autoboxing, after java-5 compiler will write Integer.valueOf(a) internally
        Double doubleObj = longNum;
        Boolean booleanObj = booleanValue;

        System.out.println("Integer Object type value is: " +num);
        System.out.println("Double object tupe value is: "+ doubleObj);
        System.out.println("Boolean object type value is: "+ booleanObj);

    }
}
