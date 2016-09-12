package com.gm.diceroller.models;


import java.util.ArrayList;

/**
 * Created by aaronworsham on 8/31/16.
 */
public class RollSessionModel {
    private ArrayList<RollModel> rolls = new ArrayList<RollModel>();
    private ArrayList<BonusModel> bonus = new ArrayList<BonusModel>();

    public RollSessionModel(){

    }

    public void addRoll(RollModel rm){
        this.rolls.add(rm);
    }
    public void addBonus(BonusModel bm){
        this.bonus.add(bm);
    }

    public ArrayList<RollModel> getRolls(){
        return this.rolls;
    }

    public ArrayList<BonusModel> getBonus(){
        return this.bonus;
    }

    public Integer total(){
        int y = 0;
        for(int x = 0; x < this.rolls.size(); x++){
            y += this.rolls.get(x).getTotal();
        }
        for(int x = 0; x < this.bonus.size(); x++){
            y += this.bonus.get(x).getTotal();
        }
        return y;
    }

    public void removeLastRoll(){
        this.rolls.remove(this.rolls.size()-1);
    }
}
