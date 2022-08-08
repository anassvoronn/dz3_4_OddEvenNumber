package org.dz.solution;


import org.junit.Assert;
import org.junit.Test;

public class EvenNumberCheckerTest {

    @Test
    public void check5() {
        EvenNumberChecker checker = new EvenNumberChecker();
        boolean result = checker.check(5);
        Assert.assertFalse(result);
    }

    @Test
    public void check0() {
        EvenNumberChecker checker = new EvenNumberChecker();
        boolean result = checker.check(0);
        Assert.assertTrue(result);
    }

    @Test
    public void check13() {
        EvenNumberChecker checker = new EvenNumberChecker();
        boolean result = checker.check(13);
        Assert.assertFalse(result);
    }

    @Test
    public void check2() {
        EvenNumberChecker checker = new EvenNumberChecker();
        boolean result = checker.check(2);
        Assert.assertTrue(result);
    }

    @Test
    public void check1000() {
        EvenNumberChecker checker = new EvenNumberChecker();
        boolean result = checker.check(1000);
        Assert.assertTrue(result);
    }

    @Test
    public void checkMinus1001() {
        EvenNumberChecker checker = new EvenNumberChecker();
        boolean result = checker.check(-1001);
        Assert.assertFalse(result);
    }

}