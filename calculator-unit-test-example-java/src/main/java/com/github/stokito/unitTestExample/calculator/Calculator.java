package com.github.stokito.unitTestExample.calculator;

/**
 * Class Calculator to perform basic calculator operations.
 * @author "karishma nimgaonkar"
 */

public class Calculator {

    /**
     *  return sum.
     *  @param flag for branching
     *  @param a integer first number to take sum
     *  @param b integer second number to take sum
     *  @return sum of a and b
     */
    public final int sum(final boolean flag, final int a, final int b) {
        if (flag) {
            return a + b;
        } else {
            return 0;
        }
    }

    /**
     *  return difference.
     *  @param a integer first number to take difference
     *  @param b integer second number to take difference
     *  @return difference of a and b
     */
    public final int minus(final int a, final int b) {
        return a + b; // ERROR!!!
    }

    /**
     *  return division.
     *  @param a integer first number to take division
     *  @param b integer second number to take division
     *  @return division of a and b
     */
    public final int divide(final int a, final int b) {
        return a / b;
    }

    /**
     *  return multiplication.
     *  @param a integer first number to multiply
     *  @param b integer second number to multiply
     *  @return multiplication of a and b
     */
    public final int multiply(final int a, final int b) {
        return a * b;
    }

}
