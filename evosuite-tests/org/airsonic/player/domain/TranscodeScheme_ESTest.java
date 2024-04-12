/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:57:32 GMT 2024
 */

package org.airsonic.player.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import org.airsonic.player.domain.TranscodeScheme;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TranscodeScheme_ESTest extends TranscodeScheme_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.MAX_128;
      TranscodeScheme transcodeScheme1 = TranscodeScheme.valueOf("MAX_64");
      TranscodeScheme transcodeScheme2 = transcodeScheme0.strictest(transcodeScheme1);
      assertEquals(TranscodeScheme.MAX_64, transcodeScheme2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.fromMaxBitRate(0);
      assertEquals(TranscodeScheme.OFF, transcodeScheme0);
      
      TranscodeScheme transcodeScheme1 = TranscodeScheme.MAX_96;
      TranscodeScheme transcodeScheme2 = transcodeScheme0.strictest(transcodeScheme1);
      assertEquals(96, transcodeScheme2.getMaxBitRate());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TranscodeScheme[] transcodeSchemeArray0 = TranscodeScheme.values();
      assertEquals(15, transcodeSchemeArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.valueOf("OFF");
      assertEquals(TranscodeScheme.OFF, transcodeScheme0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TranscodeScheme.valueOf(2294);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.valueOf(0);
      assertEquals(TranscodeScheme.OFF, transcodeScheme0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.valueOf(128);
      assertEquals(128, transcodeScheme0.getMaxBitRate());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.valueOf("MAX_128");
      int int0 = transcodeScheme0.getMaxBitRate();
      assertEquals(128, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.fromMaxBitRate(115);
      assertEquals(128, transcodeScheme0.getMaxBitRate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.fromMaxBitRate(0);
      int int0 = transcodeScheme0.getMaxBitRate();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.fromMaxBitRate((-1280));
      String string0 = transcodeScheme0.toString();
      assertEquals("No limit", string0);
      assertEquals(0, transcodeScheme0.getMaxBitRate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.MAX_48;
      String string0 = transcodeScheme0.toString();
      assertEquals("48 Kbps", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.MAX_48;
      TranscodeScheme transcodeScheme1 = TranscodeScheme.MAX_80;
      TranscodeScheme transcodeScheme2 = transcodeScheme0.strictest(transcodeScheme1);
      assertEquals(TranscodeScheme.MAX_48, transcodeScheme2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.fromMaxBitRate((-1280));
      assertEquals(TranscodeScheme.OFF, transcodeScheme0);
      
      TranscodeScheme transcodeScheme1 = TranscodeScheme.MAX_192;
      TranscodeScheme transcodeScheme2 = transcodeScheme0.strictest(transcodeScheme1);
      assertEquals(192, transcodeScheme2.getMaxBitRate());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.fromMaxBitRate((-1280));
      TranscodeScheme transcodeScheme1 = transcodeScheme0.strictest(transcodeScheme0);
      assertEquals(0, transcodeScheme1.getMaxBitRate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.MAX_48;
      TranscodeScheme transcodeScheme1 = transcodeScheme0.strictest(transcodeScheme0);
      assertEquals(TranscodeScheme.MAX_48, transcodeScheme1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TranscodeScheme transcodeScheme0 = TranscodeScheme.MAX_32;
      TranscodeScheme transcodeScheme1 = transcodeScheme0.strictest((TranscodeScheme) null);
      assertSame(transcodeScheme1, transcodeScheme0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TranscodeScheme.fromMaxBitRate(797);
  }
}