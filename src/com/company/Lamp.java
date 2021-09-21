package com.company;

public class Lamp {
    private boolean onOrOff;

    public Lamp(boolean onOrOff){
        this.onOrOff = onOrOff;
    }
    public Lamp(){
        this.onOrOff = false;
    }
    public void trykPåKontakt(){
        if(onOrOff){
            onOrOff = false;
        }else{
            onOrOff = true;
        }
    }

    @Override
    public String toString() {
        return "Lampen er: " + onOrOff;
    }
}
