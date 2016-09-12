package com.gm.diceroller.views;

import android.view.View;

import com.gm.diceroller.presenters.RollPresenter;

/**
 * Created by aaronworsham on 8/15/16.
 */
public class BonusListener implements View.OnClickListener  {

    private RollPresenter mRollPresenter;
    private int mBonus;

    public BonusListener(RollPresenter rp, int d){
        this.mRollPresenter = rp;
        this.mBonus = d;
    }

    @Override
    public void onClick(View v){
        this.mRollPresenter.addBonusModelToSession(this.mBonus);
        this.mRollPresenter.postResults();

    }
}
