/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:25:50 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GetExtendedMetadata;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetExtendedMetadata_ESTest extends GetExtendedMetadata_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetExtendedMetadata getExtendedMetadata0 = new GetExtendedMetadata();
      getExtendedMetadata0.setId("wB[/R3eezO");
      String string0 = getExtendedMetadata0.getId();
      assertEquals("wB[/R3eezO", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetExtendedMetadata getExtendedMetadata0 = new GetExtendedMetadata();
      getExtendedMetadata0.id = "";
      String string0 = getExtendedMetadata0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetExtendedMetadata getExtendedMetadata0 = new GetExtendedMetadata();
      String string0 = getExtendedMetadata0.getId();
      assertNull(string0);
  }
}
