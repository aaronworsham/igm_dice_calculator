package com.gm.diceroller.models;

import java.util.ArrayList;

/**
 * Created by aaronworsham on 7/25/16.
 */
public class RollModel {
    final static public int dice[] = {4,6,8,10,12,20,100};
    public ArrayList rolls = new ArrayList();
    public RollModel(){
        super();
    }

    public RollModel(int num){
        super();
        this.rolls.add(num);
    }

    public String getLastRollAsString(){
        return String.valueOf(rolls.get(rolls.size() -1));
    }

//    public String getFullRollsAsString(){
//        String s = "";
//        int x = 0;
//        for (x; x < rolls.size(); x++){
//            s = s + " " + rolls[x];
//        }
//        s = s +
//        return s;
//
//    }
}
