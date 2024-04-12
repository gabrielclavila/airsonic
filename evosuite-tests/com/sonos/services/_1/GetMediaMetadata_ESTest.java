/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:24:04 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GetMediaMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetMediaMetadata_ESTest extends GetMediaMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetMediaMetadata getMediaMetadata0 = new GetMediaMetadata();
      getMediaMetadata0.setId("Aa0M]-Dv= [<[a");
      String string0 = getMediaMetadata0.getId();
      assertEquals("Aa0M]-Dv= [<[a", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetMediaMetadata getMediaMetadata0 = new GetMediaMetadata();
      getMediaMetadata0.setId("");
      String string0 = getMediaMetadata0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetMediaMetadata getMediaMetadata0 = new GetMediaMetadata();
      String string0 = getMediaMetadata0.getId();
      assertNull(string0);
  }
}