package com.gm.diceroller;

import com.gm.diceroller.models.RollModel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaronworsham on 8/9/16.
 */
public class RollModelTest {

    @Test
    public void testGetRoll(){
        RollModel rm = new RollModel(4);
        assertEquals("4", rm.getRollAsString());
    }
}
