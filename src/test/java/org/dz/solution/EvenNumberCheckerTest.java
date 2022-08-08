package org.dz.solution;


import org.junit.Assert;
import org.junit.Test;

public class EvenNumberCheckerTest {

    @Test
    public void check() {
        EvenNumberChecker checker = new EvenNumberChecker();
        boolean result = checker.check(5);
        Assert.assertFalse(result);
    }
}