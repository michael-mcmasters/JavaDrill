package org.example.tests;

import org.example.Player;
import org.example.exceptions.MissedShotException;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void shootsAndScores() {
        Player player = new Player();
        player.setShootingAverage(100.0);

        boolean expected = true;
        boolean actual = false;
        try {
            player.shoot();
            actual = true;
        } catch (MissedShotException exception) {
            actual = false;
        }

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shootsAndMisses() {
        Player player = new Player();
        player.setShootingAverage(0.0);

        boolean expected = false;
        boolean actual = false;
        try {
            player.shoot();
            actual = true;
        } catch (MissedShotException exception) {
            actual = false;
        }

        Assert.assertEquals(expected, actual);
    }

}
