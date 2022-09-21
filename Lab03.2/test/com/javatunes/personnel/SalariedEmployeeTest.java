package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {


  private SalariedEmployee salariedEmployee; // private instance variable

  @Before
  public void setUp(){
    salariedEmployee = new SalariedEmployee("John Paxton", new Date(120,3,5), 69000d);
  }

  @Test
  public void testPay() {
    assertEquals(69000, salariedEmployee.pay(), 0.001);
  }

  @Test
  public void testPayTaxes() {
    double expected = 20700;
    double actual = salariedEmployee.payTaxes();
    assertEquals(expected, actual, 0.001);  }
}

