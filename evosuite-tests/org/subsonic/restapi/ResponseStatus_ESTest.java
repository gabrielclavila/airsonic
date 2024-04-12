/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:03:41 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.ResponseStatus;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResponseStatus_ESTest extends ResponseStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ResponseStatus responseStatus0 = ResponseStatus.fromValue("ok");
      assertEquals(ResponseStatus.OK, responseStatus0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ResponseStatus[] responseStatusArray0 = ResponseStatus.values();
      assertEquals(2, responseStatusArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ResponseStatus responseStatus0 = ResponseStatus.valueOf("FAILED");
      assertEquals(ResponseStatus.FAILED, responseStatus0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        ResponseStatus.fromValue("f`iled");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // f`iled
         //
         verifyException("org.subsonic.restapi.ResponseStatus", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ResponseStatus responseStatus0 = ResponseStatus.fromValue("failed");
      String string0 = responseStatus0.value();
      assertEquals("failed", string0);
  }
}