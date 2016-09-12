package com.gm.diceroller.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


import com.gm.diceroller.DR_Constants;
import com.gm.diceroller.R;
import com.gm.diceroller.presenters.RollPresenter;

public class MainActivity extends AppCompatActivity {

    ArrayList <TextView> mResultsView = new ArrayList<TextView>();
    RollPresenter mRollPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mResultsView.add((TextView) findViewById(R.id.results));
        this.mResultsView.add((TextView) findViewById(R.id.results2));
        this.mResultsView.add((TextView) findViewById(R.id.results3));
        mRollPresenter = new RollPresenter(this.mResultsView, getApplicationContext());

        setupMVP();

    }




    private void setupMVP(){

        //DiceListener Setup

        DR_Constants mCon = new DR_Constants();



        Resources res = getResources();

        for(int i = 0; i< mCon.DICE .length; i++) {
            int id = res.getIdentifier("button_d" + mCon.DICE[i], "id", this.getPackageName());
            Button b = (Button) findViewById(id);
            b.setOnClickListener(new DiceListener(mRollPresenter, mCon.DICE[i]));
            b.setOnLongClickListener(new DiceLongListener(getApplicationContext()));
        }

        for(int i = 1; i< 9; i++) {
            int id = res.getIdentifier("plus" + i, "id", this.getPackageName());
            Button b = (Button) findViewById(id);
            b.setOnClickListener(new BonusListener(mRollPresenter, i));
        }

        Button clearAll = (Button) findViewById(R.id.clearAll);
        clearAll.setOnClickListener(new ClearAllListener(mRollPresenter));


        Button clearLast = (Button) findViewById(R.id.clearLast);
        clearLast.setOnClickListener(new ClearLastListener(mRollPresenter));


    }



}
