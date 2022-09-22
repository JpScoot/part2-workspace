package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelevisionTest {

  // set new instance of object, look at params in constructor that invokes the fields
  private final Television tv1 = new Television("Sony",0, DisplayType.PLASMA);

  @Test
  public void testSetVolume() {
    int volume = (Television.MIN_VOLUME + Television.MAX_VOLUME) / 2; // local var assign Television field, inherited from Television
    tv1.setVolume(volume);
    assertEquals(volume, tv1.getVolume());
  }

  @Test
  public void testSetVolumeIllegalArgumentException(){
    int oldVolume = tv1.getVolume();
    int volume = Television.MIN_VOLUME -1;
    try{
      tv1.setVolume(volume);
      fail("Didn't throw exception");
    } catch (IllegalArgumentException e) {
      assertEquals(oldVolume, tv1.getVolume());
    }
  }

  @Test
  public void testChangeChannel() throws InvalidChannelException {
    int channel = (Television.MIN_CHANNEL + Television.MAX_CHANNEL) / 2;
    tv1.changeChannel(channel);
    assertEquals(channel, tv1.getCurrentChannel());
  }

  @Test
  public void testChangeChannelInvalidChannelException() {
    int oldChannel = tv1.getCurrentChannel();
    int channel = Television.MAX_CHANNEL + 1;
    try{
      tv1.changeChannel(channel);
      fail();
    } catch (InvalidChannelException e) {
      assertEquals(oldChannel, tv1.getCurrentChannel());
    }
  }

  @Test
  public void testCompareTo(){
    Television tv2 = new Television("Sony");
    assertTrue(tv1.compareTo(tv2) >= 0);
    Television tv3 = new Television("LG");
    assertTrue(tv1.compareTo(tv3) > 0);
  }

  @Test
  public void testHashCode() {
    Television tv2 = new Television("Sony", 0, DisplayType.PLASMA);
    assertEquals(tv1, tv2);
    Television tv3 = new Television("Sony", 0, DisplayType.LCD);
    assertNotEquals(tv1, tv3);
  }

  @Test
  public void testEquals() {
    Television tv2 = new Television("Sony", 0, DisplayType.PLASMA);
    assertEquals(tv1, tv2);
    Television tv3 = new Television("Sony", 0, DisplayType.LCD);
    assertNotEquals(tv1, tv3);

  }
}