/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

/**
 * Domestic orders have a graduated tax scheme:
 *  The first $20.00 is tax-free.
 *  Amount over $20.00 is taxed at 10.0%.
 *  
 * TODO: implement this algorithm.
 */
public class USATax implements TaxCalculator {
  //declare fields
  private final double RATE = 0.1;
  private final double THRESHOLD = 20;


  @Override
  public double taxAmount(double taxable) {
    return (taxable > THRESHOLD) ? (RATE * (taxable - 20)) : 0;
  }

}