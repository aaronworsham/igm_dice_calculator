package com.gm.diceroller.views;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.util.Log;

import java.util.ArrayList;


import com.gm.diceroller.DR_Constants;
import com.gm.diceroller.R;
import com.gm.diceroller.adapters.RollAdapter;
import com.gm.diceroller.models.RollModel;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupMVP();

    }

    private void setupViews(){

        final ArrayList<RollModel> rolls = new ArrayList<RollModel>();

        DR_Constants mCon = new DR_Constants();

        final RollAdapter adapter = new RollAdapter(this, rolls);

        ListView listView = (ListView) findViewById(R.id.results);
        listView.setAdapter(adapter);


        for(int i = 0; i< mCon.DICE .length; i++) {
            Log.i("DICE", "I just got called for Die "+ mCon.DICE[i]);
            Resources res = getResources();
            int id = res.getIdentifier("button_d" + mCon.DICE[i], "id", this.getPackageName());
            Button b = (Button) findViewById(id);
            b.setOnClickListener(new diceListener(b,rolls, adapter, mCon.DICE[i]));
        }


    }

    private void setupMVP(){}


}
