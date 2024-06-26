/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:51:42 GMT 2024
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
      addToContainerResult0.updateId = "";
      addToContainerResult0.setUpdateId((String) null);
      assertNull(addToContainerResult0.getUpdateId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AddToContainerResult addToContainerResult0 = new AddToContainerResult();
      addToContainerResult0.updateId = "";
      addToContainerResult0.updateId = "fgiiW3";
      String string0 = addToContainerResult0.getUpdateId();
      assertEquals("fgiiW3", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AddToContainerResult addToContainerResult0 = new AddToContainerResult();
      addToContainerResult0.updateId = "";
      String string0 = addToContainerResult0.getUpdateId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AddToContainerResult addToContainerResult0 = new AddToContainerResult();
      String string0 = addToContainerResult0.getUpdateId();
      assertNull(string0);
  }
}
