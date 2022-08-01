package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private static final int INITIAL_VOLUME = 10;
  private Television tv;

  @Before
  public void setup() throws Exception {
    tv = new Television("Apple", INITIAL_VOLUME, DisplayType.CRT);

  }

  @Test
  public void getBrand() {
    assertEquals("Apple", tv.getBrand());
  }

  @Test
  public void setBrand() {
  }

  @Test
  public void getVolume() {
    assertEquals(INITIAL_VOLUME, tv.getVolume());
  }

  @Test
  public void setVolume_valid() {
    tv.setVolume(tv.MIN_VOLUME + 1);
    assertEquals(Television.MIN_VOLUME + 1, tv.getVolume());
  }

  @Test(expected = IllegalArgumentException.class)
  public void setVolume_inValid() {
    tv.setVolume(Television.MIN_VOLUME - 1);
  }

  @Test
  public void getCurrentChannel() {
  }

  @Test
  public void changeChannel() {
  }

  @Test
  public void getDisplay() {
  }

  @Test
  public void setDisplay() {
  }

  @Test
  public void compareTo() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testEquals() {
  }
}