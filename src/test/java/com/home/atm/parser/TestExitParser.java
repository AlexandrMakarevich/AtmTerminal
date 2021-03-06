package com.home.atm.parser;

import com.home.atm.command.balance.Command;
import com.home.atm.command.balance.ExitCommand;
import org.junit.Assert;
import org.junit.Test;

public class TestExitParser extends AbstractInputParserTest{

    ExitParser exitParser = new ExitParser();

    public void executeAndAssert(String inputString, Command expectedResult) {
        Command actualResult = exitParser.parseInput(inputString);
        Assert.assertEquals("Actual result must be expected", expectedResult, actualResult);
    }

    @Test
    public void testAddUSD100() {
        executeAndAssert("exit", new ExitCommand());
    }

    @Override
    public InputParser getParser() {
        return exitParser;
    }
}
