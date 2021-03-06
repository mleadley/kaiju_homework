package com.example.michael.kaijuhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 06/09/2017.
 */

public class MobileSAMTest {
    MobileSAM mobileSAM;
    Damageable target;

    @Before
    public void before() {
        mobileSAM = new MobileSAM();
        target = new Rodan();
    }

    @Test
    public void hasType() {
        assertEquals("Mobile SAM", mobileSAM.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(300, mobileSAM.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(400, mobileSAM.getAttackValue());
    }

    @Test
    public void canBeDamaged() {
        mobileSAM.damage(100);
        assertEquals(200, mobileSAM.getHealthValue());
    }

    @Test
    public void healthLowerBoundedAtZero() {
        mobileSAM.damage(5000);
        assertEquals(0, mobileSAM.getHealthValue());
    }

    @Test
    public void canAttack() {
        mobileSAM.attack(target);
        assertEquals(1100, target.getHealthValue());
    }

    @Test
    public void canUltimateAttack() {
        mobileSAM.ultimateAttack(target);
        assertEquals(300, target.getHealthValue());
    }
}
