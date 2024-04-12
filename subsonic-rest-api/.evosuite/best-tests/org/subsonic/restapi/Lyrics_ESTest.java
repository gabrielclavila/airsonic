/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:52:30 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.Lyrics;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Lyrics_ESTest extends Lyrics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      lyrics0.setTitle("org.subsonic.restapi.Lyrics");
      String string0 = lyrics0.getTitle();
      assertEquals("org.subsonic.restapi.Lyrics", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      lyrics0.setTitle("");
      String string0 = lyrics0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      lyrics0.setContent("i9L>`cac[6");
      String string0 = lyrics0.getContent();
      assertEquals("i9L>`cac[6", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      lyrics0.content = "";
      String string0 = lyrics0.getContent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      lyrics0.artist = "";
      lyrics0.artist = "wQybK";
      String string0 = lyrics0.getArtist();
      assertEquals("wQybK", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      lyrics0.artist = "aRO<gfT`e\"LJb 6vS";
      lyrics0.artist = "";
      String string0 = lyrics0.getArtist();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      lyrics0.setArtist("");
      assertNull(lyrics0.getTitle());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      String string0 = lyrics0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      String string0 = lyrics0.getArtist();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Lyrics lyrics0 = new Lyrics();
      String string0 = lyrics0.getContent();
      assertNull(string0);
  }
}