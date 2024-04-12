/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 13:34:30 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sonos.services._1.MediaUriAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MediaUriAction_ESTest extends MediaUriAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MediaUriAction mediaUriAction0 = MediaUriAction.fromValue("EXPLICIT:SKIP_BACK");
      assertEquals(MediaUriAction.EXPLICIT_SKIP_BACK, mediaUriAction0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MediaUriAction[] mediaUriActionArray0 = MediaUriAction.values();
      assertEquals(5, mediaUriActionArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MediaUriAction mediaUriAction0 = MediaUriAction.valueOf("EXPLICIT_SKIP_FORWARD");
      assertEquals(MediaUriAction.EXPLICIT_SKIP_FORWARD, mediaUriAction0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        MediaUriAction.fromValue("EXPLICIT:RKIP_FORWARD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // EXPLICIT:RKIP_FORWARD
         //
         verifyException("com.sonos.services._1.MediaUriAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MediaUriAction mediaUriAction0 = MediaUriAction.fromValue("EXPLICIT:SEEK");
      String string0 = mediaUriAction0.value();
      assertEquals("EXPLICIT:SEEK", string0);
  }
}