package com.gm.diceroller.views;

import android.content.Intent;
import android.view.View;
import com.gm.diceroller.presenters.RollPresenter;

/**
 * Created by aaronworsham on 8/15/16.
 */
public class DiceListener implements View.OnClickListener  {

    private RollPresenter mRollPresenter;
    private int mDie;

    public DiceListener(RollPresenter rp, int d){
        this.mRollPresenter = rp;
        this.mDie = d;
    }

    @Override
    public void onClick(View v){
        this.mRollPresenter.addRollModelToSession(this.mDie);

        this.mRollPresenter.postResults();

    }
}
