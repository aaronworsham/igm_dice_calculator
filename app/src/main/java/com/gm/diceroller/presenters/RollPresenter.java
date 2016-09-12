package com.gm.diceroller.presenters;

import android.content.Context;
import android.widget.TextView;

import com.gm.diceroller.models.BonusModel;
import com.gm.diceroller.models.RollModel;
import com.gm.diceroller.models.RollSessionModel;

import java.util.ArrayList;

/**
 * Created by aaronworsham on 8/22/16.
 */
public class RollPresenter {
    private RollSessionModel mRollSessionModel;
    private ArrayList <TextView> mResultsView;
    private Context mContext;

    public RollPresenter(ArrayList tv, Context c){
        this.mRollSessionModel = new RollSessionModel();
        this.mResultsView = tv;
        this.mContext = c;
    }

    public String getLastRollAsString(){
        return mRollSessionModel.total().toString();
    }

    public void addRollModelToSession(int die){
        RollModel rm = new RollModel(die);
        this.mRollSessionModel.addRoll(rm);
    }

    public void addBonusModelToSession(int bonus){
        BonusModel bm = new BonusModel(bonus);
        this.mRollSessionModel.addBonus(bm);
    }


    public void postResults(){
        String total = this.mRollSessionModel.total().toString();
        String str = "";
        String str2 = "";
        ArrayList <RollModel> rolls = this.mRollSessionModel.getRolls();
        ArrayList <BonusModel> bonus = this.mRollSessionModel.getBonus();
        RollModel rm;
        BonusModel bm;

        for(int x = 0; x < rolls.size(); x++ ){
            rm = rolls.get(x);
            str = str + " " + rm.getTotal().toString() + "(d" + rm.getFace().toString() +") +";
        }

        for(int x = 0; x < bonus.size(); x++ ){
            bm = bonus.get(x);
            str2 = str2 + " + " + bm.getTotal().toString();
        }

        this.mResultsView.get(0).setText(total);
        this.mResultsView.get(1).setText(str.substring(0, str.length() - 2));
        this.mResultsView.get(2).setText(str2);
    }

    public void clearResults(){
        this.mRollSessionModel = new RollSessionModel();
        this.mResultsView.get(0).setText("");
        this.mResultsView.get(1).setText("");
        this.mResultsView.get(2).setText("");
    }

    public void clearLastResults(){
        this.mRollSessionModel.removeLastRoll();
        this.postResults();
    }

}
