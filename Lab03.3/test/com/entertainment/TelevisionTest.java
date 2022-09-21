package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private Television tv;




  @Before
  public void setUp(){
    tv = new Television("Sony", 89, DisplayType.PLASMA);
  }

  @Test
  public void testSetVolume() {
    assertEquals(89, tv.getVolume());

  }

  @Test
  public void testChangeChannel() {
  }

  @Test
  public void testCompareTo() {
  }

  @Test
  public void testHashCode() {
    fail("Not yet implemented");
  }

  @Test
  public void testEquals() {
    fail("Not yet implemented");
  }
}