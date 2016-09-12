package com.gm.diceroller.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaronworsham on 8/31/16.
 */
public class RollSessionModelTest {
    RollModel rm1;
    RollModel rm2;
    RollModel rm3;
    RollSessionModel rsm = new RollSessionModel();

    @Before public void initialize(){
        rm1 = new RollModel(6);
        rm2 = new RollModel(6);
        rm3 = new RollModel(6);
    }

    @Test public void testAddingOneRoll(){
        rsm.addRoll(rm1);
        assertTrue("Should have one roll in session",
            rsm.getRolls().size() == 1);
    }

    @Test public void testAddingThreeRoll(){
        rsm.addRoll(rm1);
        rsm.addRoll(rm2);
        rsm.addRoll(rm3);
        assertTrue("Should have one roll in session",
                rsm.getRolls().size() == 3);
    }

    @Test public void testTotal(){
        rsm.addRoll(rm1);
        rsm.addRoll(rm2);
        rsm.addRoll(rm3);
        assertTrue("Should total greater than Zero",
                rsm.total() > 0);
    }
}