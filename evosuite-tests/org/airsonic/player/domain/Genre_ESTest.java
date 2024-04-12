/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:10:10 GMT 2024
 */

package org.airsonic.player.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import org.airsonic.player.domain.Genre;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Genre_ESTest extends Genre_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Genre genre0 = new Genre("KRL%]", 0, 0);
      int int0 = genre0.getSongCount();
      assertEquals(0, int0);
      assertEquals(0, genre0.getAlbumCount());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Genre genre0 = new Genre("q/ByQh,C{eE%", (-565), 1);
      int int0 = genre0.getSongCount();
      assertEquals((-565), int0);
      assertEquals(1, genre0.getAlbumCount());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Genre genre0 = new Genre((String) null);
      String string0 = genre0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Genre genre0 = new Genre(";7\bUh0JMH", 0, 0);
      genre0.getName();
      assertEquals(0, genre0.getSongCount());
      assertEquals(0, genre0.getAlbumCount());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Genre genre0 = new Genre("KRL%]", 0, 0);
      int int0 = genre0.getAlbumCount();
      assertEquals(0, genre0.getSongCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Genre genre0 = new Genre(";7\bUh0JMH", 0, 0);
      genre0.incrementAlbumCount();
      int int0 = genre0.getAlbumCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Genre genre0 = new Genre("", 2834, (-758));
      int int0 = genre0.getAlbumCount();
      assertEquals((-758), int0);
      assertEquals(2834, genre0.getSongCount());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Genre genre0 = new Genre("", 2834, (-758));
      genre0.getName();
      assertEquals((-758), genre0.getAlbumCount());
      assertEquals(2834, genre0.getSongCount());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Genre genre0 = new Genre("", 2834, (-758));
      int int0 = genre0.getSongCount();
      assertEquals((-758), genre0.getAlbumCount());
      assertEquals(2834, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Genre genre0 = new Genre("");
      genre0.incrementSongCount();
      assertEquals(1, genre0.getSongCount());
  }
}
