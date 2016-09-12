package com.gm.diceroller.views;

/**
 * Created by aaronworsham on 8/22/16.
 */

import android.view.View;

import com.gm.diceroller.presenters.RollPresenter;


public class ClearAllListener implements View.OnClickListener{

    private RollPresenter mRollPresenter;

    public ClearAllListener(RollPresenter rp){
        this.mRollPresenter = rp;
    }

    @Override
    public void onClick(View v){
        this.mRollPresenter.clearResults();
    }


}
