package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyRegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MyRegressionTest.test001");
        StackAr stack = new StackAr(75);

        for (int i = 0; i < 60; i++) {
            stack.push(i);
        }
        int hashCode = stack.hashCode();
        org.junit.Assert.assertEquals("'" + hashCode + "' != '" + "650728091" + "'", hashCode, 650728091);
    }

}

