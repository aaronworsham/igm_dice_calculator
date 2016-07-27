package com.gm.diceroller;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

import com.gm.diceroller.RollModel;

import java.lang.CharSequence;
import java.util.List;

import android.widget.TextView;

import com.gm.diceroller.RollAdapter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<RollModel> rolls = new ArrayList<RollModel>();
        rolls.add(new RollModel("4"));
        rolls.add(new RollModel("5"));


        final RollAdapter adapter = new RollAdapter(this, rolls);

        ListView listView = (ListView) findViewById(R.id.results);
        listView.setAdapter(adapter);


        final Button buttond4 = (Button) findViewById(R.id.button_d4);
        final Button buttond6 = (Button) findViewById(R.id.button_d6);
        final Button buttond8 = (Button) findViewById(R.id.button_d8);
        final Button buttond10 = (Button) findViewById(R.id.button_d10);
        final Button buttond12 = (Button) findViewById(R.id.button_d12);
        final Button buttond20 = (Button) findViewById(R.id.button_d20);
        final Button buttond100 = (Button) findViewById(R.id.button_d100);
        final Button sum = (Button) findViewById(R.id.sum);

        OnClickListener bListener = new View.OnClickListener() {
            public void onClick(View v) {
                DiceRoller die = new DiceRoller(0);
                switch (v.getId()) {
                    case R.id.button_d4:
                         die = new DiceRoller(4);
                        break;
                    case R.id.button_d6:
                         die = new DiceRoller(6);
                        break;
                    case R.id.button_d8:
                         die = new DiceRoller(8);
                        break;
                    case R.id.button_d10:
                         die = new DiceRoller(10);
                        break;
                    case R.id.button_d12:
                         die = new DiceRoller(12);
                        break;
                    case R.id.button_d20:
                         die = new DiceRoller(20);
                        break;
                    case R.id.button_d100:
                         die = new DiceRoller(100);
                        break;
                }
                String r = die.roll().toString();
                rolls.add(0, new RollModel(r));
                adapter.notifyDataSetChanged();
            }
        };

        buttond4.setOnClickListener(bListener);
        buttond6.setOnClickListener(bListener);
        buttond8.setOnClickListener(bListener);
        buttond10.setOnClickListener(bListener);
        buttond12.setOnClickListener(bListener);
        buttond20.setOnClickListener(bListener);
        buttond100.setOnClickListener(bListener);


    }


}
