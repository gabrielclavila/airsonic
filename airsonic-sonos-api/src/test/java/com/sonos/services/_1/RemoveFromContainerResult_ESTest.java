/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:30:04 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.RemoveFromContainerResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoveFromContainerResult_ESTest extends RemoveFromContainerResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoveFromContainerResult removeFromContainerResult0 = new RemoveFromContainerResult();
      removeFromContainerResult0.updateId = "2g1Oh3*~3`XPXtxQD6";
      String string0 = removeFromContainerResult0.getUpdateId();
      assertEquals("2g1Oh3*~3`XPXtxQD6", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoveFromContainerResult removeFromContainerResult0 = new RemoveFromContainerResult();
      removeFromContainerResult0.updateId = "2g1Oh3*~3`XPXtxQD6";
      removeFromContainerResult0.updateId = "";
      String string0 = removeFromContainerResult0.getUpdateId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoveFromContainerResult removeFromContainerResult0 = new RemoveFromContainerResult();
      String string0 = removeFromContainerResult0.getUpdateId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RemoveFromContainerResult removeFromContainerResult0 = new RemoveFromContainerResult();
      removeFromContainerResult0.setUpdateId("");
      assertEquals("", removeFromContainerResult0.getUpdateId());
  }
}
