/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:16:22 GMT 2024
 */

package org.airsonic.player.command;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.airsonic.player.command.SearchCommand;
import org.airsonic.player.domain.MediaFile;
import org.airsonic.player.domain.Player;
import org.airsonic.player.domain.PlayerTechnology;
import org.airsonic.player.domain.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchCommand_ESTest extends SearchCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MediaFile.MediaType mediaFile_MediaType0 = MediaFile.MediaType.MUSIC;
      Integer integer0 = new Integer(294);
      Long long0 = new Long((-3795L));
      MediaFile mediaFile0 = new MediaFile(256, "", "", mediaFile_MediaType0, "", "", "STOPPED", "STOPPED", "", integer0, (Integer) null, (Integer) null, (String) null, integer0, true, (Integer) null, long0, integer0, (Integer) null, "", "", 294, (Date) null, "ii}UPa8EGHW)-adV", (Date) null, (Date) null, (Date) null, (Date) null, true, (-1731), "ii}UPa8EGHW)-adV", "ii}UPa8EGHW)-adV");
      SearchCommand.Match searchCommand_Match0 = new SearchCommand.Match(mediaFile0, "`lw8#D", "", "`lw8#D");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchCommand.Match searchCommand_Match0 = new SearchCommand.Match((MediaFile) null, "org.airsonic.player.domain.PlayQueue$SortOrder", "", "");
      assertEquals("", searchCommand_Match0.getAlbum());
      assertEquals("", searchCommand_Match0.getArtist());
      assertEquals("org.airsonic.player.domain.PlayQueue$SortOrder", searchCommand_Match0.getTitle());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      searchCommand0.setPartyModeEnabled(true);
      boolean boolean0 = searchCommand0.isPartyModeEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      searchCommand0.setIndexBeingCreated(true);
      boolean boolean0 = searchCommand0.isIndexBeingCreated();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("", "#ZBOR=_p+A(H", "#ZBOR=_p+A(H");
      user0.setUploadRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertFalse(user1.isAdminRole());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User((String) null, (String) null, "@g|aDJ6U");
      user0.setStreamRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertSame(user1, user0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("", "", "");
      searchCommand0.setUser(user0);
      user0.setShareRole(true);
      User user1 = searchCommand0.getUser();
      assertEquals("", user1.getPassword());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("ALBUM", "ALBUM", "", true, 0L, 0L, 0L);
      user0.setPodcastRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertEquals("ALBUM", user1.getUsername());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("*HRM%K", "*HRM%K", "*HRM%K");
      user0.setPlaylistRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertEquals("*HRM%K", user1.getPassword());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("", "@7X;@w", "A%oy0?kBRs#nEJZ>", true, 0L, 0L, (-4098L));
      user0.setJukeboxRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertFalse(user1.isStreamRole());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User((String) null, (String) null, "@g|aDJ6U");
      user0.setDownloadRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertFalse(user1.isUploadRole());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("", "org.airsonic.player.command.SearchCommand$Match", "ikuV%zb|VR", true, 1324L, 1L, 2337L);
      user0.setCoverArtRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertFalse(user1.isUploadRole());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("", "org.airsonic.player.command.SearchCommand$Match", "ikuV%zb|VR", true, 1324L, 1L, 2337L);
      user0.setCommentRole(true);
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertFalse(user1.isDownloadRole());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("", "", "");
      searchCommand0.setUser(user0);
      user0.setAdminRole(true);
      User user1 = searchCommand0.getUser();
      assertFalse(user1.isShareRole());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = new User("mOMQD68b%rI_Em", "mOMQD68b%rI_Em", "mOMQD68b%rI_Em", true, (-1187L), (-1187L), (-1187L));
      searchCommand0.setUser(user0);
      User user1 = searchCommand0.getUser();
      assertFalse(user1.isShareRole());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Vector<MediaFile> vector0 = new Vector<MediaFile>();
      searchCommand0.setSongs(vector0);
      List<MediaFile> list0 = searchCommand0.getSongs();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      ArrayList<MediaFile> arrayList0 = new ArrayList<MediaFile>();
      MediaFile mediaFile0 = new MediaFile();
      arrayList0.add(mediaFile0);
      searchCommand0.setSongs(arrayList0);
      searchCommand0.getSongs();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      searchCommand0.setQuery("wk{=PnuACOst!=");
      String string0 = searchCommand0.getQuery();
      assertEquals("wk{=PnuACOst!=", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      searchCommand0.setQuery("");
      String string0 = searchCommand0.getQuery();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Player player0 = new Player();
      player0.setM3uBomEnabled(false);
      searchCommand0.setPlayer(player0);
      Player player1 = searchCommand0.getPlayer();
      assertFalse(player1.isM3uBomEnabled());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Player player0 = new Player();
      PlayerTechnology playerTechnology0 = PlayerTechnology.JAVA_JUKEBOX;
      player0.setTechnology(playerTechnology0);
      searchCommand0.setPlayer(player0);
      Player player1 = searchCommand0.getPlayer();
      assertFalse(player1.isExternal());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Player player0 = new Player();
      PlayerTechnology playerTechnology0 = PlayerTechnology.EXTERNAL_WITH_PLAYLIST;
      player0.setTechnology(playerTechnology0);
      searchCommand0.setPlayer(player0);
      Player player1 = searchCommand0.getPlayer();
      assertNull(player1.getJavaJukeboxMixer());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Player player0 = new Player();
      PlayerTechnology playerTechnology0 = PlayerTechnology.EXTERNAL;
      player0.setTechnology(playerTechnology0);
      searchCommand0.setPlayer(player0);
      Player player1 = searchCommand0.getPlayer();
      assertNull(player1.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Player player0 = new Player();
      player0.setDynamicIp(false);
      searchCommand0.setPlayer(player0);
      Player player1 = searchCommand0.getPlayer();
      assertNull(player1.getId());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Player player0 = new Player();
      player0.setAutoControlEnabled(false);
      searchCommand0.setPlayer(player0);
      Player player1 = searchCommand0.getPlayer();
      assertNull(player1.getId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Vector<MediaFile> vector0 = new Vector<MediaFile>();
      searchCommand0.setArtists(vector0);
      List<MediaFile> list0 = searchCommand0.getArtists();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Vector<MediaFile> vector0 = new Vector<MediaFile>();
      MediaFile mediaFile0 = new MediaFile();
      vector0.add(mediaFile0);
      searchCommand0.setArtists(vector0);
      searchCommand0.getArtists();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Vector<MediaFile> vector0 = new Vector<MediaFile>();
      vector0.add((MediaFile) null);
      searchCommand0.setAlbums(vector0);
      List<MediaFile> list0 = searchCommand0.getAlbums();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      List<MediaFile> list0 = searchCommand0.getSongs();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      User user0 = searchCommand0.getUser();
      assertNull(user0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      boolean boolean0 = searchCommand0.isPartyModeEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      List<MediaFile> list0 = searchCommand0.getArtists();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      String string0 = searchCommand0.getQuery();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Player player0 = searchCommand0.getPlayer();
      assertNull(player0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      boolean boolean0 = searchCommand0.isIndexBeingCreated();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      Stack<MediaFile> stack0 = new Stack<MediaFile>();
      searchCommand0.setAlbums(stack0);
      List<MediaFile> list0 = searchCommand0.getAlbums();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SearchCommand searchCommand0 = new SearchCommand();
      List<MediaFile> list0 = searchCommand0.getAlbums();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MediaFile mediaFile0 = new MediaFile();
      SearchCommand.Match searchCommand_Match0 = new SearchCommand.Match(mediaFile0, "j$(|p-2H2vZ)HZ0Yt", "j$(|p-2H2vZ)HZ0Yt", "j$(|p-2H2vZ)HZ0Yt");
      searchCommand_Match0.getMediaFile();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SearchCommand.Match searchCommand_Match0 = new SearchCommand.Match((MediaFile) null, "oQ6+(`", "oQ6+(`", "oQ6+(`");
      String string0 = searchCommand_Match0.getTitle();
      assertEquals("oQ6+(`", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MediaFile mediaFile0 = new MediaFile();
      SearchCommand.Match searchCommand_Match0 = new SearchCommand.Match(mediaFile0, "U", "U", "U");
      searchCommand_Match0.getAlbum();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MediaFile mediaFile0 = new MediaFile();
      SearchCommand.Match searchCommand_Match0 = new SearchCommand.Match(mediaFile0, "j$(|p-2H2vZ)HZ0Yt", "j$(|p-2H2vZ)HZ0Yt", "j$(|p-2H2vZ)HZ0Yt");
      searchCommand_Match0.getArtist();
  }
}