/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:21:39 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.AlbumID3;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlbumID3_ESTest extends AlbumID3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setArtist("-1t#t87&\"p@DL");
      assertNull(albumID3_0.getArtistId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Integer integer0 = new Integer(0);
      albumID3_0.setYear(integer0);
      Integer integer1 = albumID3_0.getYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Integer integer0 = new Integer(1);
      albumID3_0.setYear(integer0);
      Integer integer1 = albumID3_0.getYear();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Integer integer0 = new Integer((-1));
      albumID3_0.setYear(integer0);
      Integer integer1 = albumID3_0.getYear();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setSongCount(2282);
      int int0 = albumID3_0.getSongCount();
      assertEquals(2282, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setSongCount((-1));
      int int0 = albumID3_0.getSongCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Long long0 = new Long(0L);
      albumID3_0.setPlayCount(long0);
      Long long1 = albumID3_0.getPlayCount();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Long long0 = new Long((-503L));
      albumID3_0.playCount = long0;
      Long long1 = albumID3_0.getPlayCount();
      assertEquals((-503L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Long long0 = new Long(2707);
      albumID3_0.playCount = long0;
      Long long1 = albumID3_0.getPlayCount();
      assertEquals(2707L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setName("org.subsonic.restapi.AlbumWithSongsID3");
      String string0 = albumID3_0.getName();
      assertEquals("org.subsonic.restapi.AlbumWithSongsID3", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setName("");
      String string0 = albumID3_0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setId("U,oEd!\"AHsZE&R@O9");
      String string0 = albumID3_0.getId();
      assertEquals("U,oEd!\"AHsZE&R@O9", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setId("");
      String string0 = albumID3_0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setGenre("org.subsonic.restapi.AlbumID3");
      String string0 = albumID3_0.getGenre();
      assertEquals("org.subsonic.restapi.AlbumID3", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.genre = null;
      albumID3_0.genre = "";
      String string0 = albumID3_0.getGenre();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setDuration(2730);
      int int0 = albumID3_0.getDuration();
      assertEquals(2730, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setDuration((-1));
      int int0 = albumID3_0.getDuration();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.coverArt = "ng6GqY2rGnTzD";
      String string0 = albumID3_0.getCoverArt();
      assertEquals("ng6GqY2rGnTzD", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setCoverArt("");
      String string0 = albumID3_0.getCoverArt();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.artistId = "6r9OU\"l^i^HhIe<_";
      String string0 = albumID3_0.getArtistId();
      assertEquals("6r9OU\"l^i^HhIe<_", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setArtistId("");
      String string0 = albumID3_0.getArtistId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.artist = "J ?3";
      String string0 = albumID3_0.getArtist();
      assertEquals("J ?3", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.artist = "";
      String string0 = albumID3_0.getArtist();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Integer integer0 = albumID3_0.getYear();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      String string0 = albumID3_0.getGenre();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      Long long0 = albumID3_0.getPlayCount();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setStarred((XMLGregorianCalendar) null);
      assertNull(albumID3_0.getName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      int int0 = albumID3_0.getSongCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      albumID3_0.setCreated((XMLGregorianCalendar) null);
      assertNull(albumID3_0.getId());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      String string0 = albumID3_0.getArtist();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      String string0 = albumID3_0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      XMLGregorianCalendar xMLGregorianCalendar0 = albumID3_0.getCreated();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      String string0 = albumID3_0.getCoverArt();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      int int0 = albumID3_0.getDuration();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      XMLGregorianCalendar xMLGregorianCalendar0 = albumID3_0.getStarred();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      String string0 = albumID3_0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AlbumID3 albumID3_0 = new AlbumID3();
      String string0 = albumID3_0.getArtistId();
      assertNull(string0);
  }
}
