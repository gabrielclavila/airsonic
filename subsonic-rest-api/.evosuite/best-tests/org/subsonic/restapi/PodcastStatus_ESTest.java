/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 15:07:06 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.PodcastStatus;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PodcastStatus_ESTest extends PodcastStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PodcastStatus podcastStatus0 = PodcastStatus.fromValue("completed");
      assertEquals(PodcastStatus.COMPLETED, podcastStatus0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PodcastStatus[] podcastStatusArray0 = PodcastStatus.values();
      assertEquals(6, podcastStatusArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PodcastStatus podcastStatus0 = PodcastStatus.valueOf("DELETED");
      assertEquals(PodcastStatus.DELETED, podcastStatus0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PodcastStatus podcastStatus0 = PodcastStatus.fromValue("skipped");
      assertEquals(PodcastStatus.SKIPPED, podcastStatus0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        PodcastStatus.fromValue("oew");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oew
         //
         verifyException("org.subsonic.restapi.PodcastStatus", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PodcastStatus podcastStatus0 = PodcastStatus.SKIPPED;
      String string0 = podcastStatus0.value();
      assertEquals("skipped", string0);
  }
}
