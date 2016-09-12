package com.gm.diceroller.views;

import android.view.View;

import com.gm.diceroller.presenters.RollPresenter;

/**
 * Created by aaronworsham on 9/1/16.
 */
public class ClearLastListener implements View.OnClickListener{
    private RollPresenter mRollPresenter;

    public ClearLastListener(RollPresenter rp){
        this.mRollPresenter = rp;
    }

    @Override
    public void onClick(View v){
        this.mRollPresenter.clearLastResults();
    }


}
