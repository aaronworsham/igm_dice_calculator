package com.gm.diceroller;

/**
 * Created by aaronworsham on 7/25/16.
 */
public class RollModel {
    public int roll;
    public RollModel(){
        super();
    }

    public RollModel(int num){
        super();
        this.roll = num;
    }

    public String getRoll(){
        return String.valueOf(roll);
    }
}
