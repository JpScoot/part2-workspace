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
 * European orders are taxed as follows: VAT is 17% of taxable amount. Luxury tax is an additional
 * 25% on amount over $100.
 * <p>
 * TODO: implement this algorithm.
 */
public class EuropeTax implements TaxCalculator {

  private final double BASIC_RATE = 0.17;
  private final double LUXURY_RATE = 0.25;
  private final double LUXURY_THRESHOLD = 100;

  @Override
  public double taxAmount(double taxable) {

    return BASIC_RATE * taxable
        + ((taxable > LUXURY_THRESHOLD) ? (LUXURY_RATE * (taxable - LUXURY_THRESHOLD)) : 0);

  }

}