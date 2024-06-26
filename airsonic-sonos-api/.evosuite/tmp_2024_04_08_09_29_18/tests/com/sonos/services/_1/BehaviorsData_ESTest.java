/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:31:43 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.BehaviorsData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BehaviorsData_ESTest extends BehaviorsData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BehaviorsData behaviorsData0 = new BehaviorsData();
      Boolean boolean0 = new Boolean(true);
      behaviorsData0.supportsQuickSkip = boolean0;
      Boolean boolean1 = behaviorsData0.isSupportsQuickSkip();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BehaviorsData behaviorsData0 = new BehaviorsData();
      Boolean boolean0 = Boolean.valueOf("&Mm2(up>o5ro");
      behaviorsData0.setSupportsQuickSkip(boolean0);
      Boolean boolean1 = behaviorsData0.isSupportsQuickSkip();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BehaviorsData behaviorsData0 = new BehaviorsData();
      Boolean boolean0 = behaviorsData0.isSupportsQuickSkip();
      assertNull(boolean0);
  }
}
