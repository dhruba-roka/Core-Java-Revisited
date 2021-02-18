package com.wrapperClass;


//Unboxing is used to convert the wrapper class objct into corresponding ptimitive data types
public class UnboxingDemo {
    public static void main(String[] args) {

        //unboxing: converting object type to primitive types
        Integer integerObj = new Integer(10); //creating wrapper class object
        Double doubleObj = new Double(30.12);
        Boolean booleanObj = new Boolean(true);


        int num = integerObj.intValue();  //converting the wrapper class object into primitive data types

        int primitiveIntTye = integerObj;//unboxing, After Java-5 compiler will write a.intValue() internally
        double primitiveDoubleType = doubleObj;
        boolean primitiveBooleanType = booleanObj;

        System.out.println(num);
        System.out.println("primitive type integer value is: "+primitiveIntTye);
        System.out.println("primitive type double value is: "+primitiveDoubleType);
        System.out.println("primitive type boolean value is: "+primitiveBooleanType);
    }
}
