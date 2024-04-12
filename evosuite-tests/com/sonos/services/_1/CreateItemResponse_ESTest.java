/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 12 01:46:55 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.CreateItemResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CreateItemResponse_ESTest extends CreateItemResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CreateItemResponse createItemResponse0 = new CreateItemResponse();
      createItemResponse0.createItemResult = "6i^huj-n";
      String string0 = createItemResponse0.getCreateItemResult();
      assertEquals("6i^huj-n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CreateItemResponse createItemResponse0 = new CreateItemResponse();
      createItemResponse0.setCreateItemResult("");
      String string0 = createItemResponse0.getCreateItemResult();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CreateItemResponse createItemResponse0 = new CreateItemResponse();
      String string0 = createItemResponse0.getCreateItemResult();
      assertNull(string0);
  }
}