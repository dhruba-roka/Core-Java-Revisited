package com.classAndObject;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setDimension(2,4,7);
        box.showDimension();

        box = new Box();
        //box.setDimension(3,4,5);
        box.showDimension();
    }
}
