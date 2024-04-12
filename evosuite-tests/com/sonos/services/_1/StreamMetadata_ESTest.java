/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:13:07 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.AlbumArtUrl;
import com.sonos.services._1.StreamMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StreamMetadata_ESTest extends StreamMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Boolean boolean0 = Boolean.valueOf(true);
      streamMetadata0.setIsEphemeral(boolean0);
      Boolean boolean1 = streamMetadata0.isIsEphemeral();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Boolean boolean0 = Boolean.valueOf("");
      streamMetadata0.setIsEphemeral(boolean0);
      Boolean boolean1 = streamMetadata0.isIsEphemeral();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Boolean boolean0 = new Boolean(true);
      streamMetadata0.setHasOutOfBandMetadata(boolean0);
      Boolean boolean1 = streamMetadata0.isHasOutOfBandMetadata();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Boolean boolean0 = new Boolean("M-+r:{z");
      streamMetadata0.setHasOutOfBandMetadata(boolean0);
      Boolean boolean1 = streamMetadata0.isHasOutOfBandMetadata();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.title = "02";
      String string0 = streamMetadata0.getTitle();
      assertEquals("02", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.title = "";
      String string0 = streamMetadata0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setSubtitle(")_=i.z");
      String string0 = streamMetadata0.getSubtitle();
      assertEquals(")_=i.z", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.subtitle = "";
      String string0 = streamMetadata0.getSubtitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = new Integer(1);
      streamMetadata0.setSecondsToNextShow(integer0);
      Integer integer1 = streamMetadata0.getSecondsToNextShow();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = new Integer((-1));
      streamMetadata0.secondsToNextShow = integer0;
      Integer integer1 = streamMetadata0.getSecondsToNextShow();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = new Integer((-1));
      streamMetadata0.setSecondsRemaining(integer0);
      Integer integer1 = streamMetadata0.getSecondsRemaining();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = Integer.valueOf(0);
      streamMetadata0.secondsRemaining = integer0;
      Integer integer1 = streamMetadata0.getSecondsRemaining();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = new Integer(358);
      streamMetadata0.setSecondsRemaining(integer0);
      Integer integer1 = streamMetadata0.getSecondsRemaining();
      assertEquals(358, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.reliability = "bMfJ8";
      String string0 = streamMetadata0.getReliability();
      assertEquals("bMfJ8", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setNextShowSeconds("");
      String string0 = streamMetadata0.getNextShowSeconds();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setDescription(",*:");
      String string0 = streamMetadata0.getDescription();
      assertEquals(",*:", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setCurrentShowId("a(#? ");
      String string0 = streamMetadata0.getCurrentShowId();
      assertEquals("a(#? ", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.currentShowId = "";
      String string0 = streamMetadata0.getCurrentShowId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.currentShow = "^b0FiX";
      String string0 = streamMetadata0.getCurrentShow();
      assertEquals("^b0FiX", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.currentShow = "";
      String string0 = streamMetadata0.getCurrentShow();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.currentHost = "&f\"T";
      String string0 = streamMetadata0.getCurrentHost();
      assertEquals("&f\"T", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.currentHost = "";
      String string0 = streamMetadata0.getCurrentHost();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = Integer.valueOf(0);
      streamMetadata0.bitrate = integer0;
      Integer integer1 = streamMetadata0.getBitrate();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = new Integer((-928));
      streamMetadata0.bitrate = integer0;
      Integer integer1 = streamMetadata0.getBitrate();
      assertEquals((-928), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = new Integer(1987);
      streamMetadata0.setBitrate(integer0);
      Integer integer1 = streamMetadata0.getBitrate();
      assertEquals(1987, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      AlbumArtUrl albumArtUrl0 = new AlbumArtUrl();
      streamMetadata0.setLogo(albumArtUrl0);
      AlbumArtUrl albumArtUrl1 = streamMetadata0.getLogo();
      assertNull(albumArtUrl1.isRequiresAuthentication());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getCurrentShowId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = streamMetadata0.getBitrate();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getNextShowSeconds();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setNextShowSeconds("Vra:]");
      String string0 = streamMetadata0.getNextShowSeconds();
      assertEquals("Vra:]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setCurrentHost("");
      assertNull(streamMetadata0.getCurrentShowId());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getCurrentHost();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setDescription("");
      String string0 = streamMetadata0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Boolean boolean0 = streamMetadata0.isIsEphemeral();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getReliability();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = streamMetadata0.getSecondsToNextShow();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setCurrentShow("0f");
      assertEquals("0f", streamMetadata0.getCurrentShow());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = streamMetadata0.getSecondsRemaining();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Boolean boolean0 = streamMetadata0.isHasOutOfBandMetadata();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setTitle("");
      assertNull(streamMetadata0.getDescription());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getSubtitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      Integer integer0 = Integer.valueOf(0);
      streamMetadata0.setSecondsToNextShow(integer0);
      Integer integer1 = streamMetadata0.getSecondsToNextShow();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      AlbumArtUrl albumArtUrl0 = streamMetadata0.getLogo();
      assertNull(albumArtUrl0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      streamMetadata0.setReliability("");
      String string0 = streamMetadata0.getReliability();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StreamMetadata streamMetadata0 = new StreamMetadata();
      String string0 = streamMetadata0.getCurrentShow();
      assertNull(string0);
  }
}