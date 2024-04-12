/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:25:00 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.NowPlayingEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NowPlayingEntry_ESTest extends NowPlayingEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setUsername("");
      String string0 = nowPlayingEntry0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setPlayerName("K2|7b_leiZ)tTg ");
      String string0 = nowPlayingEntry0.getPlayerName();
      assertEquals("K2|7b_leiZ)tTg ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setPlayerId(8);
      int int0 = nowPlayingEntry0.getPlayerId();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setPlayerId((-3080));
      int int0 = nowPlayingEntry0.getPlayerId();
      assertEquals((-3080), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setMinutesAgo(566);
      int int0 = nowPlayingEntry0.getMinutesAgo();
      assertEquals(566, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setMinutesAgo((-4669));
      int int0 = nowPlayingEntry0.getMinutesAgo();
      assertEquals((-4669), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setPlayerName("");
      String string0 = nowPlayingEntry0.getPlayerName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      String string0 = nowPlayingEntry0.getPlayerName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      int int0 = nowPlayingEntry0.getMinutesAgo();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      String string0 = nowPlayingEntry0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      int int0 = nowPlayingEntry0.getPlayerId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      nowPlayingEntry0.setUsername("AUDIOBOOK");
      String string0 = nowPlayingEntry0.getUsername();
      assertEquals("AUDIOBOOK", string0);
  }
}