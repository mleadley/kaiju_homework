package com.example.michael.kaijuhomework;

/**
 * Created by michael on 06/09/2017.
 */

public interface Attacker {
    int getAttackValue();

    void attack(Damageable target);
}
