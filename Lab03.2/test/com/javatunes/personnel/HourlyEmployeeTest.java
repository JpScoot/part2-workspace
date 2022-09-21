package com.javatunes.personnel;

import static org.junit.Assert.*;

import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee emp; // field

  @Before
  public void setUp(){
  emp = new HourlyEmployee("Bill Cartwright", new Date(120, 2, 1), 25D, 40D); // check the params of the method being invoked HourlyEmployee .pay()
  }

  @Test
  public void testPay() {
    assertEquals(1000, emp.pay(), 0.001);
  }

  @Test
  public void testPayTaxes() {
    double expected = 250;
    double actual = emp.payTaxes();
    assertEquals(expected, actual, 0.001);
  }
}