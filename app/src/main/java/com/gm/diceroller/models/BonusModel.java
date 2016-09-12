package com.gm.diceroller.models;

import java.util.Random;

/**
 * Created by aaronworsham on 7/25/16.
 */
public class BonusModel {

    private int bonus;

    public BonusModel(int b){
        super();
        this.bonus = b;
    }

    public Integer getTotal(){
        return this.bonus;
    }


}
