/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:26:21 GMT 2024
 */

package org.airsonic.player.ajax;

import org.junit.Test;
import static org.junit.Assert.*;
import org.airsonic.player.ajax.CoverArtInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CoverArtInfo_ESTest extends CoverArtInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CoverArtInfo coverArtInfo0 = new CoverArtInfo((String) null, (String) null);
      String string0 = coverArtInfo0.getImagePreviewUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoverArtInfo coverArtInfo0 = new CoverArtInfo("Nh^IskXE5", "Nh^IskXE5");
      String string0 = coverArtInfo0.getImagePreviewUrl();
      assertEquals("Nh^IskXE5", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoverArtInfo coverArtInfo0 = new CoverArtInfo((String) null, (String) null);
      String string0 = coverArtInfo0.getImageDownloadUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoverArtInfo coverArtInfo0 = new CoverArtInfo("", ",r'n");
      String string0 = coverArtInfo0.getImageDownloadUrl();
      assertEquals(",r'n", string0);
      assertEquals("", coverArtInfo0.getImagePreviewUrl());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CoverArtInfo coverArtInfo0 = new CoverArtInfo("", "");
      String string0 = coverArtInfo0.getImagePreviewUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CoverArtInfo coverArtInfo0 = new CoverArtInfo("", "");
      String string0 = coverArtInfo0.getImageDownloadUrl();
      assertEquals("", string0);
  }
}