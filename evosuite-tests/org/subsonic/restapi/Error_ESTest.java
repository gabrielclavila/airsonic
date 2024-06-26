/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 11 00:35:48 GMT 2024
 */

package org.subsonic.restapi;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.subsonic.restapi.Error;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Error_ESTest extends Error_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Error error0 = new Error();
      error0.message = "22{@Jw'Ld=_^#p8Ps";
      String string0 = error0.getMessage();
      assertEquals("22{@Jw'Ld=_^#p8Ps", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Error error0 = new Error();
      error0.message = "";
      String string0 = error0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Error error0 = new Error();
      error0.code = 1702;
      int int0 = error0.getCode();
      assertEquals(1702, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Error error0 = new Error();
      error0.code = 1702;
      error0.code = 1;
      error0.code = (-381);
      int int0 = error0.getCode();
      assertEquals((-381), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Error error0 = new Error();
      error0.setMessage("");
      assertEquals("", error0.getMessage());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Error error0 = new Error();
      error0.setCode(1);
      assertEquals(1, error0.getCode());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Error error0 = new Error();
      int int0 = error0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Error error0 = new Error();
      String string0 = error0.getMessage();
      assertNull(string0);
  }
}
