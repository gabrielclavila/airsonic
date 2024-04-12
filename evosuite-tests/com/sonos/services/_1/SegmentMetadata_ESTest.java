/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:48:46 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.SegmentMetadata;
import javax.xml.datatype.XMLGregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentMetadata_ESTest extends SegmentMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setTrackId("com.sonos.services._1.SegmentMetadata");
      String string0 = segmentMetadata0.getTrackId();
      assertEquals("com.sonos.services._1.SegmentMetadata", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.trackId = "";
      String string0 = segmentMetadata0.getTrackId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.track = "h}u";
      String string0 = segmentMetadata0.getTrack();
      assertEquals("h}u", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setTrack("");
      String string0 = segmentMetadata0.getTrack();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.topic = "KiD:iC[Y-#!=k;Yj;1";
      String string0 = segmentMetadata0.getTopic();
      assertEquals("KiD:iC[Y-#!=k;Yj;1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setTopic("");
      String string0 = segmentMetadata0.getTopic();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.showId = "Po`Nd`q&Nb!!@|dG";
      String string0 = segmentMetadata0.getShowId();
      assertEquals("Po`Nd`q&Nb!!@|dG", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setShowId("");
      String string0 = segmentMetadata0.getShowId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setShow("^YupHf\"9~[I");
      String string0 = segmentMetadata0.getShow();
      assertEquals("^YupHf\"9~[I", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setShow("");
      String string0 = segmentMetadata0.getShow();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      Integer integer0 = new Integer(0);
      segmentMetadata0.rating = integer0;
      Integer integer1 = segmentMetadata0.getRating();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      Integer integer0 = new Integer((-1));
      segmentMetadata0.setRating(integer0);
      Integer integer1 = segmentMetadata0.getRating();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.id = "com.sonos.services._1.SegmentMetadata";
      String string0 = segmentMetadata0.getId();
      assertEquals("com.sonos.services._1.SegmentMetadata", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setHost("8f#4GOS3)80,cNq,|(");
      String string0 = segmentMetadata0.getHost();
      assertEquals("8f#4GOS3)80,cNq,|(", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.genreId = "C+";
      String string0 = segmentMetadata0.getGenreId();
      assertEquals("C+", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setGenreId("");
      String string0 = segmentMetadata0.getGenreId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setGenre("l");
      String string0 = segmentMetadata0.getGenre();
      assertEquals("l", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.genre = "";
      String string0 = segmentMetadata0.getGenre();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setEpisodeId("|i%dpee(APj=[Z5|8");
      String string0 = segmentMetadata0.getEpisodeId();
      assertEquals("|i%dpee(APj=[Z5|8", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setEpisodeId("");
      String string0 = segmentMetadata0.getEpisodeId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.episode = "YZeu";
      String string0 = segmentMetadata0.getEpisode();
      assertEquals("YZeu", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setDuration(5372);
      int int0 = segmentMetadata0.getDuration();
      assertEquals(5372, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setDuration((-1945));
      int int0 = segmentMetadata0.getDuration();
      assertEquals((-1945), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.composerId = "fR36";
      String string0 = segmentMetadata0.getComposerId();
      assertEquals("fR36", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setComposerId("");
      String string0 = segmentMetadata0.getComposerId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.composer = "jp<='";
      String string0 = segmentMetadata0.getComposer();
      assertEquals("jp<='", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setComposer("");
      String string0 = segmentMetadata0.getComposer();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setArtistId("^m");
      String string0 = segmentMetadata0.getArtistId();
      assertEquals("^m", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setArtistId("");
      String string0 = segmentMetadata0.getArtistId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.artist = "MQ:1zU? jweU";
      String string0 = segmentMetadata0.getArtist();
      assertEquals("MQ:1zU? jweU", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.artist = "";
      String string0 = segmentMetadata0.getArtist();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbumId("Jz7");
      String string0 = segmentMetadata0.getAlbumId();
      assertEquals("Jz7", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbumId("");
      String string0 = segmentMetadata0.getAlbumId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.albumArtistId = "c;";
      String string0 = segmentMetadata0.getAlbumArtistId();
      assertEquals("c;", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.albumArtistId = "";
      String string0 = segmentMetadata0.getAlbumArtistId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbumArtist("com.sonos.services._1.SegmentMetadata");
      String string0 = segmentMetadata0.getAlbumArtist();
      assertEquals("com.sonos.services._1.SegmentMetadata", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbumArtist("");
      String string0 = segmentMetadata0.getAlbumArtist();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbumArtURI("7JtNO");
      String string0 = segmentMetadata0.getAlbumArtURI();
      assertEquals("7JtNO", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbumArtURI("");
      String string0 = segmentMetadata0.getAlbumArtURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.album = "//=`oS2y1zQ?";
      String string0 = segmentMetadata0.getAlbum();
      assertEquals("//=`oS2y1zQ?", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      int int0 = segmentMetadata0.getDuration();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setEpisode("");
      String string0 = segmentMetadata0.getEpisode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getEpisode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getComposer();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setStartTime((XMLGregorianCalendar) null);
      assertNull(segmentMetadata0.getAlbumArtURI());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbumArtistId("vQxVp'Q6");
      assertNull(segmentMetadata0.getHost());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getComposerId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getEpisodeId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getShowId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getAlbumArtist();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getTopic();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      XMLGregorianCalendar xMLGregorianCalendar0 = segmentMetadata0.getStartTime();
      assertNull(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getShow();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getAlbumId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getAlbumArtURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      Integer integer0 = new Integer(1);
      segmentMetadata0.setRating(integer0);
      Integer integer1 = segmentMetadata0.getRating();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getGenre();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getAlbumArtistId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      Integer integer0 = segmentMetadata0.getRating();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setId("");
      String string0 = segmentMetadata0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getAlbum();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getArtistId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getGenreId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getArtist();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getTrack();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setArtist("");
      assertNull(segmentMetadata0.getAlbum());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getHost();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      String string0 = segmentMetadata0.getTrackId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setHost("");
      String string0 = segmentMetadata0.getHost();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SegmentMetadata segmentMetadata0 = new SegmentMetadata();
      segmentMetadata0.setAlbum("");
      String string0 = segmentMetadata0.getAlbum();
      assertEquals("", string0);
  }
}