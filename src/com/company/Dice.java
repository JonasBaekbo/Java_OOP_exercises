package com.company;

public class Dice {
    private int faceValue;

    public Dice(){

    }

    public void roll() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        this.faceValue = (int)(Math.random() * range) + min;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
