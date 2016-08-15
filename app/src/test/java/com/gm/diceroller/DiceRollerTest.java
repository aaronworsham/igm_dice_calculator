package com.gm.diceroller;

import com.gm.diceroller.utilities.DiceRoller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaronworsham on 8/8/16.
 */
public class DiceRollerTest {

    @Test
    public void die4Test(){
        int[] dice = {4,6,8,10,12,20,100};
        int x;
        int y;
        int roll;
        int die;
        DiceRoller DL;
        for(x = 0; x < dice.length; x++ ){
            die = dice[x];
            DL = new DiceRoller(die);
            for(y = 0; y < 100; y++){
                roll = DL.roll();
                assertTrue(roll < die + 1);
                assertTrue(roll > 0);
            }

        }
    }



}
