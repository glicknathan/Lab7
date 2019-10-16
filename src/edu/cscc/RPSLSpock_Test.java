package edu.cscc;

import org.junit.Test;
import org.junit.Assert;

public class RPSLSpock_Test {

    @Test
    public void TestisValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        Assert.assertFalse(RPSLSpock.isValidPick("Peaches"));


    }

    @Test
    public void TestgeneratePick() {
        for (int i = 0; i <1000000; i++);
        String generation = RPSLSpock.generatePick();
        Assert.assertNotNull(RPSLSpock.generatePick());
        Assert.assertTrue(RPSLSpock.isValidPick(generation));

    }

    @Test
    public void TestisComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK, RPSLSpock.SCISSORS));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS, RPSLSpock.ROCK));

    }
}