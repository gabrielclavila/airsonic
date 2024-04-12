/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:35:49 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.AddToContainerResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AddToContainerResult_ESTest extends AddToContainerResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AddToContainerResult addToContainerResult0 = new AddToContainerResult();
      addToContainerResult0.setUpdateId("\"@4-Xvt1?c7d;+k%");
      String string0 = addToContainerResult0.getUpdateId();
      assertEquals("\"@4-Xvt1?c7d;+k%", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AddToContainerResult addToContainerResult0 = new AddToContainerResult();
      addToContainerResult0.setUpdateId("");
      String string0 = addToContainerResult0.getUpdateId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AddToContainerResult addToContainerResult0 = new AddToContainerResult();
      String string0 = addToContainerResult0.getUpdateId();
      assertNull(string0);
  }
}