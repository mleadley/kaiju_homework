package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class BehemothTankTest {
    BehemothTank behemoth;

    @Before
    public void before() {
        behemoth = new BehemothTank();
    }

    @Test
    public void hasType() {
        assertEquals("Behemoth Tank", behemoth.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(2000, behemoth.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(300, behemoth.getAttackValue());
    }

}