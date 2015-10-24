package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var14 = var0.sum(true, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply(1, 10);
    int var10 = var0.sum(true, (-101), 1);
    int var13 = var0.minus(0, (-1));
    int var16 = var0.multiply(101, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var7 = var0.sum(true, (-1), (-101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-102));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 0, 100);
    int var20 = var0.multiply(101, 1);
    int var24 = var0.sum(true, 100, (-100));
    int var27 = var0.divide(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.multiply((-1), 100);
    int var6 = var0.multiply((-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-10));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var12 = var0.multiply((-1), 10);
    int var16 = var0.sum(false, 100, (-1));
    int var19 = var0.divide((-101), (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var12 = var0.multiply((-1), 10);
    int var15 = var0.multiply((-10), 1);
    int var18 = var0.minus((-100), (-101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-201));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var3 = var0.divide((-201), 0);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 101, (-1010));
    int var20 = var0.minus((-101), (-1010));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1111));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, (-102), (-101));
    int var21 = var0.sum(false, (-1000), (-201));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var13 = var0.sum(false, (-1), (-302));
    int var16 = var0.multiply((-1), (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.multiply(0, 100);
    int var6 = var0.divide((-101), (-201));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 0, 100);
    int var20 = var0.multiply(101, 1);
    int var24 = var0.sum(true, 100, (-100));
    int var27 = var0.multiply(100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply((-10), 1);
    int var9 = var0.divide((-302), (-1000));
    int var12 = var0.minus((-100), (-1010));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1110));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 0, 100);
    int var20 = var0.multiply(101, 1);
    int var23 = var0.divide((-201), (-102));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply(1, 10);
    int var10 = var0.sum(true, (-101), 1);
    int var13 = var0.minus(0, (-1));
    int var16 = var0.minus(101, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 111);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(101, (-1));
    int var9 = var0.divide((-1111), (-1010));
    int var13 = var0.sum(true, (-1000), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var16 = var0.divide(1000, 0);
      fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1000));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var12 = var0.multiply((-1), 10);
    int var15 = var0.multiply((-10), 1);
    int var19 = var0.sum(false, 1000, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(100, 101);
    int var9 = var0.minus((-1110), (-302));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1412));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply(1, 10);
    int var9 = var0.minus(101, (-1));
    int var12 = var0.minus((-101), (-201));
    int var15 = var0.divide((-1412), 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-302));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-13));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 101, (-1010));
    int var20 = var0.divide(0, (-101));
    int var23 = var0.divide((-1), (-1000));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(100, 101);
    int var9 = var0.multiply(10, (-100));
    int var12 = var0.minus(1, (-1010));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1000));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1009));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var12 = var0.multiply((-1), 10);
    int var16 = var0.sum(true, (-100), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-101));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var13 = var0.sum(false, (-1), (-302));
    int var17 = var0.sum(true, 101, (-100));
    int var20 = var0.divide(100, 212);
    int var23 = var0.minus(111, (-302));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-191));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var16 = var0.divide((-100), (-1101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply((-10), 1);
    int var9 = var0.divide((-302), (-1000));
    int var12 = var0.multiply(102, 1000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102000);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(100, 101);
    int var10 = var0.sum(true, 212, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 213);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.minus(102, (-1110));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1008));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply(1, 10);
    int var10 = var0.sum(true, (-101), 1);
    int var13 = var0.minus(0, (-1));
    int var16 = var0.minus((-13), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-3));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var14 = var0.sum(true, (-10), (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-20));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(101, (-1));
    int var9 = var0.divide((-1111), (-1010));
    int var12 = var0.minus(313, (-1010));
    int var15 = var0.divide(101, (-1020));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-697));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply(1, 10);
    int var10 = var0.sum(false, 101, (-1));
    int var13 = var0.multiply(313, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.divide(101, (-101));
    int var17 = var0.sum(false, (-102), 100);
    int var20 = var0.minus((-1010), (-10));
    int var24 = var0.sum(false, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1020));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var12 = var0.multiply((-1), 10);
    int var15 = var0.minus((-101), 313);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 212);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 101, (-1010));
    int var21 = var0.sum(false, 111, 1000);
    int var24 = var0.minus((-1110), (-201));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1311));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 0, 100);
    int var20 = var0.multiply((-1111), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-111100));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var12 = var0.multiply((-1), 10);
    int var16 = var0.sum(false, 100, (-1));
    int var19 = var0.multiply((-111100), 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-11332200));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.multiply((-1), 100);
    int var6 = var0.divide(100, 10);
    int var10 = var0.sum(true, 101, 212);
    int var13 = var0.divide((-111100), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 313);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-111100));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.multiply(0, 100);
    int var7 = var0.sum(false, (-1000), 0);
    int var11 = var0.sum(false, (-10), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var7 = var0.sum(true, (-13), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-14));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var13 = var0.sum(false, 10, 1);
    int var16 = var0.multiply((-1000), (-1));
    int var19 = var0.minus(111, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1000);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 121);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.multiply(0, 100);
    int var6 = var0.minus(0, 101);
    int var10 = var0.sum(true, (-10), (-1000));
    int var13 = var0.minus((-191), 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1010));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-80));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.multiply(0, 100);
    int var13 = var0.sum(false, (-1), (-302));
    int var16 = var0.minus(1000, (-1111));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-111));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(101, (-1));
    int var10 = var0.sum(true, (-80), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-79));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.multiply((-1), 100);
    int var6 = var0.divide(100, 10);
    int var9 = var0.multiply((-302), (-13));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3926);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.multiply(0, 100);
    int var7 = var0.sum(false, (-1000), 0);
    int var10 = var0.minus((-1000), (-101));
    int var13 = var0.minus((-1110), (-80));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1101));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1190));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, (-102), (-101));
    int var20 = var0.divide(1, 10);
    int var23 = var0.minus((-20), (-1111));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1131));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var9 = var0.divide((-10), (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply((-79), (-191));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15089);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.divide(0, 1);
    int var10 = var0.sum(false, 1, 10);
    int var13 = var0.multiply(0, 1);
    int var17 = var0.sum(false, 0, 100);
    int var20 = var0.multiply(101, 1);
    int var24 = var0.sum(true, 101, 111);
    int var27 = var0.divide((-1000), (-13));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 212);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 76);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    com.github.stokito.unitTestExample.calculator.Calculator var0 = new com.github.stokito.unitTestExample.calculator.Calculator();
    int var3 = var0.minus(1, 100);
    int var6 = var0.multiply(1, 10);
    int var9 = var0.multiply((-302), (-13));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3926);

  }

}
