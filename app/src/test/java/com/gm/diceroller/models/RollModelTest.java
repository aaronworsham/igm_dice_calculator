package com.gm.diceroller.models;

import com.gm.diceroller.models.RollModel;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;


/**
 * Created by aaronworsham on 8/9/16.
 */
public class RollModelTest {


    @Test public void testRollDie(){
        int[] dice = {4,6,8,10,12,20,100};
        int x;
        int y;
        int roll;
        int die;
        RollModel rm;
        for(x = 0; x < dice.length; x++ ){
            die = dice[x];
            rm = new RollModel(die);
            for(y = 0; y < 100; y++){
                roll = rm.roll();
                assertTrue(roll < die + 1);
                assertTrue(roll > 0);
            }

        }
    }




}
