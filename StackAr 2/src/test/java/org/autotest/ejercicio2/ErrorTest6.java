package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

    public static boolean debug = false;

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test301");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isFull();
        java.lang.String str8 = stackAr1.toString();
        boolean boolean9 = stackAr1.isEmpty();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Object obj11 = stackAr1.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr1", stackAr1.repOK());
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test302");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 1);
        stackAr7.push((java.lang.Object) (short) 1);
        int int11 = stackAr7.size();
        int int12 = stackAr7.size();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Object obj14 = stackAr7.top();
        java.lang.Object obj15 = stackAr7.top();
        java.lang.String str16 = stackAr7.toString();
        java.lang.Object obj17 = stackAr7.pop();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for stackAr7", stackAr7.repOK());
    }
}

