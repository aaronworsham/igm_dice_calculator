package com.gm.diceroller.views;

import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.util.Log;
import com.gm.diceroller.adapters.RollAdapter;
import java.util.ArrayList;

import com.gm.diceroller.models.RollModel;
import com.gm.diceroller.utilities.DiceRoller;

/**
 * Created by aaronworsham on 8/15/16.
 */
public class diceListener implements View.OnClickListener  {

    private Button mButton;
    private RollAdapter mAdapter;
    private ArrayList mRolls;
    private int mDie;

    public diceListener(Button b, ArrayList rolls, RollAdapter ra, int d){
        this.mButton = b;
        this.mRolls = rolls;
        this.mAdapter = ra;
        this.mDie = d;
    }

    @Override
    public void onClick(View v){
        DiceRoller die = new DiceRoller(this.mDie);
        this.mRolls.add(0, new RollModel(die.roll()));
        this.mAdapter.notifyDataSetChanged();
    }
}
