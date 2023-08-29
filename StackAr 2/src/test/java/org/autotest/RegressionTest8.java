package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test401");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isFull();
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = stackAr1.equals((java.lang.Object) wildcardClass8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 0 + "'", obj5, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test402");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        int int20 = stackAr4.size();
        boolean boolean21 = stackAr4.isEmpty();
        boolean boolean22 = stackAr4.isEmpty();
        boolean boolean23 = stackAr4.isEmpty();
        java.lang.Class<?> wildcardClass24 = stackAr4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test403");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean11 = stackAr1.equals((java.lang.Object) (-1L));
        java.lang.Object obj12 = stackAr1.pop();
        int int13 = stackAr1.size();
        java.lang.Class<?> wildcardClass14 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + false + "'", obj12, false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test404");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((java.lang.Object) (-1L));
        java.lang.Object obj4 = stackAr1.pop();
        stackAr1.push((java.lang.Object) (-1));
        boolean boolean7 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        boolean boolean17 = stackAr9.isFull();
        java.lang.Object obj18 = stackAr9.pop();
        boolean boolean19 = stackAr1.equals(obj18);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        java.lang.String str24 = stackAr23.toString();
        boolean boolean25 = stackAr21.equals((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        stackAr27.push((java.lang.Object) (-1L));
        java.lang.Object obj30 = stackAr27.pop();
        stackAr21.push((java.lang.Object) stackAr27);
        boolean boolean32 = stackAr21.isEmpty();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        java.lang.String str37 = stackAr33.toString();
        boolean boolean39 = stackAr33.equals((java.lang.Object) 10L);
        java.lang.String str40 = stackAr33.toString();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) (-1.0f));
        boolean boolean46 = stackAr42.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        stackAr42.push((java.lang.Object) stackAr47);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) '4');
        java.lang.String str54 = stackAr53.toString();
        boolean boolean55 = stackAr51.equals((java.lang.Object) stackAr53);
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr();
        boolean boolean57 = stackAr56.isFull();
        boolean boolean59 = stackAr56.equals((java.lang.Object) (byte) -1);
        java.lang.String str60 = stackAr56.toString();
        boolean boolean62 = stackAr56.equals((java.lang.Object) 10L);
        java.lang.String str63 = stackAr56.toString();
        stackAr53.push((java.lang.Object) stackAr56);
        stackAr42.push((java.lang.Object) stackAr56);
        boolean boolean66 = stackAr33.equals((java.lang.Object) stackAr56);
        boolean boolean67 = stackAr21.equals((java.lang.Object) stackAr33);
        stackAr1.push((java.lang.Object) stackAr33);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1L) + "'", obj4, (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "[]" + "'", str60, "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[]" + "'", str63, "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test405");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        int int6 = stackAr1.size();
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean10 = stackAr9.isEmpty();
        boolean boolean11 = stackAr9.isEmpty();
        stackAr1.push((java.lang.Object) stackAr9);
        java.lang.Class<?> wildcardClass13 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test406");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        stackAr31.push((java.lang.Object) 0.0f);
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr36.isFull();
        java.lang.Object obj45 = stackAr36.pop();
        stackAr31.push((java.lang.Object) stackAr36);
        stackAr0.push((java.lang.Object) stackAr36);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) '4');
        boolean boolean50 = stackAr49.isFull();
        stackAr0.push((java.lang.Object) stackAr49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = stackAr49.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0.0]" + "'", str34, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test407");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        stackAr36.push((java.lang.Object) (-1L));
        java.lang.Object obj39 = stackAr36.pop();
        stackAr30.push((java.lang.Object) stackAr36);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr30);
        stackAr15.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean45 = stackAr44.isFull();
        int int46 = stackAr44.size();
        int int47 = stackAr44.size();
        stackAr30.push((java.lang.Object) stackAr44);
        boolean boolean49 = stackAr30.isEmpty();
        boolean boolean50 = stackAr30.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test408");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test409");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 100);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        java.lang.String str4 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test410");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        java.lang.String str4 = stackAr0.toString();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) 'a');
        boolean boolean7 = stackAr6.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr0.push((java.lang.Object) stackAr6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test411");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test412");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        java.lang.Object obj13 = stackAr0.pop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[0]");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test413");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.Object obj23 = stackAr4.pop();
        java.lang.String str24 = stackAr4.toString();
        boolean boolean25 = stackAr4.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test414");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) ' ');
        boolean boolean2 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test415");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        boolean boolean23 = stackAr4.isEmpty();
        boolean boolean24 = stackAr4.isEmpty();
        int int25 = stackAr4.size();
        boolean boolean26 = stackAr4.isEmpty();
        java.lang.Class<?> wildcardClass27 = stackAr4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test416");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean6 = stackAr1.isEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test417");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        boolean boolean5 = stackAr2.equals((java.lang.Object) (byte) -1);
        java.lang.String str6 = stackAr2.toString();
        boolean boolean8 = stackAr2.equals((java.lang.Object) 10L);
        java.lang.String str9 = stackAr2.toString();
        boolean boolean11 = stackAr2.equals((java.lang.Object) (byte) 0);
        boolean boolean12 = stackAr2.isFull();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '#');
        stackAr2.push((java.lang.Object) stackAr14);
        boolean boolean16 = stackAr2.isFull();
        java.lang.String str17 = stackAr2.toString();
        stackAr1.push((java.lang.Object) stackAr2);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        int int21 = stackAr20.size();
        java.lang.String str22 = stackAr20.toString();
        int int23 = stackAr20.size();
        boolean boolean24 = stackAr20.isEmpty();
        java.lang.String str25 = stackAr20.toString();
        boolean boolean26 = stackAr20.isEmpty();
        boolean boolean27 = stackAr2.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[]]" + "'", str17, "[[]]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test418");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 10);
        boolean boolean2 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test419");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        boolean boolean19 = stackAr5.isFull();
        boolean boolean20 = stackAr5.isFull();
        java.lang.String str21 = stackAr5.toString();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj23 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test420");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((java.lang.Object) (-1L));
        java.lang.Object obj4 = stackAr1.pop();
        java.lang.String str5 = stackAr1.toString();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1L) + "'", obj4, (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test421");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) ' ');
        int int2 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test422");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        boolean boolean15 = stackAr3.isFull();
        java.lang.Class<?> wildcardClass16 = stackAr3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test423");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr(0);
        boolean boolean24 = stackAr4.equals((java.lang.Object) 0);
        boolean boolean25 = stackAr4.isEmpty();
        boolean boolean26 = stackAr4.isEmpty();
        boolean boolean27 = stackAr4.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test424");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test425");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test426");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.String str3 = stackAr0.toString();
        boolean boolean4 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '#');
        stackAr0.push((java.lang.Object) stackAr6);
        boolean boolean8 = stackAr0.isFull();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[0.0]" + "'", str3, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test427");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.pop();
        stackAr1.push((java.lang.Object) stackAr7);
        boolean boolean12 = stackAr1.isEmpty();
        java.lang.Object obj13 = stackAr1.pop();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1L) + "'", obj10, (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test428");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        boolean boolean9 = stackAr0.equals((java.lang.Object) (byte) 0);
        boolean boolean10 = stackAr0.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '#');
        stackAr0.push((java.lang.Object) stackAr12);
        boolean boolean14 = stackAr0.isFull();
        java.lang.Object obj15 = stackAr0.pop();
        boolean boolean16 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test429");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        stackAr1.push((java.lang.Object) 0);
        java.lang.String str5 = stackAr1.toString();
        java.lang.Object obj6 = stackAr1.pop();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        java.lang.String str9 = stackAr8.toString();
        java.lang.String str10 = stackAr8.toString();
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr();
        boolean boolean12 = stackAr11.isFull();
        boolean boolean14 = stackAr11.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        boolean boolean17 = stackAr11.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        boolean boolean24 = stackAr11.equals((java.lang.Object) "");
        boolean boolean25 = stackAr11.isFull();
        boolean boolean26 = stackAr8.equals((java.lang.Object) stackAr11);
        java.lang.Object obj27 = null;
        stackAr11.push(obj27);
        java.lang.Object obj29 = stackAr11.top();
        boolean boolean30 = stackAr11.isEmpty();
        boolean boolean31 = stackAr11.isFull();
        stackAr1.push((java.lang.Object) stackAr11);
        java.lang.Object obj33 = stackAr1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[0]" + "'", str5, "[0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0 + "'", obj6, 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "[null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "[null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "[null]");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test430");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        java.lang.String str15 = stackAr6.toString();
        boolean boolean16 = stackAr6.isFull();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr(10);
        stackAr6.push((java.lang.Object) stackAr18);
        boolean boolean20 = stackAr6.isEmpty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test431");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        boolean boolean7 = stackAr5.equals((java.lang.Object) (-1.0f));
        int int8 = stackAr5.size();
        boolean boolean10 = stackAr5.equals((java.lang.Object) (byte) 100);
        boolean boolean11 = stackAr5.isFull();
        int int12 = stackAr5.size();
        boolean boolean13 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        java.lang.String str18 = stackAr17.toString();
        boolean boolean19 = stackAr15.equals((java.lang.Object) stackAr17);
        stackAr5.push((java.lang.Object) boolean19);
        java.lang.String str21 = stackAr5.toString();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isFull();
        java.lang.String str25 = stackAr23.toString();
        java.lang.String str26 = stackAr23.toString();
        java.lang.Class<?> wildcardClass27 = stackAr23.getClass();
        boolean boolean28 = stackAr5.equals((java.lang.Object) stackAr23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[true]" + "'", str21, "[true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test432");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test433");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        java.lang.String str2 = stackAr0.toString();
        boolean boolean3 = stackAr0.isEmpty();
        int int4 = stackAr0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test434");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean27 = stackAr26.isEmpty();
        boolean boolean28 = stackAr26.isFull();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr30.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        stackAr36.push((java.lang.Object) (-1L));
        java.lang.Object obj39 = stackAr36.pop();
        stackAr30.push((java.lang.Object) stackAr36);
        boolean boolean41 = stackAr26.equals((java.lang.Object) stackAr30);
        stackAr15.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean45 = stackAr44.isFull();
        int int46 = stackAr44.size();
        int int47 = stackAr44.size();
        stackAr30.push((java.lang.Object) stackAr44);
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) '4');
        java.lang.String str51 = stackAr50.toString();
        stackAr50.push((java.lang.Object) 0);
        stackAr30.push((java.lang.Object) 0);
        boolean boolean55 = stackAr30.isFull();
        java.lang.Object obj56 = stackAr30.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 0 + "'", obj56, 0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test435");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 0);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        stackAr3.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) '4');
        java.lang.String str15 = stackAr14.toString();
        boolean boolean16 = stackAr12.equals((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        boolean boolean20 = stackAr17.equals((java.lang.Object) (byte) -1);
        java.lang.String str21 = stackAr17.toString();
        boolean boolean23 = stackAr17.equals((java.lang.Object) 10L);
        java.lang.String str24 = stackAr17.toString();
        stackAr14.push((java.lang.Object) stackAr17);
        stackAr3.push((java.lang.Object) stackAr17);
        java.lang.Object obj27 = stackAr3.pop();
        boolean boolean28 = stackAr1.equals((java.lang.Object) stackAr3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test436");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        java.lang.String str21 = stackAr20.toString();
        boolean boolean22 = stackAr18.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        boolean boolean26 = stackAr23.equals((java.lang.Object) (byte) -1);
        java.lang.String str27 = stackAr23.toString();
        boolean boolean29 = stackAr23.equals((java.lang.Object) 10L);
        java.lang.String str30 = stackAr23.toString();
        stackAr20.push((java.lang.Object) stackAr23);
        stackAr9.push((java.lang.Object) stackAr23);
        boolean boolean33 = stackAr0.equals((java.lang.Object) stackAr23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = stackAr23.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test437");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        boolean boolean5 = stackAr2.equals((java.lang.Object) false);
        boolean boolean6 = stackAr2.isEmpty();
        boolean boolean7 = stackAr1.equals((java.lang.Object) boolean6);
        java.lang.Object obj8 = null;
        boolean boolean9 = stackAr1.equals(obj8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test438");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        int int6 = stackAr1.size();
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test439");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        java.lang.String str13 = stackAr12.toString();
        boolean boolean14 = stackAr10.equals((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        boolean boolean18 = stackAr15.equals((java.lang.Object) (byte) -1);
        java.lang.String str19 = stackAr15.toString();
        boolean boolean21 = stackAr15.equals((java.lang.Object) 10L);
        java.lang.String str22 = stackAr15.toString();
        stackAr12.push((java.lang.Object) stackAr15);
        stackAr1.push((java.lang.Object) stackAr15);
        boolean boolean25 = stackAr15.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr((int) '4');
        boolean boolean32 = stackAr26.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) 'a');
        boolean boolean36 = stackAr34.equals((java.lang.Object) (-1.0f));
        boolean boolean38 = stackAr34.equals((java.lang.Object) "");
        boolean boolean39 = stackAr26.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass40 = stackAr26.getClass();
        stackAr15.push((java.lang.Object) stackAr26);
        java.lang.String str42 = stackAr15.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[]" + "'", str19, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[[]]" + "'", str42, "[[]]");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test440");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        stackAr1.push((java.lang.Object) boolean6);
        boolean boolean8 = stackAr1.isEmpty();
        java.lang.Object obj9 = stackAr1.top();
        boolean boolean10 = stackAr1.isEmpty();
        boolean boolean11 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + false + "'", obj9, false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test441");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) '4');
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr1.equals((java.lang.Object) stackAr3);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        java.lang.String str10 = stackAr6.toString();
        boolean boolean12 = stackAr6.equals((java.lang.Object) 10L);
        java.lang.String str13 = stackAr6.toString();
        stackAr3.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        boolean boolean22 = stackAr21.isFull();
        stackAr16.push((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) '4');
        java.lang.String str28 = stackAr27.toString();
        boolean boolean29 = stackAr25.equals((java.lang.Object) stackAr27);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        boolean boolean33 = stackAr30.equals((java.lang.Object) (byte) -1);
        java.lang.String str34 = stackAr30.toString();
        boolean boolean36 = stackAr30.equals((java.lang.Object) 10L);
        java.lang.String str37 = stackAr30.toString();
        stackAr27.push((java.lang.Object) stackAr30);
        stackAr16.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isEmpty();
        boolean boolean43 = stackAr41.isFull();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) '4');
        java.lang.String str48 = stackAr47.toString();
        boolean boolean49 = stackAr45.equals((java.lang.Object) stackAr47);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) '4');
        stackAr51.push((java.lang.Object) (-1L));
        java.lang.Object obj54 = stackAr51.pop();
        stackAr45.push((java.lang.Object) stackAr51);
        boolean boolean56 = stackAr41.equals((java.lang.Object) stackAr45);
        stackAr30.push((java.lang.Object) stackAr45);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean60 = stackAr59.isFull();
        int int61 = stackAr59.size();
        int int62 = stackAr59.size();
        stackAr45.push((java.lang.Object) stackAr59);
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr();
        boolean boolean65 = stackAr64.isEmpty();
        boolean boolean66 = stackAr45.equals((java.lang.Object) stackAr64);
        boolean boolean67 = stackAr45.isEmpty();
        stackAr3.push((java.lang.Object) boolean67);
        java.lang.Object obj69 = stackAr3.pop();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1L) + "'", obj54, (-1L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + false + "'", obj69, false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test442");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        java.lang.Class<?> wildcardClass2 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test443");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        boolean boolean18 = stackAr4.isFull();
        boolean boolean19 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Object obj20 = null;
        stackAr4.push(obj20);
        java.lang.Object obj22 = stackAr4.top();
        java.lang.Object obj23 = stackAr4.top();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        stackAr24.push((java.lang.Object) 0.0f);
        stackAr24.push((java.lang.Object) true);
        stackAr4.push((java.lang.Object) stackAr24);
        int int30 = stackAr24.size();
        int int31 = stackAr24.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test444");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test445");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        stackAr8.push((java.lang.Object) 0);
        stackAr0.push((java.lang.Object) stackAr8);
        boolean boolean13 = stackAr0.isFull();
        boolean boolean14 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test446");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((java.lang.Object) (-1L));
        java.lang.Object obj4 = stackAr1.pop();
        stackAr1.push((java.lang.Object) (-1));
        boolean boolean7 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) 'a');
        boolean boolean11 = stackAr9.equals((java.lang.Object) (-1.0f));
        boolean boolean13 = stackAr9.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        stackAr9.push((java.lang.Object) stackAr14);
        boolean boolean17 = stackAr9.isFull();
        java.lang.Object obj18 = stackAr9.pop();
        boolean boolean19 = stackAr1.equals(obj18);
        java.lang.String str20 = stackAr1.toString();
        java.lang.String str21 = stackAr1.toString();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1L) + "'", obj4, (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[-1]" + "'", str20, "[-1]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[-1]" + "'", str21, "[-1]");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test447");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test448");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) 10);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        java.lang.String str6 = stackAr5.toString();
        java.lang.String str7 = stackAr5.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        boolean boolean22 = stackAr8.isFull();
        boolean boolean23 = stackAr5.equals((java.lang.Object) stackAr8);
        java.lang.Object obj24 = null;
        stackAr8.push(obj24);
        java.lang.Object obj26 = stackAr8.top();
        java.lang.String str27 = stackAr8.toString();
        java.lang.Object obj28 = stackAr8.pop();
        boolean boolean29 = stackAr0.equals(obj28);
        java.lang.String str30 = stackAr0.toString();
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        stackAr31.push((java.lang.Object) 0.0f);
        java.lang.String str34 = stackAr31.toString();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr36.isFull();
        java.lang.Object obj45 = stackAr36.pop();
        stackAr31.push((java.lang.Object) stackAr36);
        stackAr0.push((java.lang.Object) stackAr36);
        java.lang.Object obj48 = null;
        boolean boolean49 = stackAr36.equals(obj48);
        java.lang.String str50 = stackAr36.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[null]" + "'", str27, "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0.0]" + "'", str34, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[]" + "'", str50, "[]");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test449");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        stackAr1.push((java.lang.Object) (-1L));
        java.lang.Object obj4 = stackAr1.pop();
        java.lang.String str5 = stackAr1.toString();
        boolean boolean6 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1L) + "'", obj4, (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test450");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

