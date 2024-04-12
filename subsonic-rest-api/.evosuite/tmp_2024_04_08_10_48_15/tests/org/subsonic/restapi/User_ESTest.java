/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:21:32 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.User;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      User user0 = new User();
      user0.setJukeboxRole(true);
      assertTrue(user0.isJukeboxRole());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      User user0 = new User();
      user0.setPlaylistRole(true);
      assertTrue(user0.isPlaylistRole());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      User user0 = new User();
      user0.setDownloadRole(true);
      assertTrue(user0.isDownloadRole());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      User user0 = new User();
      user0.setVideoConversionRole(true);
      boolean boolean0 = user0.isVideoConversionRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      User user0 = new User();
      user0.setUploadRole(true);
      boolean boolean0 = user0.isUploadRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      User user0 = new User();
      user0.setShareRole(true);
      boolean boolean0 = user0.isShareRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      User user0 = new User();
      user0.setSettingsRole(true);
      boolean boolean0 = user0.isSettingsRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      User user0 = new User();
      user0.scrobblingEnabled = true;
      boolean boolean0 = user0.isScrobblingEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      User user0 = new User();
      user0.setPodcastRole(true);
      boolean boolean0 = user0.isPodcastRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      User user0 = new User();
      user0.playlistRole = true;
      boolean boolean0 = user0.isPlaylistRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      User user0 = new User();
      user0.jukeboxRole = true;
      boolean boolean0 = user0.isJukeboxRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      User user0 = new User();
      user0.downloadRole = true;
      boolean boolean0 = user0.isDownloadRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      User user0 = new User();
      user0.setCoverArtRole(true);
      boolean boolean0 = user0.isCoverArtRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      User user0 = new User();
      user0.setCommentRole(true);
      boolean boolean0 = user0.isCommentRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      User user0 = new User();
      user0.setAdminRole(true);
      boolean boolean0 = user0.isAdminRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      User user0 = new User();
      user0.setUsername("Y_%1bn#.B^}o");
      String string0 = user0.getUsername();
      assertEquals("Y_%1bn#.B^}o", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      User user0 = new User();
      user0.username = "";
      String string0 = user0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      User user0 = new User();
      Integer integer0 = new Integer(0);
      user0.setMaxBitRate(integer0);
      Integer integer1 = user0.getMaxBitRate();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      User user0 = new User();
      Integer integer0 = Integer.valueOf(2858);
      user0.maxBitRate = integer0;
      Integer integer1 = user0.getMaxBitRate();
      assertEquals(2858, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      User user0 = new User();
      Integer integer0 = new Integer((-84));
      user0.maxBitRate = integer0;
      Integer integer1 = user0.getMaxBitRate();
      assertEquals((-84), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      User user0 = new User();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      user0.folder = (List<Integer>) linkedList0;
      Integer integer0 = new Integer((-3845));
      linkedList0.add(integer0);
      List<Integer> list0 = user0.getFolder();
      assertTrue(list0.contains((-3845)));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      User user0 = new User();
      user0.setEmail("0eviS/x^");
      String string0 = user0.getEmail();
      assertEquals("0eviS/x^", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      User user0 = new User();
      user0.setEmail("");
      String string0 = user0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      User user0 = new User();
      user0.getFolder();
      List<Integer> list0 = user0.getFolder();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      User user0 = new User();
      Integer integer0 = user0.getMaxBitRate();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isUploadRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isPodcastRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isJukeboxRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isSettingsRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isCoverArtRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      User user0 = new User();
      user0.setStreamRole(true);
      boolean boolean0 = user0.isStreamRole();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      User user0 = new User();
      user0.setAvatarLastChanged((XMLGregorianCalendar) null);
      assertFalse(user0.isUploadRole());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isStreamRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isCommentRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isScrobblingEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      User user0 = new User();
      XMLGregorianCalendar xMLGregorianCalendar0 = user0.getAvatarLastChanged();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isDownloadRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isAdminRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isPlaylistRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      User user0 = new User();
      user0.setScrobblingEnabled(true);
      assertTrue(user0.isScrobblingEnabled());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isVideoConversionRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isShareRole();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getUsername();
      assertNull(string0);
  }
}