/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:21:51 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.AlbumArtUrl;
import com.sonos.services._1.TrackMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TrackMetadata_ESTest extends TrackMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.valueOf("");
      trackMetadata0.setCanResume(boolean0);
      assertNull(trackMetadata0.getBook());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.TRUE;
      trackMetadata0.setCanSkip(boolean0);
      assertNull(trackMetadata0.getArtist());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = new Boolean(true);
      trackMetadata0.setCanPlay(boolean0);
      assertNull(trackMetadata0.getTrackNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      AlbumArtUrl albumArtUrl0 = new AlbumArtUrl();
      trackMetadata0.albumArtURI = albumArtUrl0;
      trackMetadata0.setAlbumArtURI((AlbumArtUrl) null);
      assertNull(trackMetadata0.getArtistId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer((-1));
      trackMetadata0.setDuration(integer0);
      assertNull(trackMetadata0.getTrackNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setGenre("");
      assertNull(trackMetadata0.getNarrator());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAlbum("com.sonos.services._1.AlbumArtUrl");
      assertNull(trackMetadata0.getNarrator());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.TRUE;
      trackMetadata0.setHasOutOfBandMetadata(boolean0);
      Boolean boolean1 = trackMetadata0.isHasOutOfBandMetadata();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = new Boolean("");
      trackMetadata0.setHasOutOfBandMetadata(boolean0);
      Boolean boolean1 = trackMetadata0.isHasOutOfBandMetadata();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.TRUE;
      trackMetadata0.canSkip = boolean0;
      Boolean boolean1 = trackMetadata0.isCanSkip();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = new Boolean((String) null);
      trackMetadata0.canSkip = boolean0;
      Boolean boolean1 = trackMetadata0.isCanSkip();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.TRUE;
      trackMetadata0.setCanSeek(boolean0);
      Boolean boolean1 = trackMetadata0.isCanSeek();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = new Boolean("{GE");
      trackMetadata0.setCanSeek(boolean0);
      Boolean boolean1 = trackMetadata0.isCanSeek();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = new Boolean(true);
      trackMetadata0.canResume = boolean0;
      Boolean boolean1 = trackMetadata0.isCanResume();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = new Boolean("{GE");
      trackMetadata0.canResume = boolean0;
      Boolean boolean1 = trackMetadata0.isCanResume();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.TRUE;
      trackMetadata0.canPlay = boolean0;
      Boolean boolean1 = trackMetadata0.isCanPlay();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.valueOf(false);
      trackMetadata0.canPlay = boolean0;
      Boolean boolean1 = trackMetadata0.isCanPlay();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.TRUE;
      trackMetadata0.setCanAddToFavorites(boolean0);
      Boolean boolean1 = trackMetadata0.isCanAddToFavorites();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = Boolean.FALSE;
      trackMetadata0.setCanAddToFavorites(boolean0);
      Boolean boolean1 = trackMetadata0.isCanAddToFavorites();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer(0);
      trackMetadata0.trackNumber = integer0;
      Integer integer1 = trackMetadata0.getTrackNumber();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer(638);
      trackMetadata0.trackNumber = integer0;
      Integer integer1 = trackMetadata0.getTrackNumber();
      assertEquals(638, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer((-2871));
      trackMetadata0.setTrackNumber(integer0);
      Integer integer1 = trackMetadata0.getTrackNumber();
      assertEquals((-2871), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer(1);
      trackMetadata0.setRating(integer0);
      Integer integer1 = trackMetadata0.getRating();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer(0);
      trackMetadata0.rating = integer0;
      Integer integer1 = trackMetadata0.getRating();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer((-1938));
      trackMetadata0.setRating(integer0);
      Integer integer1 = trackMetadata0.getRating();
      assertEquals((-1938), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer((-1));
      trackMetadata0.rating = integer0;
      Integer integer1 = trackMetadata0.getRating();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setNarratorId("c,/v4f_K?l");
      String string0 = trackMetadata0.getNarratorId();
      assertEquals("c,/v4f_K?l", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setNarratorId("");
      String string0 = trackMetadata0.getNarratorId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setNarrator("com.sonos.services._1.TrackMetadata");
      String string0 = trackMetadata0.getNarrator();
      assertEquals("com.sonos.services._1.TrackMetadata", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setNarrator("");
      String string0 = trackMetadata0.getNarrator();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setGenreId("i|");
      String string0 = trackMetadata0.getGenreId();
      assertEquals("i|", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setGenreId("");
      String string0 = trackMetadata0.getGenreId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.genre = "com.sonos.services._1.TrackMetadata";
      String string0 = trackMetadata0.getGenre();
      assertEquals("com.sonos.services._1.TrackMetadata", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.genre = "";
      String string0 = trackMetadata0.getGenre();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer(0);
      trackMetadata0.duration = integer0;
      Integer integer1 = trackMetadata0.getDuration();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer(1);
      trackMetadata0.duration = integer0;
      Integer integer1 = trackMetadata0.getDuration();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = new Integer((-2384));
      trackMetadata0.duration = integer0;
      Integer integer1 = trackMetadata0.getDuration();
      assertEquals((-2384), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setComposerId("");
      String string0 = trackMetadata0.getComposerId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setComposer("(etW75ih/F~Y");
      String string0 = trackMetadata0.getComposer();
      assertEquals("(etW75ih/F~Y", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.composer = "";
      String string0 = trackMetadata0.getComposer();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.bookId = "y(PQ";
      String string0 = trackMetadata0.getBookId();
      assertEquals("y(PQ", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setBookId("");
      String string0 = trackMetadata0.getBookId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.book = ".";
      String string0 = trackMetadata0.getBook();
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setBook("");
      String string0 = trackMetadata0.getBook();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.authorId = "";
      String string0 = trackMetadata0.getAuthorId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAuthor(",lLG8|fM4MwY");
      String string0 = trackMetadata0.getAuthor();
      assertEquals(",lLG8|fM4MwY", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAuthor("");
      String string0 = trackMetadata0.getAuthor();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setArtistId("#t6L\"J.PkykOh]n&t");
      String string0 = trackMetadata0.getArtistId();
      assertEquals("#t6L\"J.PkykOh]n&t", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.artistId = "";
      String string0 = trackMetadata0.getArtistId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.artist = "3c&=?ySN#'wke{";
      String string0 = trackMetadata0.getArtist();
      assertEquals("3c&=?ySN#'wke{", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setArtist("");
      String string0 = trackMetadata0.getArtist();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAlbumId("R1F&{-.");
      String string0 = trackMetadata0.getAlbumId();
      assertEquals("R1F&{-.", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAlbumId("");
      String string0 = trackMetadata0.getAlbumId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.albumArtistId = "'e_T;qj,BTR\"7Q";
      String string0 = trackMetadata0.getAlbumArtistId();
      assertEquals("'e_T;qj,BTR\"7Q", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.albumArtistId = "";
      String string0 = trackMetadata0.getAlbumArtistId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.albumArtist = "RO otkm";
      String string0 = trackMetadata0.getAlbumArtist();
      assertEquals("RO otkm", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAlbumArtist("");
      String string0 = trackMetadata0.getAlbumArtist();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      AlbumArtUrl albumArtUrl0 = new AlbumArtUrl();
      trackMetadata0.albumArtURI = albumArtUrl0;
      AlbumArtUrl albumArtUrl1 = trackMetadata0.getAlbumArtURI();
      assertSame(albumArtUrl1, albumArtUrl0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.album = "2Zn{9yF7AMB";
      String string0 = trackMetadata0.getAlbum();
      assertEquals("2Zn{9yF7AMB", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.album = "";
      String string0 = trackMetadata0.getAlbum();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getArtistId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      AlbumArtUrl albumArtUrl0 = trackMetadata0.getAlbumArtURI();
      assertNull(albumArtUrl0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getBookId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = trackMetadata0.isCanAddToFavorites();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getBook();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = trackMetadata0.getRating();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = trackMetadata0.isCanSeek();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = trackMetadata0.isCanSkip();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getAlbumId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setComposerId("%#5+p`FjwaA+bKjpF/7");
      String string0 = trackMetadata0.getComposerId();
      assertEquals("%#5+p`FjwaA+bKjpF/7", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = trackMetadata0.getDuration();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getAlbumArtist();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getComposerId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getGenreId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAlbumArtistId("%#5+p`FjwaA+bKjpF/7");
      assertNull(trackMetadata0.isCanPlay());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getGenre();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = trackMetadata0.isCanResume();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getAlbum();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      trackMetadata0.setAuthorId("%#5+p`FjwaA+bKjpF/7");
      String string0 = trackMetadata0.getAuthorId();
      assertEquals("%#5+p`FjwaA+bKjpF/7", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getArtist();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = trackMetadata0.isCanPlay();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getNarrator();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getAuthorId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Integer integer0 = trackMetadata0.getTrackNumber();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getAlbumArtistId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getAuthor();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getComposer();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      String string0 = trackMetadata0.getNarratorId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      TrackMetadata trackMetadata0 = new TrackMetadata();
      Boolean boolean0 = trackMetadata0.isHasOutOfBandMetadata();
      assertNull(boolean0);
  }
}