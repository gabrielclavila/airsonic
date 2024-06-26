/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:26:04 GMT 2024
 */

package org.airsonic.player.ajax;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.airsonic.player.ajax.PlaylistInfo;
import org.airsonic.player.domain.Playlist;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaylistInfo_ESTest extends PlaylistInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(0, "", (String) null, "", "", false, true);
      assertFalse(playlistInfo_Entry0.isStarred());
      assertTrue(playlistInfo_Entry0.isPresent());
      assertEquals(0, playlistInfo_Entry0.getId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(2450, "x=a{H", (String) null, (String) null, "$OSZ6UGW^j", false, false);
      assertFalse(playlistInfo_Entry0.isPresent());
      assertFalse(playlistInfo_Entry0.isStarred());
      assertEquals(2450, playlistInfo_Entry0.getId());
      assertEquals("$OSZ6UGW^j", playlistInfo_Entry0.getDurationAsString());
      assertEquals("x=a{H", playlistInfo_Entry0.getTitle());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo((Playlist) null, linkedList0);
      Playlist playlist0 = playlistInfo0.getPlaylist();
      assertNull(playlist0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(201);
      Playlist playlist0 = new Playlist(201, "? J`5", true, "", "YH/VAmCA", (-4854), (-400), mockDate0, mockDate0, "Sfk}7D'-eCRK");
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo(playlist0, linkedList0);
      Playlist playlist1 = playlistInfo0.getPlaylist();
      assertEquals("? J`5", playlist1.getUsername());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Playlist playlist0 = new Playlist(0, "org.airsonic.player.domain.Playlist", false, "org.airsonic.player.ajax.PlaylistInfo", "org.airsonic.player.ajax.PlaylistInfo", (-2771), (-530), (Date) null, (Date) null, "");
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo(playlist0, linkedList0);
      Playlist playlist1 = playlistInfo0.getPlaylist();
      assertEquals((-530), playlist1.getDurationSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((long) 2450, (long) 2450);
      Date date0 = Date.from(instant0);
      Playlist playlist0 = new Playlist(1, ")*", false, ")*", (String) null, 0, 1171, (Date) null, date0, ")*");
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo(playlist0, linkedList0);
      Playlist playlist1 = playlistInfo0.getPlaylist();
      assertSame(playlist0, playlist1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 1989, 2573, 2573, (-1));
      Playlist playlist0 = new Playlist((-3047), "Dc_`.xd`Yar,wtt ", false, "g7", "Dc_`.xd`Yar,wtt ", 2573, (-1), mockDate0, mockDate0, "");
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo(playlist0, linkedList0);
      Playlist playlist1 = playlistInfo0.getPlaylist();
      assertEquals((-1), playlist1.getDurationSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Playlist playlist0 = new Playlist(2936, "Bze@zJ}XVKkq}lVEFA9", false, "", "Bze@zJ}XVKkq}lVEFA9", 1, 1, mockDate0, mockDate0, "");
      PlaylistInfo playlistInfo0 = new PlaylistInfo(playlist0, (List<PlaylistInfo.Entry>) null);
      List<PlaylistInfo.Entry> list0 = playlistInfo0.getEntries();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(0, "okfd0d+|m|\"*e", "", "okfd0d+|m|\"*e", "b_chi74?9ky)!(:", false, false);
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo((Playlist) null, linkedList0);
      linkedList0.add(playlistInfo_Entry0);
      List<PlaylistInfo.Entry> list0 = playlistInfo0.getEntries();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(3528, "*", "*", "*", "*", true, true);
      boolean boolean0 = playlistInfo_Entry0.isStarred();
      assertTrue(playlistInfo_Entry0.isPresent());
      assertEquals(3528, playlistInfo_Entry0.getId());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(3528, "*", "*", "*", "*", true, true);
      boolean boolean0 = playlistInfo_Entry0.isPresent();
      assertTrue(playlistInfo_Entry0.isStarred());
      assertTrue(boolean0);
      assertEquals(3528, playlistInfo_Entry0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(3528, "*", "*", "*", "*", true, true);
      playlistInfo_Entry0.getDurationAsString();
      assertTrue(playlistInfo_Entry0.isPresent());
      assertTrue(playlistInfo_Entry0.isStarred());
      assertEquals(3528, playlistInfo_Entry0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(3528, "*", "*", "*", "*", true, true);
      playlistInfo_Entry0.getAlbum();
      assertEquals(3528, playlistInfo_Entry0.getId());
      assertTrue(playlistInfo_Entry0.isPresent());
      assertTrue(playlistInfo_Entry0.isStarred());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(3528, "*", "*", "*", "*", true, true);
      int int0 = playlistInfo_Entry0.getId();
      assertTrue(playlistInfo_Entry0.isStarred());
      assertEquals(3528, int0);
      assertTrue(playlistInfo_Entry0.isPresent());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(3528, "*", "*", "*", "*", true, true);
      playlistInfo_Entry0.getArtist();
      assertTrue(playlistInfo_Entry0.isPresent());
      assertEquals(3528, playlistInfo_Entry0.getId());
      assertTrue(playlistInfo_Entry0.isStarred());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PlaylistInfo.Entry playlistInfo_Entry0 = new PlaylistInfo.Entry(3528, "*", "*", "*", "*", true, true);
      playlistInfo_Entry0.getTitle();
      assertTrue(playlistInfo_Entry0.isPresent());
      assertEquals(3528, playlistInfo_Entry0.getId());
      assertTrue(playlistInfo_Entry0.isStarred());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo(playlist0, linkedList0);
      List<PlaylistInfo.Entry> list0 = playlistInfo0.getEntries();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Playlist playlist0 = new Playlist();
      LinkedList<PlaylistInfo.Entry> linkedList0 = new LinkedList<PlaylistInfo.Entry>();
      PlaylistInfo playlistInfo0 = new PlaylistInfo(playlist0, linkedList0);
      Playlist playlist1 = playlistInfo0.getPlaylist();
      assertSame(playlist0, playlist1);
  }
}
