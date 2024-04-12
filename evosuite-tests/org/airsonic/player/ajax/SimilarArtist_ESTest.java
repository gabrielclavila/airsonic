/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:23:49 GMT 2024
 */

package org.airsonic.player.ajax;

import org.junit.Test;
import static org.junit.Assert.*;
import org.airsonic.player.ajax.SimilarArtist;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimilarArtist_ESTest extends SimilarArtist_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimilarArtist similarArtist0 = new SimilarArtist(0, "Om yk+bw");
      int int0 = similarArtist0.getMediaFileId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimilarArtist similarArtist0 = new SimilarArtist(2236, "e2tVnJRkXZ");
      int int0 = similarArtist0.getMediaFileId();
      assertEquals(2236, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SimilarArtist similarArtist0 = new SimilarArtist(0, "Om yk+bw");
      similarArtist0.getArtistName();
      assertEquals(0, similarArtist0.getMediaFileId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SimilarArtist similarArtist0 = new SimilarArtist(706, "");
      similarArtist0.getArtistName();
      assertEquals(706, similarArtist0.getMediaFileId());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SimilarArtist similarArtist0 = new SimilarArtist((-1355), (String) null);
      similarArtist0.getArtistName();
      assertEquals((-1355), similarArtist0.getMediaFileId());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SimilarArtist similarArtist0 = new SimilarArtist((-1355), (String) null);
      int int0 = similarArtist0.getMediaFileId();
      assertEquals((-1355), int0);
  }
}