package com.classAndObject;

public class Box {


    private int length;
    private int breadth;
    private int height;

    public void setDimension(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;

    }

    public void showDimension(){
        System.out.println("LENGTH is: "+length+"  "+"Height is:  "+height+" "+"Breadth is:  "+breadth);

    }

}



