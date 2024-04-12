/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:28:11 GMT 2024
 */

package com.sonos.services._1;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sonos.services._1.GetSessionIdResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GetSessionIdResponse_ESTest extends GetSessionIdResponse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GetSessionIdResponse getSessionIdResponse0 = new GetSessionIdResponse();
      getSessionIdResponse0.setGetSessionIdResult("|Xtfp]v^:iQh9rK");
      String string0 = getSessionIdResponse0.getGetSessionIdResult();
      assertEquals("|Xtfp]v^:iQh9rK", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GetSessionIdResponse getSessionIdResponse0 = new GetSessionIdResponse();
      getSessionIdResponse0.getSessionIdResult = "";
      String string0 = getSessionIdResponse0.getGetSessionIdResult();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GetSessionIdResponse getSessionIdResponse0 = new GetSessionIdResponse();
      String string0 = getSessionIdResponse0.getGetSessionIdResult();
      assertNull(string0);
  }
}