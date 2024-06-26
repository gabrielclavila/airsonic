/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:32:23 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.NowPlaying;
import org.subsonic.restapi.NowPlayingEntry;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NowPlaying_ESTest extends NowPlaying_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NowPlaying nowPlaying0 = new NowPlaying();
      LinkedList<NowPlayingEntry> linkedList0 = new LinkedList<NowPlayingEntry>();
      NowPlayingEntry nowPlayingEntry0 = new NowPlayingEntry();
      linkedList0.add(nowPlayingEntry0);
      nowPlaying0.entry = (List<NowPlayingEntry>) linkedList0;
      List<NowPlayingEntry> list0 = nowPlaying0.getEntry();
      assertTrue(list0.contains(nowPlayingEntry0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NowPlaying nowPlaying0 = new NowPlaying();
      nowPlaying0.getEntry();
      List<NowPlayingEntry> list0 = nowPlaying0.getEntry();
      assertEquals(0, list0.size());
  }
}
