package com.gm.diceroller.models;

import java.util.Random;

/**
 * Created by aaronworsham on 7/25/16.
 */
public class RollModel {
    final static public int dice[] = {4,6,8,10,12,20,100};
    private int dieFace;
    private int roll = 0;

    public RollModel(int dieFace){
        super();
        this.dieFace = dieFace;
        this.roll = this.roll();
    }


    public Integer roll(){
        Random rnd = new Random();
        int r = rnd.nextInt(this.dieFace);
        return r + 1;
    }

    public Integer getTotal(){
        return this.roll;
    }

    public Integer getFace(){
        return this.dieFace;
    }

}
