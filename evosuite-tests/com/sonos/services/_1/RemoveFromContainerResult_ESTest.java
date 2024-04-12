/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:04:15 GMT 2024
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
      removeFromContainerResult0.updateId = "0,q/} EqXZh-BZn^";
      String string0 = removeFromContainerResult0.getUpdateId();
      assertEquals("0,q/} EqXZh-BZn^", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoveFromContainerResult removeFromContainerResult0 = new RemoveFromContainerResult();
      removeFromContainerResult0.updateId = "0,q/} EqXZh-BZn^";
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
      removeFromContainerResult0.setUpdateId("0,q/} EqXZh-BZn^");
      assertEquals("0,q/} EqXZh-BZn^", removeFromContainerResult0.getUpdateId());
  }
}