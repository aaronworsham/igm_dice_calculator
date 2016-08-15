package com.gm.diceroller.utilities;

import android.widget.TextView;

import java.util.Random;
/**
 * Created by aaronworsham on 7/22/16.
 */
public class DiceRoller {
    private int faces = 0;
    public DiceRoller(int dieFace){
        faces = dieFace;
    }

    public Integer roll(){
        Random rnd = new Random();
        int r = rnd.nextInt(faces);
        return r + 1;
    }
}
