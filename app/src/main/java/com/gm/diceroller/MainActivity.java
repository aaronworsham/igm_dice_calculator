package com.gm.diceroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;
import java.lang.CharSequence;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttond4 = (Button) findViewById(R.id.button_d4);
        final Button buttond6 = (Button) findViewById(R.id.button_d6);
        final Button buttond8 = (Button) findViewById(R.id.button_d8);
        final Button buttond10 = (Button) findViewById(R.id.button_d10);
        final Button buttond12 = (Button) findViewById(R.id.button_d12);
        final Button buttond20 = (Button) findViewById(R.id.button_d20);
        final Button buttond100 = (Button) findViewById(R.id.button_d100);

        buttond4.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = getString(R.string.dice_d4);
                makeToast(text);
            }
        });

        buttond6.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = getString(R.string.dice_d6);
                makeToast(text);
            }
        });

        buttond8.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = getString(R.string.dice_d8);
                makeToast(text);
            }
        });

        buttond10.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = getString(R.string.dice_d10);
                makeToast(text);
            }
        });

        buttond12.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = getString(R.string.dice_d12);
                makeToast(text);
            }
        });

        buttond20.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = getString(R.string.dice_d20);
                makeToast(text);
            }
        });

        buttond100.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = getString(R.string.dice_d100);
                makeToast(text);
            }
        });
    }

    protected void makeToast(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
